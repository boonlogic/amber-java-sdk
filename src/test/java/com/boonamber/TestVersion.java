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

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

/**
 * API tests for AmberClient
 */
public class TestVersion {

    private AmberV2Client api = null;

    /**
     * get version information
     *
     * Return version information for the API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
    	String lid = System.getenv("AMBER_TEST_LICENSE_ID");
    	String lf = System.getenv("AMBER_TEST_LICENSE_FILE");
    	try {
    		this.api = new AmberV2Client(lid, lf);
    	} catch(Exception e) {
    		Assertions.assertTrue(false, "amber client failed to initialize");
    	}
        GetVersionResponse response = api.getVersion();
        Assertions.assertNotNull(response.getBuilder());
        Assertions.assertNotNull(response.getExpertApi());
        Assertions.assertNotNull(response.getExpertCommon());
        Assertions.assertNotNull(response.getNanoSecure());
    }
}
