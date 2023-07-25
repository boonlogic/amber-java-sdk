package com.boonamber.examples;

import java.util.ArrayList;
import java.util.List;

import com.boonamber.AmberV2Client;
import com.boonamber.models.*;

public class full {

	public static void main(String[] args) {
		AmberV2Client amber = null;
		String modelId = "";
		try {
			amber = new AmberV2Client("default", "~/.Amber.license");
		} catch (Exception e) {
			System.out.println("Amber cloud error");
			return;
		}
		
		// version
		System.out.println("getting version info");
		try {
			System.out.println(amber.getVersion().toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// list models
		System.out.println("listing models");
		try {
			System.out.println(amber.getModels().toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// create model
		System.out.println("create new model");
		try {
			PostModelRequest request = new PostModelRequest();
			request.setLabel("amber-sdk-example-full");
			PostModelResponse modelInfo = amber.postModel(request);
			System.out.println(modelInfo.toString());
			modelId = modelInfo.getId();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// get model
		System.out.println("get model");
		try {
			System.out.println(amber.getModel(modelId).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// update label
		System.out.println("update model label");
		try {
			System.out.println(amber.updateLabel(modelId, "amber-sdk-example-fullUpdated").toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// configure model
		System.out.println("configure model");
		try {
			PostConfigRequest config = new PostConfigRequest();
			List<FeatureConfig> features = new ArrayList<FeatureConfig>();
			for (int i = 0; i < 3; i++ ) {
				FeatureConfig f = new FeatureConfig();
				f.setName("feature-" + i);
				features.add(f);
			}
			config.setFeatures(features);
			config.setStreamingWindow(25);
			System.out.println(amber.postConfig(modelId, config).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// get config
		System.out.println("get config");
		try {
			System.out.println(amber.getConfig(modelId).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// stream data
		System.out.println("stream data");
		try {
			PostDataRequest request = new PostDataRequest();
			request.setData("0,1,2");
			request.setSaveImage(false);
			System.out.println(amber.postData(modelId, request).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// get status
		System.out.println("get status");
		try {
			System.out.println(amber.getStatus(modelId).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// post outage
		System.out.println("post outage");
		try {
			amber.postOutage(modelId);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// enable learning
		System.out.println("enable learning");
		try {
			TrainingConfig config = new TrainingConfig();
			System.out.println(amber.enableLearning(modelId, config).toString());
		} catch (Exception e) {
			// fails because not in learning or monitoring....continue
			System.out.println(e.getMessage());
		}
		
		// get nano status
		System.out.println("get nano status");
		try {
			System.out.println(amber.getNanoStatus(modelId).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// delete model
		System.out.println("delete model");
		try {
			amber.deleteModel(modelId);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

	}

}
