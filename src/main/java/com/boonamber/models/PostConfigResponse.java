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
import com.boonamber.models.Autotuning;
import com.boonamber.models.FeatureConfigResponse;
import com.boonamber.models.TrainingConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.boonamber.JSON;

/**
 * PostConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostConfigResponse {
  public static final String SERIALIZED_NAME_STREAMING_WINDOW = "streamingWindow";
  @SerializedName(SERIALIZED_NAME_STREAMING_WINDOW)
  private Integer streamingWindow;

  public static final String SERIALIZED_NAME_PERCENT_VARIATION = "percentVariation";
  @SerializedName(SERIALIZED_NAME_PERCENT_VARIATION)
  private Float percentVariation;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeatureConfigResponse> features = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRAINING = "training";
  @SerializedName(SERIALIZED_NAME_TRAINING)
  private TrainingConfig training;

  public static final String SERIALIZED_NAME_AUTOTUNING = "autotuning";
  @SerializedName(SERIALIZED_NAME_AUTOTUNING)
  private Autotuning autotuning;

  public PostConfigResponse() {
  }

  public PostConfigResponse streamingWindow(Integer streamingWindow) {
    
    this.streamingWindow = streamingWindow;
    return this;
  }

   /**
   * Number of recent input _vectors_ concatenated together to make up a full input _pattern_ presented to the model for inference.  Let &#x60;featureCount&#x60; be the configured number of features. The model consumes data sequentially in steps of size &#x60;featureCount&#x60;. Each time it receives &#x60;featureCount&#x60; data values, &#x60;featureCount&#x60; input values are consumed and concatenated together to form an input _vector_. This input vector is then concatenated with zero or more past input vectors to form an input _pattern_. The input _pattern_ is the true data vector inferenced by the model at each step. Configuring the &#x60;streamingWindow&#x60; greater than 1 allows a model to identify patterns in vectors that change over time.  If monitoring a single timeseries signal, the model should be configured with just one feature. In that case the input vector has length 1, and &#x60;streamingWindow&#x60; determines the length of a moving window over past samples which is the input pattern to the model for each new sample. For example, a model configured with one feature and a &#x60;streamingWindow&#x60; of 25 will concatenate together and inference the 25 most recent data values for each new value consumed.  If monitoring instantaneous readings from several sensors jointly, each sensor should be associated with one feature in the configuration. In this case &#x60;streamingWindow&#x60; is usually set to 1 so that the input pattern is just the current vector of readings. For example, a model configured with 5 features and a &#x60;streamingWindow&#x60; of 1 will consume 5 values at a time and inference those 5 values as a pattern of length 5. If the &#x60;streamingWindow&#x60; were 2, the model would still consume 5 values at a time, but its input pattern would contain the last 10 samples.
   * minimum: 1
   * @return streamingWindow
  **/
  @javax.annotation.Nullable

  public Integer getStreamingWindow() {
    return streamingWindow;
  }


  public void setStreamingWindow(Integer streamingWindow) {
    this.streamingWindow = streamingWindow;
  }


  public PostConfigResponse percentVariation(Float percentVariation) {
    
    this.percentVariation = percentVariation;
    return this;
  }

   /**
   * Granularity of the underlying cluster model used for anomaly detection. This is a number between 0.01 and 0.20 which is the distance threshold used to determine whether a pattern should be assigned to an existing cluster or create a new cluster of its own. All things held equal, a small &#x60;percentVariation&#x60; will segment a dataset into many clusters while a larger &#x60;percentVariation&#x60; will segment the dataset into fewer clusters.  &#x60;percentVariation&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;percentVariation&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;.
   * @return percentVariation
  **/
  @javax.annotation.Nullable

  public Float getPercentVariation() {
    return percentVariation;
  }


  public void setPercentVariation(Float percentVariation) {
    this.percentVariation = percentVariation;
  }


  public PostConfigResponse features(List<FeatureConfigResponse> features) {
    
    this.features = features;
    return this;
  }

  public PostConfigResponse addFeaturesItem(FeatureConfigResponse featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable

  public List<FeatureConfigResponse> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeatureConfigResponse> features) {
    this.features = features;
  }


  public PostConfigResponse training(TrainingConfig training) {
    
    this.training = training;
    return this;
  }

   /**
   * Get training
   * @return training
  **/
  @javax.annotation.Nullable

  public TrainingConfig getTraining() {
    return training;
  }


  public void setTraining(TrainingConfig training) {
    this.training = training;
  }


  public PostConfigResponse autotuning(Autotuning autotuning) {
    
    this.autotuning = autotuning;
    return this;
  }

   /**
   * Get autotuning
   * @return autotuning
  **/
  @javax.annotation.Nullable

  public Autotuning getAutotuning() {
    return autotuning;
  }


  public void setAutotuning(Autotuning autotuning) {
    this.autotuning = autotuning;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostConfigResponse postConfigResponse = (PostConfigResponse) o;
    return Objects.equals(this.streamingWindow, postConfigResponse.streamingWindow) &&
        Objects.equals(this.percentVariation, postConfigResponse.percentVariation) &&
        Objects.equals(this.features, postConfigResponse.features) &&
        Objects.equals(this.training, postConfigResponse.training) &&
        Objects.equals(this.autotuning, postConfigResponse.autotuning);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamingWindow, percentVariation, features, training, autotuning);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostConfigResponse {\n");
    sb.append("    streamingWindow: ").append(toIndentedString(streamingWindow)).append("\n");
    sb.append("    percentVariation: ").append(toIndentedString(percentVariation)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    training: ").append(toIndentedString(training)).append("\n");
    sb.append("    autotuning: ").append(toIndentedString(autotuning)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("streamingWindow");
    openapiFields.add("percentVariation");
    openapiFields.add("features");
    openapiFields.add("training");
    openapiFields.add("autotuning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostConfigResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostConfigResponse is not found in the empty JSON string", PostConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostConfigResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
        if (jsonArrayfeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
          }

          // validate the optional field `features` (array)
          for (int i = 0; i < jsonArrayfeatures.size(); i++) {
            FeatureConfigResponse.validateJsonObject(jsonArrayfeatures.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `training`
      if (jsonObj.get("training") != null && !jsonObj.get("training").isJsonNull()) {
        TrainingConfig.validateJsonObject(jsonObj.getAsJsonObject("training"));
      }
      // validate the optional field `autotuning`
      if (jsonObj.get("autotuning") != null && !jsonObj.get("autotuning").isJsonNull()) {
        Autotuning.validateJsonObject(jsonObj.getAsJsonObject("autotuning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PostConfigResponse>() {
           @Override
           public void write(JsonWriter out, PostConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostConfigResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostConfigResponse
  * @throws IOException if the JSON string is invalid with respect to PostConfigResponse
  */
  public static PostConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostConfigResponse.class);
  }

 /**
  * Convert an instance of PostConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

