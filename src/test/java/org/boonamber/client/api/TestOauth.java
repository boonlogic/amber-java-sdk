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
//import java.io.File;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import org.junit.Rule;
//import org.junit.contrib.java.lang.system.EnvironmentVariables;

//import org.junitpioneer.jupiter.ClearEnvironmentVariable;

/**
 * API tests for AmberClient
 */
public class TestOauth {
	
//	@Rule
//	public final EnvironmentVariables environmentVariables = new EnvironmentVariables();
	
    private AmberV2Client api = null;

    /**
     * test refresh auth
     *
     * Force an immediate refresh authorization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oauthRefreshTest() throws ApiException {
    	String lid = System.getenv("AMBER_TEST_LICENSE_ID");
    	String lf = System.getenv("AMBER_TEST_LICENSE_FILE");
    	try {
    		this.api = new AmberV2Client(lid, lf);
    	} catch(Exception e) {
    		Assertions.assertTrue(false, "amber client failed to initialize");
    	}
        this.api.getVersion();
        
        // force refresh oauth
        this.api.reauthTime = 0;
        String oldRefresh = this.api.refreshToken;
        this.api.getVersion();
        Assertions.assertNotEquals(oldRefresh, this.api.refreshToken);
    }
    
    /**
     * test license file
     *
     * Use various means of setting the license file and test bad json format
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void licenseFileTest() throws ApiException {
    	
    	// check bad formatted license file
    	Assertions.assertThrows(ApiException.class, () -> {
    		new AmberV2Client("default", "bad.Amber.license");
        	}, "Invalid read of corrupt license file. Check and clear env");
    	
    	// check non existent license file
    	Assertions.assertThrows(ApiException.class, () -> {
    		new AmberV2Client("default", "bogus.Amber.license");
        	}, "Didn't throw error for non existant license file. Check and clear env");
    }
    
    /**
     * test license ID
     *
     * Use various means of setting the license ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
//    @ClearEnvironmentVariable(key="AMBER_V2_LICENSE_FILE")
//    @ClearEnvironmentVariable(key="AMBER_V2_LICENSE_ID")
    public void licenseProfileTest() throws ApiException {
    	// check non existent ID
    	Assertions.assertThrows(ApiException.class, () -> {
    		new AmberV2Client("bogus", "test.Amber.license");
        	}, "Invalid license ID accepted. Check and clear env");
    	
    	// TODO: need to set AMBER_V2_SERVER env var
//    	String licenseId = System.getenv("AMBER_TEST_LICENSE_ID");
//    	String lf = System.getenv("AMBER_TEST_LICENSE_FILE");
//    	this.api = new AmberV2Client(licenseId, lf);
    	
//    	this.environmentVariables.set("AMBER_V2_SERVER", this.api.server);
//    	Assertions.assertEquals(System.getenv("AMBER_V2_SERVER"), "none");
//    	this.api = new AmberV2Client("invalid-credentials", "src/test/java/org/boonamber/client/api/test.Amber.license");
//    	Assertions.assertThrows(ApiException.class, () -> {
//    		this.api.getVersion();
//        	}, "Didn't throw error for invalid credentials. Check and clear env");
    		
    }
}
