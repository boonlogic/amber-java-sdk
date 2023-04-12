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
import org.boonamber.client.model.DeleteModelResponse;
import org.boonamber.client.model.Error;
import java.io.File;
import org.boonamber.client.model.GetModelsResponse;
import org.boonamber.client.model.GetNanoStatusResponse;
import org.boonamber.client.model.GetPretrainResponse;
import org.boonamber.client.model.GetRootCauseResponse;
import org.boonamber.client.model.GetStatusResponse;
import org.boonamber.client.model.GetSummaryResponse;
import org.boonamber.client.model.GetVersionResponse;
import org.boonamber.client.model.PostConfigRequest;
import org.boonamber.client.model.PostConfigResponse;
import org.boonamber.client.model.PostDataRequest;
import org.boonamber.client.model.PostDataResponse;
import org.boonamber.client.model.PostLearningRequest;
import org.boonamber.client.model.PostLearningResponse;
import org.boonamber.client.model.PostModelRequest;
import org.boonamber.client.model.PostModelResponse;
import org.boonamber.client.model.PostOauth2AccessRequest;
import org.boonamber.client.model.PostOauth2AccessResponse;
import org.boonamber.client.model.PostOauth2RefreshRequest;
import org.boonamber.client.model.PostOauth2RefreshResponse;
import org.boonamber.client.model.PostPretrainRequest;
import org.boonamber.client.model.PostPretrainResponse;
import org.boonamber.client.model.PutDataRequest;
import org.boonamber.client.model.PutDataResponse;
import org.boonamber.client.model.PutModelRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * delete a model
     *
     * Permanently delete the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String modelId = null;
        DeleteModelResponse response = api.deleteModel(modelId);
        // TODO: test validations
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
        PostModelResponse response = api.getModel(modelId);
        // TODO: test validations
    }

    /**
     * get model configuration
     *
     * Get the configuration of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelConfigTest() throws ApiException {
        String modelId = null;
        PostConfigResponse response = api.getModelConfig(modelId);
        // TODO: test validations
    }

    /**
     * get the diagnostic of a model
     *
     * Get the current diagnostic of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelDiagnosticTest() throws ApiException {
        String modelId = null;
        File response = api.getModelDiagnostic(modelId);
        // TODO: test validations
    }

    /**
     * get current nano status of the model
     *
     * Get the current nano state of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelNanoStatusTest() throws ApiException {
        String modelId = null;
        GetNanoStatusResponse response = api.getModelNanoStatus(modelId);
        // TODO: test validations
    }

    /**
     * get pretraining progress
     *
     * Get the pretraining status of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelPretrainTest() throws ApiException {
        String modelId = null;
        GetPretrainResponse response = api.getModelPretrain(modelId);
        // TODO: test validations
    }

    /**
     * perform root cause analysis
     *
     * Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelRootCauseTest() throws ApiException {
        String modelId = null;
        String clusters = null;
        String vectors = null;
        GetRootCauseResponse response = api.getModelRootCause(modelId, clusters, vectors);
        // TODO: test validations
    }

    /**
     * get current status of the model
     *
     * Get the current state and learning progress of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelStatusTest() throws ApiException {
        String modelId = null;
        GetStatusResponse response = api.getModelStatus(modelId);
        // TODO: test validations
    }

    /**
     * get the summation of a model
     *
     * Get the current summation of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelSummaryTest() throws ApiException {
        String modelId = null;
        GetSummaryResponse response = api.getModelSummary(modelId);
        // TODO: test validations
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
        GetModelsResponse response = api.getModels(verbose);
        // TODO: test validations
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
        GetVersionResponse response = api.getVersion();
        // TODO: test validations
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
        PostModelResponse response = api.postModel(postModelRequest);
        // TODO: test validations
    }

    /**
     * configure a model
     *
     * Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelConfigTest() throws ApiException {
        String modelId = null;
        PostConfigRequest postConfigRequest = null;
        PostConfigResponse response = api.postModelConfig(modelId, postConfigRequest);
        // TODO: test validations
    }

    /**
     * send data to model and get back results
     *
     * Send data to the specified model, and get back the resulting analytics and model status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelDataTest() throws ApiException {
        String modelId = null;
        PostDataRequest postDataRequest = null;
        PostDataResponse response = api.postModelData(modelId, postDataRequest);
        // TODO: test validations
    }

    /**
     * update model configuration and re-enable learning
     *
     * Update model configuration and re-enable learning
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelLearningTest() throws ApiException {
        String modelId = null;
        PostLearningRequest postLearningRequest = null;
        PostLearningResponse response = api.postModelLearning(modelId, postLearningRequest);
        // TODO: test validations
    }

    /**
     * migrate a v1 sensor to a v2 model
     *
     * migrate a v1 sensor to a v2 model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelMigrateTest() throws ApiException {
        String v1ModelId = null;
        PostModelResponse response = api.postModelMigrate(v1ModelId);
        // TODO: test validations
    }

    /**
     * call this after a data outage before resuming streaming
     *
     * Resets the streaming window generated by &#x60;streamingWindow&#x60;. This endpoint should be called after a data outage before resuming streaming.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelOutageTest() throws ApiException {
        String modelId = null;
        Error response = api.postModelOutage(modelId);
        // TODO: test validations
    }

    /**
     * pretrain model with an existing dataset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelPretrainTest() throws ApiException {
        String modelId = null;
        PostPretrainRequest postPretrainRequest = null;
        String chunkspec = null;
        String txnId = null;
        PostPretrainResponse response = api.postModelPretrain(modelId, postPretrainRequest, chunkspec, txnId);
        // TODO: test validations
    }

    /**
     * request an API token given license and secret key
     *
     * Request an Oauth2 Bearer token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOauth2AccessTest() throws ApiException {
        PostOauth2AccessRequest postOauth2AccessRequest = null;
        PostOauth2AccessResponse response = api.postOauth2Access(postOauth2AccessRequest);
        // TODO: test validations
    }

    /**
     * request an API token given a refresh token
     *
     * Request an Oauth2 Bearer token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOauth2RefreshTest() throws ApiException {
        PostOauth2RefreshRequest postOauth2RefreshRequest = null;
        PostOauth2RefreshResponse response = api.postOauth2Refresh(postOauth2RefreshRequest);
        // TODO: test validations
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
        PostModelResponse response = api.putModel(modelId, putModelRequest);
        // TODO: test validations
    }

    /**
     * update fusion vector and get back results
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putModelDataTest() throws ApiException {
        String modelId = null;
        PutDataRequest putDataRequest = null;
        PutDataResponse response = api.putModelData(modelId, putDataRequest);
        // TODO: test validations
    }

}
