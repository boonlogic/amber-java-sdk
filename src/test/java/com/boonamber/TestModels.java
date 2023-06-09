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
import org.junit.jupiter.api.AfterEach;

import java.util.List;

/**
 * API tests for DefaultApi
 */
public class TestModels {

    private AmberV2Client api;
    
    private String label = "java:v2:tests";
    private String modelId = "";
    
    @BeforeEach
    void setUp() {
    	String lid = System.getenv("AMBER_TEST_LICENSE_ID");
    	String lf = System.getenv("AMBER_TEST_LICENSE_FILE");
    	try {
    		this.api = new AmberV2Client(lid, lf);
    	} catch(Exception e) {
    		Assertions.assertTrue(false, "amber client failed to initialize");
    	}
        PostModelRequest postModelRequest = new PostModelRequest();
        postModelRequest.setLabel(this.label);
        PostModelResponse response = null;
        try {
        	response = api.postModel(postModelRequest);
        } catch (ApiException e) {
        	Assertions.assertTrue(false);
        }
        Assertions.assertEquals(postModelRequest.getLabel(), this.label);
        this.modelId = response.getId();
        
    }
    
    @AfterEach
    void teardown() {
        try {
        	api.deleteModel(this.modelId);
        } catch (ApiException e) {
        	Assertions.assertTrue(false, "failed to delete model");
        }
    }
    
    /**
     * post model
     *
     * Create a new model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postModelTest() throws ApiException {
    	PostModelRequest request = new PostModelRequest();
    	request.setLabel(this.label);
    	PostModelResponse response = this.api.postModel(request);
    	Assertions.assertEquals(response.getLabel(), this.label);
    	
    	api.deleteModel(response.getId());
    }

    /**
     * get models
     *
     * Get a list of all the models
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelsTest() throws ApiException {
    	List<Model> response = this.api.getModels().getModelList();
    	boolean hasModelId = false;
    	for (int i = 0; i < response.size(); i++) {
    		if (response.get(i).getId().equals(this.modelId)) {
    			hasModelId = true;
    			break;
    		}
    	}
    	Assertions.assertTrue(hasModelId, "modelId not in list of models");
    }
    
    /**
     * get model
     *
     * Get the metadata for the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelTest() throws ApiException {
    	PostModelResponse response = this.api.getModel(this.modelId);
    	Assertions.assertEquals(response.getId(), this.modelId);
    	Assertions.assertEquals(response.getLabel(), this.label);
    }
    
    /**
     * put model
     *
     * Update the metadata for the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void puttModelTest() throws ApiException {
    	PostModelResponse response = this.api.updateLabel(this.modelId, this.label + "-update");
    	Assertions.assertEquals(response.getId(), this.modelId);
    	Assertions.assertEquals(response.getLabel(), this.label + "-update");
    }
    
    /**
     * delete model
     *
     * Delete the model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
    	// create a new model
    	PostModelRequest request = new PostModelRequest();
    	request.setLabel(this.label);
    	PostModelResponse model = this.api.postModel(request);
    	Assertions.assertEquals(model.getLabel(), this.label);
    	
    	// delete model
    	this.api.deleteModel(model.getId());
    	
    	// check that model is no longer in list
    	List<Model> response = this.api.getModels().getModelList();
    	boolean hasModelId = false;
    	for (int i = 0; i < response.size(); i++) {
    		if (response.get(i).getId().equals(model.getId())) {
    			hasModelId = true;
    			break;
    		}
    	}
    	Assertions.assertFalse(hasModelId, "delete model failed");
    }
}
