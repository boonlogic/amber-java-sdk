/*
 * Amber API Server
 * Boon Logic Amber API server
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 */


package com.boonamber.client.api;

import com.boonamber.client.ApiException;
import com.boonamber.client.model.*;


import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.ByteBuffer;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * initializes login credentials and server information
     * uses default values for license_id, license_file, verify, and timeout variables:
     * 'default', '~/.Amber.license', false, 30 seconds (respectively)
     */
    public AmberV2Client() throws ApiException {
    	this("default", "~/.Amber.license", false, 300000);
    }
    
    /**
     * initializes login credentials and server information
     * @param license_id the json key in .Amber.license file to use for credentials
     * @param license_file path to the .Amber.license credentials file
     * uses default values for verify, and timeout variables:
     * false, 30 seconds (respectively)
     */
    public AmberV2Client(String license_id, String license_file) throws ApiException {
    	this(license_id, license_file, false, 300000);
    }
    
    /**
     * initializes login credentials and server information
     * @param license_id the json key in .Amber.license file to use for credentials
     * @param license_file path to the .Amber.license credentials file
     * @param verify boolean about the verifying the ssl cert
     * @param timeout number of milliseconds before timeout
     */
    public AmberV2Client(String license_id, String license_file, Boolean verify, int timeout) throws ApiException {
    	this.reauthTime = 0;
    	this.accessToken = "";
    	this.refreshToken = "";
    	this.server = "";
    	this.license = "";
    	this.secret = "";
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
			         if (profile == null) {
			        	 throw new ApiException(400, "not json formatted");
			         }
			      } catch (Exception e) {
			    	  throw new ApiException(400, "Amber license json file not formatted correctly");
			      }
			      
			      try {
 			         this.server = (String) profile.get("server");
 			      } catch (Exception e) {
 			    	  // no server in file but continue
 			    	  this.server = "";
 			      }
			} else {
				throw new ApiException(400, "Amber license file not found. Add the full path");
			}
		}
    	
    	String envServer = System.getenv("AMBER_V2_SERVER");
    	this.server = (envServer != null) ? envServer : this.server;
    	if (this.server != null) {
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
    	if (this.oauthServer == null) {
    		this.oauthServer = server;
    	}
    	
	    // get license from file
	    try {
	    	String envlicense = System.getenv("AMBER_V2_LICENSE_KEY");
	       this.license = (envlicense != null) ? envlicense : (String) profile.get("license");
	    } catch (Exception e) {
	    	throw new ApiException(400, "profile is missing 'license' key");
	    }
	    
	    // get license_id from file
	    try {
	       String envsecret = System.getenv("AMBER_V2_SECRET_KEY");
	       this.secret = (envsecret != null) ? envsecret : (String) profile.get("secret");
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
     * @param vectors Vectors to analyze, as a list of lists. Number of sublist values must be equal to the number of features times the streaming widnow size.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getVectorRootCause(String modelId, List<List<T>> vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	String vectorString = "[[";
    	for (int i = 0; i < vectors.size(); i++) {
    		for (int j = 0; j < vectors.get(i).size(); j++) {
    			vectorString = vectorString + String.valueOf(vectors.get(i).get(j)) + ",";
    		}
    		// remove extra comma
    		vectorString = vectorString.substring(0,vectorString.length() - 1);
    		vectorString = vectorString + "],[";
    	}
    	// remove extra ,[
    	vectorString = vectorString.substring(0,vectorString.length() - 2);
    	vectorString = vectorString + "]";
        return this.getVectorRootCause(modelId, vectorString);
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param vectors Vectors to analyze, as a flat list of comma-separated floats. Number of values must be a multiple of the configured number of features.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getVectorRootCause(String modelId, String vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.getRootCause(modelId, null, vectors);
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param vectors Vectors to analyze, as a list of lists. Number of sublist values must be equal to the number of features times the streaming widnow size.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getVectorRootCause(String modelId, int[][] vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	List<List<Integer>> arrayList = new ArrayList<>();
    	for (int i = 0; i < vectors.length; i++) {
    		arrayList.add(Arrays.stream(vectors[i]).boxed().collect(Collectors.toList()));
    	}
        return this.getVectorRootCause(modelId, arrayList);
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param vectors Vectors to analyze, as a list of lists. Number of sublist values must be equal to the number of features times the streaming widnow size.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getVectorRootCause(String modelId, long[][] vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	List<List<Long>> arrayList = new ArrayList<>();
    	for (int i = 0; i < vectors.length; i++) {
    		arrayList.add(Arrays.stream(vectors[i]).boxed().collect(Collectors.toList()));
    	}
        return this.getVectorRootCause(modelId, arrayList);
    }
   
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param vectors Vectors to analyze, as a list of lists. Number of sublist values must be equal to the number of features times the streaming widnow size.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getVectorRootCause(String modelId, double[][] vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	List<List<Double>> arrayList = new ArrayList<>();
    	for (int i = 0; i < vectors.length; i++) {
    		arrayList.add(Arrays.stream(vectors[i]).boxed().collect(Collectors.toList()));
    	}
        return this.getVectorRootCause(modelId, arrayList);
    }
   
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param vectors Vectors to analyze, as a list of lists. Number of sublist values must be equal to the number of features times the streaming widnow size.
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getVectorRootCause(String modelId, float[][] vectors) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	List<List<Float>> arrayList = new ArrayList<>();
    	for (int i = 0; i < vectors.length; i++) {
    		List<Float> floatList = new ArrayList<>();
    		for (int j = 0; i < vectors[i].length; i++) {
                floatList.add(vectors[i][j]);
            }
    		arrayList.add(floatList);
    	}
        return this.getVectorRootCause(modelId, arrayList);
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters List of cluster ids to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, List<T> clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	String clusterString = clusters.toString();
        return this.getClusterRootCause(modelId, clusterString);
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters List of cluster ids to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, int[] clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	return this.getClusterRootCause(modelId, Arrays.stream(clusters).boxed().collect(Collectors.toList()));
    	
    }
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters List of cluster ids to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, long[] clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	return this.getClusterRootCause(modelId, Arrays.stream(clusters).boxed().collect(Collectors.toList()));
    	
    }
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters List of cluster ids to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, double[] clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	return this.getClusterRootCause(modelId, Arrays.stream(clusters).boxed().collect(Collectors.toList()));
    	
    }
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters List of cluster ids to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, float[] clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	List<Float> floatList = new ArrayList<>();
        for (int i = 0; i < clusters.length; i++) {
            floatList.add(clusters[i]);
        }
    	return this.getClusterRootCause(modelId, floatList);
    	
    }
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters Clusters to analyze
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> GetRootCauseResponse getClusterRootCause(String modelId, T clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	if (!clusters.getClass().isArray()) {
    		String clusterString = "[" + String.valueOf(clusters) + "]";
            return this.getClusterRootCause(modelId, clusterString);
    	} else {
    		throw new ApiException("invalid type");
    	}
    	
    }
    
    /**
     * perform root cause analysis
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     * @param modelId  (required)
     * @param clusters Clusters to analyze separated by commas and bracketed by square brackets
     * @return GetRootCauseResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRootCauseResponse getClusterRootCause(String modelId, String clusters) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.getRootCause(modelId, clusters, null);
    }
    
    private GetRootCauseResponse getRootCause(String modelId, String clusters, String vectors) throws ApiException {
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
     * Return metadata for all models belonging to the user.
     * @return GetModelsResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetModelsResponse getModels() throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        return this.api.getModels();
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
     * Get current nano status of the model
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
     * Return diagnostic files from the API.
     * @param modelId (required)
     * @return File diagnostic tar file
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
     * Return diagnostic files from the API.
     * @param modelId (required)
     * @param filepath path to save the diagnostic images
     * @return File diagnostic tar file
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDiagnostics(String modelId, String filepath) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
        File responseFile = this.api.getModelDiagnostic(modelId);
        File diagnosticFile = new File(filepath);
        
        try {
            Files.move(responseFile.toPath(), diagnosticFile.toPath());
        } catch (Exception E) {
        	throw new ApiException("diagnostic file not saved correctly: " + E.getMessage());
        }
        
        return diagnosticFile;
    }

    /**
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
     * Call this to migrate a v1 sensor to a v2 model
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
     * Pretrain model with an existing dataset
     * @param modelId  (required)
     * @param comma separated data to use for pretraining. (required)
     * @param chunkSize number of bytes to send at a time
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostPretrainResponse postPretrain(String modelId, String data, int chunkSize, Boolean block) throws ApiException {
    	String[] dataStrings = data.split(",");
    	Float[] dataFloats = new Float[dataStrings.length];
    	for (int i = 0; i < dataStrings.length; i++) {
    		dataFloats[i] = Float.valueOf(dataStrings[i]);
    	}
    	List<Float> dataList = Arrays.asList(dataFloats);
    	return postPretrain(modelId, dataList, chunkSize, block);
    }
    
    /**
     * pretrain model with an existing dataset
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostPretrainResponse postPretrain(String modelId, String data, Boolean block) throws ApiException {
    	String[] dataStrings = data.split(",");
    	Float[] dataFloats = new Float[dataStrings.length];
    	for (int i = 0; i < dataStrings.length; i++) {
    		dataFloats[i] = Float.valueOf(dataStrings[i]);
    	}
    	List<Float> dataList = Arrays.asList(dataFloats);
    	return postPretrain(modelId, dataList, 4000000, block);
    }
    
    /**
     * pretrain model with an existing dataset
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> PostPretrainResponse postPretrain(String modelId, int[] data, Boolean block) throws ApiException {
    	return postPretrain(modelId, Arrays.stream(data).boxed().collect(Collectors.toList()), 4000000, block);
    }
    /**
     * pretrain model with an existing dataset
     * 
     * @param modelId  (required)
     * @param data list of data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> PostPretrainResponse postPretrain(String modelId, double[] data, Boolean block) throws ApiException {
    	return postPretrain(modelId, Arrays.stream(data).boxed().collect(Collectors.toList()), 4000000, block);
    }
    /**
     * pretrain model with an existing dataset
     * 
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> PostPretrainResponse postPretrain(String modelId, long[] data, Boolean block) throws ApiException {
    	return postPretrain(modelId, Arrays.stream(data).boxed().collect(Collectors.toList()), 4000000, block);
    }
    /**
     * pretrain model with an existing dataset
     * 
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T> PostPretrainResponse postPretrain(String modelId, float[] data, Boolean block) throws ApiException {
    	List<Float> floatList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            floatList.add(data[i]);
        }
    	return postPretrain(modelId, floatList, 4000000, block);
    }
    
    /**
     * pretrain model with an existing dataset
     * 
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * uses default chunksize: 4000000 samples
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T extends Number> PostPretrainResponse postPretrain(String modelId, List<T> data, Boolean block) throws ApiException {
    	return postPretrain(modelId, data, 4000000, block);
    }
    
    /**
     * pretrain model with an existing dataset
     * @param modelId  (required)
     * @param data to use for pretraining. (required)
     * @param chunkSize number of bytes to send at a time
     * @param block whether or not to wait until pretraining is finished (cloud only)
     * @return PostPretrainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public <T extends Number> PostPretrainResponse postPretrain(String modelId, List<T> data, int chunkSize, Boolean block) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	
    	ByteBuffer buff = ByteBuffer.allocate(4 * data.size());
        for (int i = 0; i < data.size(); i++) {
          float amplitude = (float)data.get(i); 
          buff.putFloat(amplitude);
        }
        byte[] dataBytes = buff.array();
        
        PostPretrainRequest body = new PostPretrainRequest();
        PostPretrainRequest.FormatEnum format = PostPretrainRequest.FormatEnum.PACKED_FLOAT;
        body.setFormat(format);
        
        int numChunks = (int)(dataBytes.length / chunkSize);
        if (dataBytes.length % chunkSize != 0) {
        	numChunks++;
        }
        
        String txnID = "";
        PostPretrainResponse response = null;
        String chunkSpec = "";
        for (int chunk = 0; chunk < numChunks; chunk++) {
        	// create chunk specifier, .ie 1:3, 2:3, 3:3
        	chunkSpec = String.valueOf(chunk + 1) + ":" + String.valueOf(numChunks);
        	
        	// construct next chunk
        	int start = chunk * chunkSize;
        	int end = start + chunkSize;
        	if (end > dataBytes.length) {
        		end = dataBytes.length;
        	} 
        	byte[] subDataArray = Arrays.copyOfRange(dataBytes, start, end);
        	String dataString = Base64.getEncoder().encodeToString(subDataArray);
        	body.setData(dataString);
        	
        	try {
    	        response = this.api.postModelPretrain(modelId, body, chunkSpec, txnID);
    	        
    	        txnID = response.getTxnId();
            } catch (Exception e) {
            	throw new ApiException(e.getMessage());
            }
        }
                
        // if not blocking, return pretrain response
        // or if it is not in pretraining (aka done or error) return response
        if (!block || response.getStatus().getValue().compareTo("Pretraining") != 0) {
        	return response;
        }
        
        GetPretrainResponse getResponse = null;
        while (response.getStatus().getValue().equals("Pretraining")) {
        	// sleep
        	try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				throw new ApiException(e.getMessage());
			}
        	getResponse = this.getPretrain(modelId);
        }
        String status = getResponse.getStatus().getValue();
        response.setStatus(PostPretrainResponse.StatusEnum.fromValue(status));
        response.setMessage(getResponse.getMessage());
        
        return response;
    }

    /**
     * Update learning configuration for the specified model and turn on model learning.
     * @param modelId  (required)
     * @param postLearningRequest updates to apply (required)
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
     * Turn on model learning
     * @param modelId  (required)
     * @return PostLearningResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostLearningResponse enableLearning(String modelId) throws ApiException {
    	try {
    		authenticate();
    	} catch (ApiException e) {
    		throw new ApiException(e);
    	}
    	PostLearningRequest postLearningRequest = null;
        return this.api.postModelLearning(modelId, postLearningRequest);
    }

    /**
     * Update fusion vector and get back results
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
