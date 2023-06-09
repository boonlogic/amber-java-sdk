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


package com.boonamber.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Current state of the model within the Amber state machine. One of: &#x60;Buffering&#x60;, &#x60;Autotuning&#x60;, &#x60;Learning&#x60;, &#x60;Monitoring&#x60;.  During &#x60;Buffering&#x60;, the model simply collects data which will be used to automatically fit its clustering parameters. During this stage no analytic results are returned. Once the model has collected &#x60;bufferSamples&#x60; input patterns, it transitions to &#x60;Autotuning&#x60;.   During &#x60;Autotuning&#x60;, the model continues to collect data while using the data from &#x60;Buffering&#x60; to automatically discover good values for the clustering parameters (&#x60;minVal&#x60;, &#x60;maxVal&#x60; and &#x60;percentVariation&#x60;). No analytic results are returned during this stage, which does not last longer than 200 requests. Once finished, the model is configured with the newly discovered parameters and trained using all data collected during &#x60;Buffering&#x60; and &#x60;Autotuning&#x60;. At that point the model transitions to &#x60;Learning&#x60;.  During &#x60;Learning&#x60;, the model starts returning analytic results while establishing a baseline for the expected number of anomalies per unit time. It also begins returning analytic results. During this phase the underlying asset should operate in a mostly compliant mode, even though the model is highly tolerant of anomalies that occur during &#x60;Learning&#x60; (i.e. an anomalous pattern encountered here will be considered just as anomalous during &#x60;Monitoring&#x60;). &#x60;Learning&#x60; transitions to &#x60;Monitoring&#x60; once any of the following requirements are met: - the model&#39;s &#x60;sampleCount&#x60; surpasses &#x60;learningMaxSamples&#x60; - the model&#39;s &#x60;clusterCount&#x60; surpasses &#x60;learningMaxClusters&#x60; - &#x60;learningRateNumerator&#x60; or fewer new clusters were created within the last &#x60;learningRateDenominator&#x60; samples.  During &#x60;Monitoring&#x60;, all learning stops and the model continues to return analytic results. The model will remain in &#x60;Monitoring&#x60; until it is either re-configured or &#x60;Learning&#x60; is enabled again using &#x60;PUT /config&#x60;.
 */
@JsonAdapter(AmberState.Adapter.class)
public enum AmberState {
  
  BUFFERING("Buffering"),
  
  AUTOTUNING("Autotuning"),
  
  LEARNING("Learning"),
  
  MONITORING("Monitoring");

  private String value;

  AmberState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AmberState fromValue(String value) {
    for (AmberState b : AmberState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AmberState> {
    @Override
    public void write(final JsonWriter jsonWriter, final AmberState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AmberState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AmberState.fromValue(value);
    }
  }
}

