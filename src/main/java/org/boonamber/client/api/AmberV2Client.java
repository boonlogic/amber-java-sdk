/*
 * Amber API Server
 * Boon Logic Amber API server
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 */


package org.boonamber.client.api;

import org.boonamber.client.ApiException;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.boonamber.client.model.PostConfigRequest;
import org.boonamber.client.model.PostConfigResponse;
import org.boonamber.client.model.GetRootCauseResponse;
import org.boonamber.client.model.PostModelResponse;
import org.boonamber.client.model.GetModelsResponse;
import org.boonamber.client.model.GetStatusResponse;
import org.boonamber.client.model.GetNanoStatusResponse;
import org.boonamber.client.model.GetVersionResponse;
import org.boonamber.client.model.PostDataRequest;
import org.boonamber.client.model.PostDataResponse;
import org.boonamber.client.model.PostModelRequest;
import org.boonamber.client.model.PostOauth2AccessRequest;
import org.boonamber.client.model.PostOauth2AccessResponse;
import org.boonamber.client.model.PostOauth2RefreshRequest;
import org.boonamber.client.model.PostOauth2RefreshResponse;
import org.boonamber.client.model.PostPretrainRequest;
import org.boonamber.client.model.PostPretrainResponse;
import org.boonamber.client.model.GetPretrainResponse;
import org.boonamber.client.model.PostLearningRequest;
import org.boonamber.client.model.PostLearningResponse;
import org.boonamber.client.model.PutDataRequest;
import org.boonamber.client.model.PutDataResponse;
import org.boonamber.client.model.PutModelRequest;

import java.time.Instant;
//import java.util.List;

public class AmberV2Client {
    public long reauthTime;
    public String refreshToken;
    private String accessToken;
    private DefaultApi api;
    private String license_id;
    private String license_file;
    public String server;
    public String oauthServer;
    private String license;
    private String secret;

    public AmberV2Client() throws ApiException {
    	this("default", "~/.Amber.license", false, 300000);
    }
    
    public AmberV2Client(String license_id, String license_file) throws ApiException {
    	this(license_id, license_file, false, 300000);
    }
    
