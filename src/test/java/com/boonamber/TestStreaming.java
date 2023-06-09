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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.opencsv.CSVReader;
import java.io.FileReader;

/**
 * API tests for DefaultApi
 */
public class TestStreaming {

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
        AutotuneConfig autotune = new AutotuneConfig();
        autotune.setPercentVariation(false);
        request.setAutotuning(autotune);
        // training
        TrainingConfig train = new TrainingConfig();
        train.setBufferingSamples(500);
        request.setTraining(train);
        PostConfigResponse config = null;
        try {
            config = api.postConfig(this.modelId, request);
        } catch (Exception e) {
        	Assertions.assertTrue(false, e.getMessage());
        }
        Assertions.assertEquals(config.getPercentVariation(), (float)0.05);
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
     * post data
     *
     * Stream data to model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDataTest() throws ApiException {
        // test
    	
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
        for (int i = 0; i < 600; i++) {
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
        Assertions.assertEquals("Learning", results.getStatus().getState().getValue());
        
        // TODO: test data as a list not string
    }
    
    /**
     * put data
     *
     * Send partial vector to model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDataTest() throws ApiException {
        // test
    	PutDataRequest request = new PutDataRequest();
    	FusionFeature feature = new FusionFeature();
    	feature.setName("feature-0");
    	feature.setValue((float)16);
    	request.setVector(Arrays.asList(new FusionFeature[] {feature}));
        PutDataResponse response = api.putData(this.modelId, request);
        Assertions.assertEquals(response.getStatus().getState().getValue(), "Buffering");
    }
    
    /**
     * post pretrain
     *
     * Pretrain model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPretrainTest() throws ApiException {
        // test
    	
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
        dataStr = dataStr.substring(1);
        PostPretrainResponse results = api.postPretrain(this.modelId, dataStr, true);
        Assertions.assertEquals("Pretrained", results.getStatus().getValue());
        
        results = api.postPretrain(this.modelId, dataStr, false);
        Assertions.assertTrue(results.getStatus().getValue().equals("Pretrained") || results.getStatus().getValue().equals("Pretraining"));
        
        // clean up pretrain wait
        String status = results.getStatus().getValue();
        while (status.equals("Pretraining")) {
        	// sleep here
        	try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				Assertions.assertTrue(false);
			}
        	status = api.getPretrain(modelId).getStatus().getValue();
        }
        
        // TODO: test data as a list not string
//        float[] subData = Arrays.copyOfRange(records, 0, 500);
    }
    
    
    /**
     * get pretrain 
     *      *
     * Get pretrain response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPretrainTest() throws ApiException {
        // test
        GetPretrainResponse response = api.getPretrain(this.modelId);
        Assertions.assertEquals(response.getStatus().getValue(), "None");
    }
}
