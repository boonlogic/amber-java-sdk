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
 * MNanoConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T15:34:16.605003-06:00[America/Chicago]")
public class MNanoConfig {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "VersionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_M_NUMERIC_FORMAT = "m_NumericFormat";
  @SerializedName(SERIALIZED_NAME_M_NUMERIC_FORMAT)
  private Integer mNumericFormat;

  public static final String SERIALIZED_NAME_M_ACCURACY = "m_Accuracy";
  @SerializedName(SERIALIZED_NAME_M_ACCURACY)
  private Float mAccuracy;

  public static final String SERIALIZED_NAME_M_PERCENT_VARIATION = "m_PercentVariation";
  @SerializedName(SERIALIZED_NAME_M_PERCENT_VARIATION)
  private Float mPercentVariation;

  public static final String SERIALIZED_NAME_NUM_OF_FEATURES = "NumOfFeatures";
  @SerializedName(SERIALIZED_NAME_NUM_OF_FEATURES)
  private Integer numOfFeatures;

  public static final String SERIALIZED_NAME_FEATURES = "Features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeatureConfig> features = new ArrayList<>();

  public MNanoConfig() {
  }

  public MNanoConfig versionNumber(Integer versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public MNanoConfig mNumericFormat(Integer mNumericFormat) {
    
    this.mNumericFormat = mNumericFormat;
    return this;
  }

   /**
   * Get mNumericFormat
   * @return mNumericFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getmNumericFormat() {
    return mNumericFormat;
  }


  public void setmNumericFormat(Integer mNumericFormat) {
    this.mNumericFormat = mNumericFormat;
  }


  public MNanoConfig mAccuracy(Float mAccuracy) {
    
    this.mAccuracy = mAccuracy;
    return this;
  }

   /**
   * Get mAccuracy
   * @return mAccuracy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getmAccuracy() {
    return mAccuracy;
  }


  public void setmAccuracy(Float mAccuracy) {
    this.mAccuracy = mAccuracy;
  }


  public MNanoConfig mPercentVariation(Float mPercentVariation) {
    
    this.mPercentVariation = mPercentVariation;
    return this;
  }

   /**
   * the percent variation (for instance, 0.025 gives 2.5% variation) used for clustering
   * @return mPercentVariation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the percent variation (for instance, 0.025 gives 2.5% variation) used for clustering")

  public Float getmPercentVariation() {
    return mPercentVariation;
  }


  public void setmPercentVariation(Float mPercentVariation) {
    this.mPercentVariation = mPercentVariation;
  }


  public MNanoConfig numOfFeatures(Integer numOfFeatures) {
    
    this.numOfFeatures = numOfFeatures;
    return this;
  }

   /**
   * Get numOfFeatures
   * @return numOfFeatures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNumOfFeatures() {
    return numOfFeatures;
  }


  public void setNumOfFeatures(Integer numOfFeatures) {
    this.numOfFeatures = numOfFeatures;
  }


  public MNanoConfig features(List<FeatureConfig> features) {
    
    this.features = features;
    return this;
  }

  public MNanoConfig addFeaturesItem(FeatureConfig featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FeatureConfig> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeatureConfig> features) {
    this.features = features;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MNanoConfig mNanoConfig = (MNanoConfig) o;
    return Objects.equals(this.versionNumber, mNanoConfig.versionNumber) &&
        Objects.equals(this.mNumericFormat, mNanoConfig.mNumericFormat) &&
        Objects.equals(this.mAccuracy, mNanoConfig.mAccuracy) &&
        Objects.equals(this.mPercentVariation, mNanoConfig.mPercentVariation) &&
        Objects.equals(this.numOfFeatures, mNanoConfig.numOfFeatures) &&
        Objects.equals(this.features, mNanoConfig.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mNumericFormat, mAccuracy, mPercentVariation, numOfFeatures, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MNanoConfig {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mNumericFormat: ").append(toIndentedString(mNumericFormat)).append("\n");
    sb.append("    mAccuracy: ").append(toIndentedString(mAccuracy)).append("\n");
    sb.append("    mPercentVariation: ").append(toIndentedString(mPercentVariation)).append("\n");
    sb.append("    numOfFeatures: ").append(toIndentedString(numOfFeatures)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
    openapiFields.add("VersionNumber");
    openapiFields.add("m_NumericFormat");
    openapiFields.add("m_Accuracy");
    openapiFields.add("m_PercentVariation");
    openapiFields.add("NumOfFeatures");
    openapiFields.add("Features");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_PercentVariation");
    openapiRequiredFields.add("NumOfFeatures");
    openapiRequiredFields.add("Features");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MNanoConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MNanoConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MNanoConfig is not found in the empty JSON string", MNanoConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MNanoConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MNanoConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MNanoConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("Features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Features` to be an array in the JSON string but got `%s`", jsonObj.get("Features").toString()));
      }

      JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("Features");
      // validate the required field `Features` (array)
      for (int i = 0; i < jsonArrayfeatures.size(); i++) {
        FeatureConfig.validateJsonObject(jsonArrayfeatures.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MNanoConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MNanoConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MNanoConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MNanoConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<MNanoConfig>() {
           @Override
           public void write(JsonWriter out, MNanoConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MNanoConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MNanoConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MNanoConfig
  * @throws IOException if the JSON string is invalid with respect to MNanoConfig
  */
  public static MNanoConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MNanoConfig.class);
  }

 /**
  * Convert an instance of MNanoConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