    public AmberV2Client(String license_id, String license_file, Boolean verify, int timeout) throws ApiException {
    	this.reauthTime = 0;
    	this.accessToken = "";
    	this.refreshToken = "";
    	this.server = "";
    	this.oauthServer = "";
    	this.api = new DefaultApi();
    	
    	this.api.getApiClient().setConnectTimeout(timeout);
    	this.api.getApiClient().setVerifyingSsl(verify);
    	
    	String license_identifier = System.getenv("AMBER_V2_LICENSE_ID");
    	this.license_id = (license_identifier == null) ? license_id : license_identifier;
    	
    	String license_path = System.getenv("AMBER_V2_LICENSE_FILE");
    	this.license_file = (license_path == null) ? license_file : license_path;
    	// java doesn't know what tilda means
    	this.license_file = this.license_file.replaceFirst("^~", System.getProperty("user.home"));
    	
		JSONParser parser = new JSONParser();
    	JSONObject profile = new JSONObject();
		if (this.license_file != null) {
			File f = new File(this.license_file);
			if (f.exists()) {
			      try {
			         Object obj = parser.parse(new FileReader(this.license_file));
			         JSONObject jsonObject = (JSONObject)obj;
			         profile = (JSONObject) jsonObject.get(this.license_id);
			      } catch (Exception e) {
			    	  throw new ApiException(400, "Amber license json file not formatted correctly");
			      }
			      
			      try {
 			         this.server = (String) profile.get("server");
 			      } catch (Exception e) {
 			    	  // no server in file but continue
 			      }
			} else {
				throw new ApiException(400, "Amber license file not found");
			}
		}
    	
    	String envServer = System.getenv("AMBER_V2_SERVER");
    	this.server = (envServer != null) ? envServer : this.server;
    	if (this.server != "") {
    		this.api.getApiClient().setBasePath(server);
    	} else {
    		throw new ApiException(400, "server not set: add 'server' key to license file or set AMBER_V2_SERVER environment variable");
    	}
    	
    	// oauth server
    	try {
    		this.oauthServer = (String) profile.get("oauth-server");
    	} catch (Exception e) {
    		// do nothing because if not set, will just use given server
    	}
    	String envOauth = System.getenv("AMBER_V2_OAUTH_SERVER");
    	this.oauthServer = (envOauth != null) ? envOauth : this.oauthServer;
    	if (this.oauthServer == "") {
    		this.oauthServer = server;
    	}
    	
	    // get license from file
	    try {
	       this.license = (String) profile.get("license");
	    } catch (Exception e) {
	    	throw new ApiException(400, "profile is missing 'license' key");
	    }
	    
	    // get license_id from file
	    try {
	       this.secret = (String) profile.get("secret");
	    } catch (Exception e) {
	    	throw new ApiException(400, "profile is missing 'secret' key");
	    }
    	
    	// check verify env
//    	String envVerify = System.getenv("AMBER_SSL_VERIFY");
//    	String tmp_verify = (envVerify != null) ? envVerify : verify;
//    	localVarApiClient.setVerifyingSsl(verify);
    	
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
    
    @SuppressWarnings("removal")
	private void authenticate(Boolean force) throws ApiException {
    	if (!force && this.timeNow() <= this.reauthTime) {
    		return; //not yet
    	}
    	
    	this.api.getApiClient().setBasePath(this.oauthServer);
    	try {
    		if (this.accessToken == "") {
    			// access new oauth for new api and refresh token
        		PostOauth2AccessRequest accessBody = new PostOauth2AccessRequest();
        		accessBody.setLicenseId(this.license);
        		accessBody.setSecretKey(this.secret);
            	
            	PostOauth2AccessResponse accessResponse = this.api.postOauth2Access(accessBody);
            	this.accessToken = accessResponse.getIdToken();
            	this.refreshToken = accessResponse.getRefreshToken();
            	this.reauthTime = new Long(accessResponse.getExpiresIn());
            	this.secret = "";
    		} else {
    			// authenticated once so now can just refresh
        		PostOauth2RefreshRequest accessBody = new PostOauth2RefreshRequest();
        		accessBody.setRefreshToken(this.refreshToken);
            	PostOauth2RefreshResponse accessResponse = this.api.postOauth2Refresh(accessBody);
            	this.accessToken = accessResponse.getIdToken();
            	this.refreshToken = accessResponse.getRefreshToken();
            	this.reauthTime = new Long(accessResponse.getExpiresIn());
    		}
    		
    	} catch (Exception e) {
    		this.api.getApiClient().setBasePath(this.server);
    		throw new ApiException(401, "Authentication failed: invalid credentials");
    	}
    	this.api.getApiClient().setBasePath(this.server);
    	
    	// set new reauth time
		this.reauthTime = timeNow() + this.reauthTime - 60;
		
		// update auth token
		this.api.getApiClient().setApiKeyPrefix("Bearer");
		this.api.getApiClient().setApiKey(this.accessToken);
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
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getRootCause(String modelId, String clusters, String vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelRootCause(modelId, clusters, vectors);
    }

    /**
     * get model configuration
     * Get the configuration of the specified model.
     * @param modelId  (required)
     * @return PostConfigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostConfigResponse getConfig(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelConfig(modelId);
    }

    /**
     * get model metadata
     * Return metadata for the specified model.
     * @param modelId  (required)
     * @return PostModelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostModelResponse getModel(String modelId) throws ApiException {
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
     * @return GetModelsResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetModelsResponse getModels() throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModels("false");
    }

    /**
     * get pretraining progress
     * Get the pretraining status of the specified model.
     * @param modelId  (required)
     * @return GetPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPretrainResponse getPretrain(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelPretrain(modelId);
    }

    
    /**
     * get current nano status of the model
     * Get the current nano state of the specified model.
     * @param modelId  (required)
     * @return GetNanoStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetNanoStatusResponse getNanoStatus(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelNanoStatus(modelId);
    }
    
    /**
     * get current status of the model
     * Get the current state and learning progress of the specified model.
     * @param modelId  (required)
     * @return GetStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetStatusResponse getStatus(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelStatus(modelId);
    }

    /**
     * get version information
     * Return version information for the API.
     * @return GetVersionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetVersionResponse getVersion() throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getVersion();
    }
    
    /**
     * get diagnostic information
     * Return diagnostic files from the API.
     * @return File diagnostic files
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDiagnostics(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModelDiagnostic(modelId);
    }

    /**
     * configure a model
     * Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.
     * @param modelId  (required)
     * @param postConfigRequest configuration to apply (optional)
     * @return PostConfigResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostConfigResponse postConfig(String modelId, PostConfigRequest postConfigRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postModelConfig(modelId, postConfigRequest);
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
        return this.api.postModelData(modelId, postDataRequest);
    }

    /**
     * create a model
     * Create a new model and return its unique identifier.
     * @param postModelRequest initial metadata for new model (required)
     * @return PostModelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostModelResponse postModel(PostModelRequest postModelRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postModel(postModelRequest);
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
        this.api.postModelOutage(modelId);
    }
    
    /**
     * call this to migrate a v1 sensor to a v2 model
     * @param modelIdV1  (required)
     * @return PostModelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostModelResponse migrateModel(String modelIdV1) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postModelMigrate(modelIdV1);
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
        return this.api.postModelPretrain(modelId, postPretrainRequest, chunkspec, token);
    }

    /**
     * update model configuration
     * Update configuration for the specified model.
     * @param modelId  (required)
     * @param putConfigRequest updates to apply (required)
     * @return PostLearningResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostLearningResponse enableLearning(String modelId, PostLearningRequest postLearningRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.postModelLearning(modelId, postLearningRequest);
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
        return this.api.putModelData(modelId, putDataRequest);
    }

    /**
     * update model metadata
     * Update metadata for the specified model.
     * @param modelId  (required)
     * @param putModelRequest updates to apply (required)
     * @return PostModelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostModelResponse putModel(String modelId, PutModelRequest putModelRequest) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.putModel(modelId, putModelRequest);
    }
}
