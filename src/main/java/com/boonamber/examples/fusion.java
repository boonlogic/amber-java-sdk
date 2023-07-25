package com.boonamber.examples;

import java.util.ArrayList;
import java.util.List;

import com.boonamber.AmberV2Client;
import com.boonamber.models.*;
import com.boonamber.models.FeatureConfig.FusionRuleEnum;

public class fusion {

	public static void main(String[] args) {
		AmberV2Client amber = null;
		String modelId = "";
		try {
			amber = new AmberV2Client("default", "~/.Amber.license");
		} catch (Exception e) {
			System.out.println("Amber cloud error");
			return;
		}
		
		// create new model
		System.out.println("create model");
		try {
			PostModelRequest request = new PostModelRequest();
			PostModelResponse modelInfo = amber.postModel(request);
			System.out.println(modelInfo.toString());
			modelId = modelInfo.getId();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// configure model
		System.out.println("configure model");
		List<FeatureConfig> features = new ArrayList<FeatureConfig>();
		try {
			PostConfigRequest config = new PostConfigRequest();
			for (int i = 0; i < 5; i++ ) {
				FeatureConfig f = new FeatureConfig();
				f.setName("feature-" + i);
				f.setFusionRule(FusionRuleEnum.fromValue("submit"));
				features.add(f);
			}
			config.setFeatures(features);
			config.setStreamingWindow(25);
			System.out.println(amber.postConfig(modelId, config).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		/* 
		* Keep in mind, initially the model will not be run until data has been set
		* for each feature. Once that has happened, each feature update runs the model
		* according to our submitRule values.
		*/
		
		// Hey look, the 3rd feature updated before any other feature:
		FusionFeature v1 = new FusionFeature();
		v1.setName(features.get(1).getName());
		v1.setValue((float)5);
		System.out.println("update vector: " + v1.toString());
		
		try {
			List<FusionFeature> vector = new ArrayList<FusionFeature>();
			vector.add(v1);
			PutDataRequest data = new PutDataRequest();
			data.setVector(vector);
			// we always get the current vector back. in this case there is no results due to incomplete vector
			System.out.println(amber.putData(modelId, data).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		FusionFeature v0 = new FusionFeature();
		v0.setName(features.get(0).getName());
		v0.setValue((float)16);
		
		FusionFeature v2 = new FusionFeature();
		v2.setName(features.get(2).getName());
		v2.setValue((float)34);
		
		FusionFeature v3 = new FusionFeature();
		v3.setName(features.get(3).getName());
		v3.setValue((float)84.5);
		
		FusionFeature v4 = new FusionFeature();
		v4.setName(features.get(4).getName());
		v4.setValue((float)0);
		
		try {
			List<FusionFeature> vector = new ArrayList<FusionFeature>();
			vector.add(v0);
			vector.add(v2);
			vector.add(v3);
			vector.add(v4);
			PutDataRequest data = new PutDataRequest();
			data.setVector(vector);
			// we always get the current vector back. in this case results are included
			System.out.println(amber.putData(modelId, data).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// 5th feature update
		v4.setValue((float)111.2);
		try {
			List<FusionFeature> vector = new ArrayList<FusionFeature>();
			vector.add(v4);
			PutDataRequest data = new PutDataRequest();
			data.setVector(vector);
			// we always get the current vector back. in this case results are included
			System.out.println(amber.putData(modelId, data).toString());
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
