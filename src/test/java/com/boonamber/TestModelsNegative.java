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


package com.boonamber;

import com.boonamber.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * API tests for DefaultApi
 */
public class TestModelsNegative {

    private AmberV2Client api;
    
    private String label = "java:v2:tests";
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
     * get model
     *
     * Get the metadata for the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelNegative() throws ApiException {    	
    	Assertions.assertThrowsExactly(ApiException.class, () -> {
        	api.getModel(this.modelId);
        	});
    }
    
    /**
     * put model
     *
     * Update the metadata for the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void puttModelNegative() throws ApiException {
    	PutModelRequest request = new PutModelRequest();
    	request.setLabel(this.label + "-update");
    	Assertions.assertThrowsExactly(ApiException.class, () -> {
        	api.putModel(this.modelId, request);
        	});
    }
    
    /**
     * delete model
     *
     * Delete the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelNegative() throws ApiException {
    	Assertions.assertThrowsExactly(ApiException.class, () -> {
        	api.deleteModel(this.modelId);
        	});
    }
}
