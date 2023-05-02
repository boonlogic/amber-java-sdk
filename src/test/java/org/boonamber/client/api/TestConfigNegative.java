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
import org.boonamber.client.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

/**
 * API tests for DefaultApi
 */
public class TestConfigNegative {

    private AmberV2Client api;
    
    private String modelId = "non-existant-id";
    
    @BeforeEach
    void setUp() {
    	String lid = System.getenv("AMBER_TEST_LICENSE_ID");
    	String lf = System.getenv("AMBER_TEST_LICENSE_FILE");
    	try {
    		this.api = new AmberV2Client(lid, lf);
    	} catch(Exception e) {
    		Assertions.assertTrue(false, "amber client failed to initialize");
    	}
    }
   
    
    /**
     * get model configuration
     *
     * Get the configuration of the specified model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigNegative() throws ApiException {
    	Assertions.assertThrowsExactly(ApiException.class, () -> {
    		api.getConfig(modelId);
        	});
    }

    /**
     * configure a model
     *
     * Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigNegative() throws ApiException {
        PostConfigRequest request = new PostConfigRequest();
        request.setStreamingWindow(25);
        List<FeatureConfig> features = new ArrayList<FeatureConfig>();
        FeatureConfig f = new FeatureConfig();
        f.setName("feature-0");
        features.add(f);
        request.setFeatures(features);
        
        Assertions.assertThrowsExactly(ApiException.class, () -> {
        	api.postConfig(this.modelId, request);
        	});
    }
}
