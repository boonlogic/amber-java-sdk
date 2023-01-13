/*
 * Amber API Server
 * Boon Logic Amber API server
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openapitools.client.model.Config;
import org.openapitools.client.model.ConfigResponse;
import org.openapitools.client.model.FeatureBlame;
import org.openapitools.client.model.GetDataResponse;
import org.openapitools.client.model.GetUsageResponse;
import org.openapitools.client.model.Model;
import org.openapitools.client.model.ModelStatus;
import org.openapitools.client.model.PostDataRequest;
import org.openapitools.client.model.PostDataResponse;
import org.openapitools.client.model.PostModelRequest;
import org.openapitools.client.model.PostOauth2AccessRequest;
import org.openapitools.client.model.PostOauth2AccessResponse;
import org.openapitools.client.model.PostOauth2RefreshRequest;
import org.openapitools.client.model.PostOauth2RefreshResponse;
import org.openapitools.client.model.PostPretrainRequest;
import org.openapitools.client.model.PostPretrainResponse;
import org.openapitools.client.model.PretrainStatus;
import org.openapitools.client.model.PutConfigRequest;
import org.openapitools.client.model.PutDataRequest;
import org.openapitools.client.model.PutDataResponse;
import org.openapitools.client.model.PutModelRequest;
import org.openapitools.client.model.Version;

import java.time.Instant;
import java.util.List;

public class AmberClient {
    private long reauthTime;
    private String refreshToken;
    private DefaultApi api;
    private String license_id;
    private String license_file;

    public AmberClient() throws Exception {
    	this("default", "~/.Amber.license", false, 300000);
    }
    
    public AmberClient(String license_id, String license_file) throws Exception {
    	this(license_id, license_file, false, 300000);
    }
    
    public AmberClient(String license_id, String license_file, Boolean verify, int timeout) throws Exception{
    	this.reauthTime = 0;
    	this.api = new DefaultApi();
    	
    	this.api.getApiClient().setConnectTimeout(timeout);
    	this.api.getApiClient().setVerifyingSsl(verify);
    	
    	String license_identifier = System.getenv("AMBER_LICENSE_ID");
    	this.license_id = (license_identifier == null) ? license_id : license_identifier;
    	
    	String license_path = System.getenv("AMBER_LICENSE_FILE");
    	this.license_file = (license_path == null) ? license_file : license_path;
    	
    	// check verify env TODO
//    	String envVerify = System.getenv("AMBER_SSL_VERIFY");
//    	String tmp_verify = (envVerify != null) ? envVerify : verify;
//    	localVarApiClient.setVerifyingSsl(verify);
    	
    	this.api.getApiClient().addDefaultHeader("Content-Type", "application/json");
    }
    
    private String[] loadAuthValues() throws Exception {
    	String[] auth = new String[2];
    	auth[0] = auth[1] = auth[2] = "";
    	try {
    		if (this.license_file != null) {
    			File f = new File(this.license_file);
    			if (f.exists()) {
    				JSONParser parser = new JSONParser();
    			      try {
    			         Object obj = parser.parse(new FileReader(this.license_file));
    			         JSONObject jsonObject = (JSONObject)obj;
    			         JSONObject profile = (JSONObject) jsonObject.get(this.license_id);
    			         
    			         auth[0] = (String) profile.get("license");
    			         auth[1] = (String) profile.get("secret");
    			         auth[2] = (String) profile.get("server");
    			     	 this.api.getApiClient().setBasePath(auth[2]);
    			      } catch (Exception e) {
    			    	  // something went wrong but continue
    			      }
    			} else {
    				throw new Exception("Amber license file not found");
    			}
    		}
    	} catch (Exception e) {
    		
    	}
    	
    	// override env variables
    	String envLicense = System.getenv("AMBER_LICENSE");
    	auth[0] = (envLicense != null) ? envLicense : auth[0];
    	
    	String envSecret = System.getenv("AMBER_SECRET");
    	auth[1] = (envSecret != null) ? envSecret : auth[1];
    	
    	String envServer = System.getenv("AMBER_SERVER");
    	auth[2] = (envServer != null) ? envServer : auth[2];
    	this.api.getApiClient().setBasePath(auth[2]);
    	
    	if (auth[0] == "") {
    		throw new Exception("license not specified");
    	}
    	if (auth[1] == "") {
    		throw new Exception("secret not specified");
    	}
    	if (auth[2] == "") {
    		throw new Exception("server not specified");
    	}
    	
    	return auth;
    }
    
    private long timeNow() {
    	long unixTimestamp = Instant.now().getEpochSecond();
    	return unixTimestamp;
    }
    
    private void authenticate() throws ApiException {
    	try {
    		this.authenticate(false);
    	} catch (Exception e) {
    		throw new ApiException(e);
    	}
    }
    
    private void authenticate(Boolean force) throws ApiException {
    	if (!force && this.timeNow() <= this.reauthTime) {
    		return; //not yet
    	}
    	
    	String token;
    	String expiresIn;
    	
    	// try to refresh the api token using the refresh token
    	PostOauth2RefreshRequest refreshBody = new PostOauth2RefreshRequest();
    	refreshBody.setRefreshToken(this.refreshToken);
    	ApiResponse<PostOauth2RefreshResponse> refreshResponse;
    	try {
    		refreshResponse = this.api.postOauth2RefreshWithHttpInfo(refreshBody);    	
    	} catch (Exception e) {
    		throw new ApiException(e);
    	}
    	
    	// refresh token has expired so need to access oauth again
    	String[] auth = new String[2];
    	if (refreshResponse.getStatusCode() >= 200) {
    		// load license and secret from file
    		try {
    			auth = loadAuthValues();
    		} catch (Exception e) {
    			throw new ApiException(e);
    		}
    		
    		// access new oauth for new api and refresh token
    		PostOauth2AccessRequest accessBody = new PostOauth2AccessRequest();
    		accessBody.setLicenseId(auth[0]);
    		accessBody.setSecretKey(auth[1]);
        	PostOauth2AccessResponse accessResponse;
        	try {
        		accessResponse = this.api.postOauth2Access(accessBody);    	
        	} catch (Exception e) {
        		throw new ApiException(e);
        	}
        	
        	// save the api and refresh token
        	this.refreshToken = accessResponse.getRefreshToken();
        	token = accessResponse.getIdToken();
        	expiresIn = accessResponse.getExpiresIn();
    		
    	// refresh token is still valid so update the api token and expiration
    	} else {
	    	token = refreshResponse.getData().getIdToken();
	    	expiresIn = refreshResponse.getData().getExpiresIn();
    	}
    	
    	// validate that the token and expiration are not null
    	if (token == null) {
    		throw new ApiException(401, "Authentication failed: invalid credentials");
    	}
    	if (expiresIn == null) {
    		throw new ApiException(401, "Authentication failed: invalid expiration time");
    	}
    	
    	// set new reauth time
		long expiresInNum = new Long(expiresIn);
		this.reauthTime = timeNow() + expiresInNum - 60;
		
		// update auth token
		this.api.getApiClient().setApiKey(token);
    }

    /**
     * delete a model
     * Permanently delete the specified model.
     * @param modelId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteModel(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        this.api.deleteModel(modelId);
    }

    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters Clusters to analyze (list of comma-separated integers). (optional)
     * @param vectors Vectors to analyze, as a flat list of comma-separated floats. Number of values must be a multiple of the configured number of features. (optional)
     * @return List&lt;FeatureBlame&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FeatureBlame> getBlame(String modelId, String clusters, String vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getBlame(modelId, clusters, vectors);
    }

    /**
     * get model configuration
     * Get the configuration of the specified model.
     * @param modelId  (required)
     * @return ConfigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfigResponse getConfig(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getConfig(modelId);
    }

    /**
     * get the current fusion vector
     * 
     * @param modelId  (required)
     * @return GetDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDataResponse getData(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getData(modelId);
    }

    /**
     * get model metadata
     * Return metadata for the specified model.
     * @param modelId  (required)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model getModel(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModel(modelId);
    }

    /**
     * list all models
     * Return &#x60;id&#x60; and &#x60;label&#x60; for all models belonging to the user.
     * @param verbose If &#x60;true&#x60;, include full model metadata. (optional)
     * @return List&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Model> getModels(String verbose) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModels(verbose);
    }

    /**
     * get pretraining progress
     * Get the pretraining status of the specified model.
     * @param modelId  (required)
     * @return PretrainStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PretrainStatus getPretrain(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getPretrain(modelId);
    }

    /**
     * get current status of the model
     * Get the current state and learning progress of the specified model.
     * @param modelId  (required)
     * @return ModelStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelStatus getStatus(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getStatus(modelId);
    }

    /**
     * get model usage metrics
     * Return usage metrics for the specified model.
     * @param modelId  (required)
     * @return GetUsageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUsageResponse getUsage(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getUsage(modelId);
    }

    /**
     * get version information
     * Return version information for the API.
     * @return Version
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Version getVersion() throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getVersion();
    }

    /**
     * configure a model
     * Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.
     * @param modelId  (required)
     * @param postConfigRequest configuration to apply (optional)
     * @return ConfigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfigResponse postConfig(String modelId, Config postConfigRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postConfig(modelId, postConfigRequest);
    }

    /**
     * send data to model and get back results
     * Send data to the specified model, and get back the resulting analytics and model status.
     * @param modelId  (required)
     * @param postDataRequest data vector or vectors as a flattened list of comma-separated values (required)
     * @return PostDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostDataResponse postData(String modelId, PostDataRequest postDataRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postData(modelId, postDataRequest);
    }

    /**
     * create a model
     * Create a new model and return its unique identifier.
     * @param postModelRequest initial metadata for new model (required)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model postModel(PostModelRequest postModelRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postModel(postModelRequest);
    }
 
    /**
     * request an API token given license and secret key
     * Request an Oauth2 Bearer token.
     * @param postOauth2AccessRequest Amber account credentials (required)
     * @return PostOauth2AccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostOauth2AccessResponse postOauth2Access(PostOauth2AccessRequest postOauth2AccessRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postOauth2Access(postOauth2AccessRequest);
    }

    /**
     * request an API token given a refresh token
     * Request an Oauth2 Bearer token.
     * @param postOauth2RefreshRequest Amber account credentials (required)
     * @return PostOauth2RefreshResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostOauth2RefreshResponse postOauth2Refresh(PostOauth2RefreshRequest postOauth2RefreshRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postOauth2Refresh(postOauth2RefreshRequest);
    }

    /**
     * call this after a data outage before resuming streaming
     * Resets the streaming window generated by &#x60;streamingWindow&#x60;. This endpoint should be called after a data outage before resuming streaming.
     * @param modelId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postOutage(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        this.api.postOutage(modelId);
    }

    /**
     * pretrain model with an existing dataset
     * 
     * @param modelId  (required)
     * @param postPretrainRequest Data to use for pretraining. (required)
     * @param chunkspec Chunk specifier for chunked uploads. In a chunked upload, each request is sent with a &#x60;chunkspec&#x60; of the form &#x60;1:3&#x60;, &#x60;2:10&#x60;, &#x60;7:7&#x60;, etc. where the first number is the index for the chunk being uploaded (1-based) and the second number is the total number of chunks in the transaction. The chunks may be uploaded in any order. Pretraining starts once all chunks have been received. (optional)
     * @param token Transaction token for chunked uploads. The response body for the first request in a chunked upload will contain a &#x60;token&#x60; which uniquely identifies the chunking transaction across multiple requests. That &#x60;token&#x60; must be included in the header of all remaining chunks uploaded in the transaction. (optional)
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostPretrainResponse postPretrain(String modelId, PostPretrainRequest postPretrainRequest, String chunkspec, String token) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postPretrain(modelId, postPretrainRequest, chunkspec, token);
    }

    /**
     * update model configuration
     * Update configuration for the specified model.
     * @param modelId  (required)
     * @param putConfigRequest updates to apply (required)
     * @return ConfigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfigResponse putConfig(String modelId, PutConfigRequest putConfigRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.putConfig(modelId, putConfigRequest);
    }

    /**
     * update fusion vector and get back results
     * 
     * @param modelId  (required)
     * @param putDataRequest updates to the fusion vector (required)
     * @return PutDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PutDataResponse putData(String modelId, PutDataRequest putDataRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.putData(modelId, putDataRequest);
    }

    /**
     * update model metadata
     * Update metadata for the specified model.
     * @param modelId  (required)
     * @param putModelRequest updates to apply (required)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model putModel(String modelId, PutModelRequest putModelRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.putModel(modelId, putModelRequest);
    }
}