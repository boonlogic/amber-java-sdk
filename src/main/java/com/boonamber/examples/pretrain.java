package com.boonamber.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.boonamber.AmberV2Client;
import com.boonamber.ApiException;
import com.boonamber.models.*;

public class pretrain {
	
	AmberV2Client amber;

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
		try {
			PostModelRequest request = new PostModelRequest();
			PostModelResponse modelInfo = amber.postModel(request);
			System.out.println(modelInfo.toString());
			modelId = modelInfo.getId();
			System.out.println("created model: " + modelId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// configure
		PostConfigRequest config = new PostConfigRequest();
		config.setStreamingWindow(25);
		List<FeatureConfig> features = new ArrayList<FeatureConfig>();
		FeatureConfig f = new FeatureConfig();
		f.setName("feature-1");
		features.add(f);
		config.setFeatures(features);
		try {
			PostConfigResponse configResponse = amber.postConfig(modelId, config);
			System.out.println(modelId + " config:" + configResponse.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// pretrain
		try {
			System.out.println(pretrainCsv(amber, modelId, "src/main/java/com/boonamber/examples/output_current.csv", 15000).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// delete model
		try {
			amber.deleteModel(modelId);
			System.out.println("deleted model");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

	}
	
	public static GetPretrainResponse pretrainCsv(AmberV2Client amber, String modelId, String filename, int chunkSize) throws Exception{
		System.out.println("Reading CSV...");
		List<List<Float>> data = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        data.add(Arrays.asList(values).stream()
                                    .map(s -> Float.parseFloat(s))
                                    .collect(Collectors.toList()));
		    }
		} catch (FileNotFoundException e) {
			throw new Exception("File does not exist: " + filename);
		} catch (IOException e) {
			throw new Exception("error in formatting of csv file");
		}
		
		List<Float> dataStream = data.stream()
				.flatMap(List::stream)
		        .collect(Collectors.toList());
		try {
			PostPretrainResponse results = amber.postPretrain(modelId, dataStream, chunkSize, true);
			if (results.getStatus().getValue().equals("Pretrained")) {
				return amber.getPretrain(modelId);
			}
		} catch (ApiException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Pretraining...");
		try {
			while (true) {
				TimeUnit.SECONDS.sleep(5);
				GetPretrainResponse results = amber.getPretrain(modelId);
				if (results.getStatus().getValue().equals("Pretraining")) {
					System.out.println(results.toString());
				} else if (results.getStatus().getValue().equals("Pretrained")) {
					return results;
				} else {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return null;
		
	}

}
