/*
 * Amber API Server
 * Boon Logic Amber API Server
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.FeatureConfig;

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

import org.openapitools.client.JSON;

/**
 * PostConfigResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T15:34:16.605003-06:00[America/Chicago]")
public class PostConfigResponseAllOf {
  public static final String SERIALIZED_NAME_FEATURE_COUNT = "featureCount";
  @SerializedName(SERIALIZED_NAME_FEATURE_COUNT)
  private Integer featureCount;

  public static final String SERIALIZED_NAME_STREAMING_WINDOW_SIZE = "streamingWindowSize";
  @SerializedName(SERIALIZED_NAME_STREAMING_WINDOW_SIZE)
  private Integer streamingWindowSize;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeatureConfig> features = null;

  public static final String SERIALIZED_NAME_SAMPLES_TO_BUFFER = "samplesToBuffer";
  @SerializedName(SERIALIZED_NAME_SAMPLES_TO_BUFFER)
  private Integer samplesToBuffer;

  public static final String SERIALIZED_NAME_PERCENT_VARIATION_OVERRIDE = "percentVariationOverride";
  @SerializedName(SERIALIZED_NAME_PERCENT_VARIATION_OVERRIDE)
  private Float percentVariationOverride;

  public PostConfigResponseAllOf() {
  }

  public PostConfigResponseAllOf featureCount(Integer featureCount) {
    
    this.featureCount = featureCount;
    return this;
  }

   /**
   * number of features per sample
   * @return featureCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "number of features per sample")

  public Integer getFeatureCount() {
    return featureCount;
  }


  public void setFeatureCount(Integer featureCount) {
    this.featureCount = featureCount;
  }


  public PostConfigResponseAllOf streamingWindowSize(Integer streamingWindowSize) {
    
    this.streamingWindowSize = streamingWindowSize;
    return this;
  }

   /**
   * streaming window size
   * maximum: 500
   * @return streamingWindowSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "streaming window size")

  public Integer getStreamingWindowSize() {
    return streamingWindowSize;
  }


  public void setStreamingWindowSize(Integer streamingWindowSize) {
    this.streamingWindowSize = streamingWindowSize;
  }


  public PostConfigResponseAllOf features(List<FeatureConfig> features) {
    
    this.features = features;
    return this;
  }

  public PostConfigResponseAllOf addFeaturesItem(FeatureConfig featuresItem) {
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
  @ApiModelProperty(value = "")

  public List<FeatureConfig> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeatureConfig> features) {
    this.features = features;
  }


  public PostConfigResponseAllOf samplesToBuffer(Integer samplesToBuffer) {
    
    this.samplesToBuffer = samplesToBuffer;
    return this;
  }

   /**
   * the number of samples to be applied before autotuning begins
   * @return samplesToBuffer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the number of samples to be applied before autotuning begins")

  public Integer getSamplesToBuffer() {
    return samplesToBuffer;
  }


  public void setSamplesToBuffer(Integer samplesToBuffer) {
    this.samplesToBuffer = samplesToBuffer;
  }


  public PostConfigResponseAllOf percentVariationOverride(Float percentVariationOverride) {
    
    this.percentVariationOverride = percentVariationOverride;
    return this;
  }

   /**
   * override autotuned percent variation with this value
   * @return percentVariationOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "override autotuned percent variation with this value")

  public Float getPercentVariationOverride() {
    return percentVariationOverride;
  }


  public void setPercentVariationOverride(Float percentVariationOverride) {
    this.percentVariationOverride = percentVariationOverride;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostConfigResponseAllOf postConfigResponseAllOf = (PostConfigResponseAllOf) o;
    return Objects.equals(this.featureCount, postConfigResponseAllOf.featureCount) &&
        Objects.equals(this.streamingWindowSize, postConfigResponseAllOf.streamingWindowSize) &&
        Objects.equals(this.features, postConfigResponseAllOf.features) &&
        Objects.equals(this.samplesToBuffer, postConfigResponseAllOf.samplesToBuffer) &&
        Objects.equals(this.percentVariationOverride, postConfigResponseAllOf.percentVariationOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureCount, streamingWindowSize, features, samplesToBuffer, percentVariationOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostConfigResponseAllOf {\n");
    sb.append("    featureCount: ").append(toIndentedString(featureCount)).append("\n");
    sb.append("    streamingWindowSize: ").append(toIndentedString(streamingWindowSize)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    samplesToBuffer: ").append(toIndentedString(samplesToBuffer)).append("\n");
    sb.append("    percentVariationOverride: ").append(toIndentedString(percentVariationOverride)).append("\n");
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
    openapiFields.add("featureCount");
    openapiFields.add("streamingWindowSize");
    openapiFields.add("features");
    openapiFields.add("samplesToBuffer");
    openapiFields.add("percentVariationOverride");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("featureCount");
    openapiRequiredFields.add("streamingWindowSize");
    openapiRequiredFields.add("samplesToBuffer");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostConfigResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostConfigResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostConfigResponseAllOf is not found in the empty JSON string", PostConfigResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostConfigResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostConfigResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostConfigResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
            FeatureConfig.validateJsonObject(jsonArrayfeatures.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostConfigResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostConfigResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostConfigResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostConfigResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PostConfigResponseAllOf>() {
           @Override
           public void write(JsonWriter out, PostConfigResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostConfigResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostConfigResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostConfigResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to PostConfigResponseAllOf
  */
  public static PostConfigResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostConfigResponseAllOf.class);
  }

 /**
  * Convert an instance of PostConfigResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

