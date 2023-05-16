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


package com.boonamber.client.api;

import com.boonamber.client.ApiException;
import com.boonamber.client.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.File;

/**
 * API tests for DefaultApi
 */
public class TestResults {

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
        	Assertions.assertTrue(false, e.getMessage());
        }
        Assertions.assertEquals(postModelRequest.getLabel(), this.label);
        this.modelId = response.getId();
        
        // post config first
    	PostConfigRequest request = new PostConfigRequest();
        request.setStreamingWindow(25);
        // features
        List<FeatureConfig> features = new ArrayList<FeatureConfig>();
        FeatureConfig f = new FeatureConfig();
        f.setName("feature-0");
        features.add(f);
        request.setFeatures(features);
        // autotuning
        Autotuning autotune = new Autotuning();
        autotune.setPercentVariation(false);
        request.setAutotuning(autotune);
        // training
        TrainingConfig train = new TrainingConfig();
        train.setBufferingSamples(400);
        train.setLearningMaxSamples(500);
        request.setTraining(train);
        PostConfigResponse config = null;
        try {
            config = api.postConfig(this.modelId, request);
        } catch (Exception e) {
        	Assertions.assertTrue(false, e.getMessage());
        }
        Assertions.assertEquals(config.getPercentVariation(), (float)0.05);
        
        // populate some of the model
        List<List<String>> records = new ArrayList<List<String>>();
        String filename = System.getProperty("user.dir") + "/src/test/java/output_current.csv";
        try (CSVReader csvReader = new CSVReader(new FileReader(filename));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (Exception e) {
        	Assertions.assertTrue(false, e.getMessage());
        }
        Assertions.assertEquals(records.size(), 31051);
        Assertions.assertEquals(records.get(0).size(), 1);
        String dataStr = "";
        for (int i = 0; i < 500; i++) {
        	for (int j = 0; j < records.get(i).size(); j++) {
        		dataStr = dataStr + "," + records.get(i).get(j);
        	}
        }
        PostDataRequest dataRequest = new PostDataRequest();
        dataRequest.setData(dataStr.substring(1));
        dataRequest.setSaveImage(false);
        PostDataResponse results = null;
        try {
            results = api.postData(this.modelId, dataRequest);
        } catch (Exception e) {
        	Assertions.assertTrue(false, e.getMessage());
        }
        Assertions.assertEquals(results.getStatus().getState().getValue(), "Monitoring");
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
     * enable learning
     *
     * Turn on learning again
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postLearningTest() throws ApiException {
        // test
    	PostLearningRequest request = new PostLearningRequest();
        PostLearningResponse config = api.enableLearning(this.modelId, request);
        Assertions.assertEquals(config.getStatus().getState().getValue(), "Learning");
    }
    
    /**
     * get nano status
     *
     * Get arrays of nano status per cluster
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNanoStatusTest() throws ApiException {
        // test
        GetNanoStatusResponse response = api.getNanoStatus(this.modelId);
        Assertions.assertEquals(response.getState().getValue(), "Monitoring");
        Assertions.assertEquals(response.getClusterCount(), 59);
        Assertions.assertEquals(response.getSampleCount(), 476);
    }
 
    /**
     * get status
     *
     * Get Amber status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        // test
        GetStatusResponse response = api.getStatus(this.modelId);
        Assertions.assertEquals(response.getState().getValue(), "Monitoring");
        Assertions.assertEquals(response.getClusterCount(), 59);
        Assertions.assertEquals(response.getSampleCount(), 476);
    }
    
    /**
     * TODO: get diagnostic
     *
     * Get Amber status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDiagnosticTest() throws ApiException {
        // test
    	try {
    		String filepath = new java.io.File(".").getCanonicalPath();
	    	filepath = new File(filepath, "testFile.tar").getPath();
	        File response = api.getDiagnostics(this.modelId, filepath);
	        Assertions.assertTrue(response.exists());
	        response.delete();
    	} catch (Exception E) {
    		Assertions.assertTrue(false, E.getMessage());
    	}
    }
    
    /**
     * get root cause
     *
     * Get root cause analysis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRCATest() throws ApiException {
        // test
    	GetRootCauseResponse response = null;
    	
    	// cluster IDs
    	int[] idList1 = new int[] {1};
        response = api.getClusterRootCause(this.modelId, idList1);
        Assertions.assertEquals(response.getRootCauseList().size(), 1);
        
        int[] idList2 = new int[] {1,2};
        response = api.getClusterRootCause(this.modelId, idList2);
        Assertions.assertEquals(response.getRootCauseList().size(), 2);
        
    	response = api.getClusterRootCause(this.modelId, 1);
        Assertions.assertEquals(response.getRootCauseList().size(), 1);
    	
    	ArrayList<Integer> id = new ArrayList<Integer>();
    	id.add(1);
        id.add(2);
        response = api.getClusterRootCause(this.modelId, id);
        Assertions.assertEquals(response.getRootCauseList().size(), 2);
        
        response = api.getClusterRootCause(this.modelId, "[1]");
        Assertions.assertEquals(response.getRootCauseList().size(), 1);
        
        response = api.getClusterRootCause(this.modelId, "[1,2]");
        Assertions.assertEquals(response.getRootCauseList().size(), 2);
        
        Assertions.assertThrowsExactly(ApiException.class, () -> {
    		api.getClusterRootCause(this.modelId, "1");
        	}, "must specify cluster IDs correctly failed");
        
        
        // vectors
        Integer[] data = new Integer[25];
        Arrays.fill(data, 0);
        List<Integer> vector = Arrays.asList(data);
        String vectorString = "[[";
        for (int i = 0; i < vector.size(); i++) {
        	vectorString = vectorString + String.valueOf(vector.get(i)) + ",";
        }
        vectorString = vectorString.substring(0, vectorString.length() - 1);
        vectorString = vectorString + "]]";
        response = api.getVectorRootCause(this.modelId, vectorString);
        Assertions.assertEquals(response.getRootCauseList().size(), 1);
        
        ArrayList<List<Integer>> vectors = new ArrayList<List<Integer>>();
        vectors.add(vector);
        response = api.getVectorRootCause(this.modelId, vectors);
        Assertions.assertEquals(response.getRootCauseList().size(), 1);
        
        Arrays.fill(data, 1);
        vector = Arrays.asList(data);
        vectors.add(vector);
        response = api.getVectorRootCause(this.modelId, vectors);
        Assertions.assertEquals(response.getRootCauseList().size(), 2);
        
        Assertions.assertThrowsExactly(ApiException.class, () -> {
    		api.getVectorRootCause(this.modelId, "1");
        	}, "must specify vectors correctly failed");
    }
    
    /**
     * post outage
     *
     * Reset streaming window
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOutageTest() throws ApiException {
        // test
        api.postOutage(this.modelId);
        
        GetStatusResponse response = api.getStatus(this.modelId);
        Assertions.assertEquals(response.getState().getValue(), "Monitoring");
        Assertions.assertEquals(response.getClusterCount(), 59);
        Assertions.assertEquals(response.getSampleCount(), 476);
    }
}