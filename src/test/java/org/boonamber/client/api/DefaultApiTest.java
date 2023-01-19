/*
 * Amber API Server
 * Boon Logic Amber API server
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.boonamber.client.api;

import org.boonamber.client.ApiException;
import org.boonamber.client.model.Config;
import org.boonamber.client.model.ConfigResponse;
import org.boonamber.client.model.Error;
import org.boonamber.client.model.FeatureRootCause;
import org.boonamber.client.model.GetDataResponse;
import org.boonamber.client.model.GetUsageResponse;
import org.boonamber.client.model.Model;
import org.boonamber.client.model.ModelStatus;
import org.boonamber.client.model.PostDataRequest;
import org.boonamber.client.model.PostDataResponse;
import org.boonamber.client.model.PostModelRequest;
import org.boonamber.client.model.Model;
import org.boonamber.client.model.PostOauth2AccessRequest;
import org.boonamber.client.model.PostOauth2AccessResponse;
import org.boonamber.client.model.PostOauth2RefreshRequest;
import org.boonamber.client.model.PostOauth2RefreshResponse;
import org.boonamber.client.model.PostPretrainRequest;
import org.boonamber.client.model.PostPretrainResponse;
import org.boonamber.client.model.PretrainStatus;
import org.boonamber.client.model.PostLearningRequest;
import org.boonamber.client.model.PutDataRequest;
import org.boonamber.client.model.PutDataResponse;
import org.boonamber.client.model.PutModelRequest;
import org.boonamber.client.model.Version;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final AmberClient api = new AmberClient();
    
//    private String modelId = "";
//    
//    @BeforeEach
//    String setUp() {
//        PostModelRequest postModelRequest = new PostModelRequest();
//        postModelRequest.setLabel("test-123");
//        Model response = null;
//        try {
//        	response = api.postModel(postModelRequest);
//        } catch (ApiException e) {
//        	Assertions.assertTrue(false);
//        }
//        Assertions.assertEquals(postModelRequest.getLabel(), "test-123");
//        this.modelId = response.getId();
//        return this.modelId;
//    }
//    
//    @AfterEach
//    void teardown() {
//        try {
//        	api.deleteModel(this.modelId);
//        } catch (ApiException e) {
//        	Assertions.assertTrue(false);
//        }
//    }

    /**
     * delete a model
     *
     * Permanently delete the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
    	// validate null input
        String modelId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.deleteModel(modelId);
        	}, "deleteModel accepted null modelId");
    }

    /**
     * perform root cause analysis
     *
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     *
     * @throws ApiException if the Api call fails
     */
    @Disabled
    @Test
    public void getRootCauseTest() throws ApiException {
        String modelId = null;
        String clusters = null;
        String vectors = null;
//        List<FeatureRootCause> response = api.getRootCause(modelId, clusters, vectors);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getRootCause(modelId, clusters, vectors);
        	}, "getRootCause accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getRootCause("nothing-model", clusters, vectors);
        	}, "getRootCause accepted null clusters");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getRootCause("nothing-model", "1,2", vectors);
        	}, "getRootCause accepted null vectors");
    }

    /**
     * get model configuration
     *
     * Get the configuration of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        String modelId = null;
//        ConfigResponse response = api.getConfig(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getConfig(modelId);
        	}, "getConfig accepted null modelId");
    }

    /**
     * get model metadata
     *
     * Return metadata for the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelTest() throws ApiException {
        String modelId = null;
//        Model response = api.getModel(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getModel(modelId);
        	}, "getModel accepted null modelId");
        
    }

    /**
     * list all models
     *
     * Return &#x60;id&#x60; and &#x60;label&#x60; for all models belonging to the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelsTest() throws ApiException {
        String verbose = null;
//        List<Model> response = api.getModels(verbose);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getModels(verbose);
        	}, "getModels accepted null verbose");
    }

    /**
     * get pretraining progress
     *
     * Get the pretraining status of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPretrainTest() throws ApiException {
        String modelId = null;
//        PretrainStatus response = api.getPretrain(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getPretrain(modelId);
        	}, "getPretrain accepted null modelId");
    }

    /**
     * get current status of the model
     *
     * Get the current state and learning progress of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String modelId = null;
//        ModelStatus response = api.getStatus(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getStatus(modelId);
        	}, "getStatus accepted null modelId");
    }

    /**
     * get model usage metrics
     *
     * Return usage metrics for the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsageTest() throws ApiException {
        String modelId = null;
//        GetUsageResponse response = api.getUsage(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getUsage(modelId);
        	}, "getUsage accepted null modelId");
    }

    /**
     * get version information
     *
     * Return version information for the API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        Version response = api.getVersion();
        Assertions.assertNotNull(response.getBuilder());
        Assertions.assertNotNull(response.getNanoSecure());
        Assertions.assertNotNull(response.getExpertApi());
        Assertions.assertNotNull(response.getExpertCommon());
    }

    /**
     * configure a model
     *
     * Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigTest() throws ApiException {
        String modelId = null;
        Config postConfigRequest = null;
//        ConfigResponse response = api.postConfig(modelId, postConfigRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postConfig(modelId, postConfigRequest);
        	}, "postConfig accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postConfig("nothing-model", postConfigRequest);
        	}, "postConfig accepted null postConfigRequest");
    }

    /**
     * send data to model and get back results
     *
     * Send data to the specified model, and get back the resulting analytics and model status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDataTest() throws ApiException {
        String modelId = null;
        PostDataRequest postDataRequest = null;
//        PostDataResponse response = api.postData(modelId, postDataRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postData(modelId, postDataRequest);
        	}, "postData accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postData("nothing-model", postDataRequest);
        	}, "postData accepted null postDataRequest");
    }

    /**
     * create a model
     *
     * Create a new model and return its unique identifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelTest() throws ApiException {
        PostModelRequest postModelRequest = null;
//        Model response = api.postModel(postModelRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postModel(postModelRequest);
        	}, "postModel accepted null postModelRequest");
    }

    /**
     * call this after a data outage before resuming streaming
     *
     * Resets the streaming window generated by &#x60;streamingWindow&#x60;. This endpoint should be called after a data outage before resuming streaming.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOutageTest() throws ApiException {
        String modelId = null;
//        api.postOutage(modelId);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postOutage(modelId);
        	}, "postOutage accepted null modelId");
    }

    /**
     * pretrain model with an existing dataset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPretrainTest() throws ApiException {
        String modelId = null;
        PostPretrainRequest postPretrainRequest = null;
        String chunkspec = null;
        String token = null;
//        PostPretrainResponse response = api.postPretrain(modelId, postPretrainRequest, chunkspec, token);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postPretrain(modelId, postPretrainRequest, chunkspec, token);
        	}, "postPretrain accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postPretrain("nothing-model", postPretrainRequest, chunkspec, token);
        	}, "postPretrain accepted null postPretrainRequest");
        PostPretrainRequest postPretrainRequest2 = new PostPretrainRequest();
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postPretrain("nothing-model", postPretrainRequest2, chunkspec, token);
        	}, "postPretrain accepted null chunkspec");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postPretrain("nothing-model", postPretrainRequest, "test", token);
        	}, "postPretrain accepted null token");
        
    }

    /**
     * update model configuration
     *
     * Update configuration for the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableLearningTest() throws ApiException {
        String modelId = null;
        PostLearningRequest postLearningRequest = null;
//        ConfigResponse response = api.putConfig(modelId, putConfigRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.enableLearning(modelId, postLearningRequest);
        	}, "enableLearning accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.enableLearning("nothing-model", postLearningRequest);
        	}, "enableLearning accepted null postLearningRequest");
    }

    /**
     * update fusion vector and get back results
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDataTest() throws ApiException {
        String modelId = null;
        PutDataRequest putDataRequest = null;
//        PutDataResponse response = api.putData(modelId, putDataRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putData(modelId, putDataRequest);
        	}, "putData accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putData("nothing-model", putDataRequest);
        	}, "putData accepted null putDataRequest");
    }

    /**
     * update model metadata
     *
     * Update metadata for the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putModelTest() throws ApiException {
        String modelId = null;
        PutModelRequest putModelRequest = null;
//        Model response = api.putModel(modelId, putModelRequest);
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putModel(modelId, putModelRequest);
        	}, "putModel accepted null modelId");
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putModel("nothing-model", putModelRequest);
        	}, "putModel accepted null putModelRequest");
    }

}
