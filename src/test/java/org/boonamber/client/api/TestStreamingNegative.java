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

import java.util.Arrays;

/**
 * API tests for DefaultApi
 */
public class TestStreamingNegative {

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
     * post data
     *
     * Stream data to model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDataNegative() throws ApiException {
    	//TODO
//    	Assertions.assertThrowsExactly(ApiException.class, () -> {
//    		api.postData(this.modelId, null, "1");
//        	}, "must specify vectors correctly failed");
    }
    
    /**
     * put data
     *
     * Send partial vector to model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDataNegative() throws ApiException {
        // test
    	PutDataRequest request = new PutDataRequest();
    	FusionFeature feature = new FusionFeature();
    	feature.setName("feature-0");
    	feature.setValue((float)16);
    	request.setVector(Arrays.asList(new FusionFeature[] {feature}));

        Assertions.assertThrowsExactly(ApiException.class, () -> {
    		api.putData(this.modelId, request);
        	}, "must specify vectors correctly failed");
    }
    
    /**
     * post pretrain
     *
     * Pretrain model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPretrainNegative() throws ApiException {
        // TODO
    	
//    	Assertions.assertThrowsExactly(ApiException.class, () -> {
//    		api.getRootCause(this.modelId, null, "1");
//        	}, "must specify vectors correctly failed");
    }
    
    
    /**
     * get pretrain 
     *      *
     * Get pretrain response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPretrainNegative() throws ApiException {
    	Assertions.assertThrowsExactly(ApiException.class, () -> {
    		api.getPretrain(this.modelId);
        	}, "must specify vectors correctly failed");
    }
}