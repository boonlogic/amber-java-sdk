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


package com.boonamber.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 * MAP
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MAP {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private BigDecimal versionNumber;

  public static final String SERIALIZED_NAME_M_AUTOTUNE_RANGE = "m_AutotuneRange";
  @SerializedName(SERIALIZED_NAME_M_AUTOTUNE_RANGE)
  private Boolean mAutotuneRange;

  public static final String SERIALIZED_NAME_M_AUTOTUNE_P_V = "m_AutotunePV";
  @SerializedName(SERIALIZED_NAME_M_AUTOTUNE_P_V)
  private Boolean mAutotunePV;

  public static final String SERIALIZED_NAME_M_AUTOTUNE_BY_FEATURES = "m_AutotuneByFeatures";
  @SerializedName(SERIALIZED_NAME_M_AUTOTUNE_BY_FEATURES)
  private Boolean mAutotuneByFeatures;

  public static final String SERIALIZED_NAME_M_MAX_CLUSTERS = "m_MaxClusters";
  @SerializedName(SERIALIZED_NAME_M_MAX_CLUSTERS)
  private BigDecimal mMaxClusters;

  public static final String SERIALIZED_NAME_M_FEATURES_TO_TUNE_ARRAY = "m_FeaturesToTuneArray";
  @SerializedName(SERIALIZED_NAME_M_FEATURES_TO_TUNE_ARRAY)
  private List<BigDecimal> mFeaturesToTuneArray = new ArrayList<>();

  public MAP() {
  }

  public MAP versionNumber(BigDecimal versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @javax.annotation.Nullable

  public BigDecimal getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(BigDecimal versionNumber) {
    this.versionNumber = versionNumber;
  }


  public MAP mAutotuneRange(Boolean mAutotuneRange) {
    
    this.mAutotuneRange = mAutotuneRange;
    return this;
  }

   /**
   * Get mAutotuneRange
   * @return mAutotuneRange
  **/
  @javax.annotation.Nonnull

  public Boolean getmAutotuneRange() {
    return mAutotuneRange;
  }


  public void setmAutotuneRange(Boolean mAutotuneRange) {
    this.mAutotuneRange = mAutotuneRange;
  }


  public MAP mAutotunePV(Boolean mAutotunePV) {
    
    this.mAutotunePV = mAutotunePV;
    return this;
  }

   /**
   * Get mAutotunePV
   * @return mAutotunePV
  **/
  @javax.annotation.Nonnull

  public Boolean getmAutotunePV() {
    return mAutotunePV;
  }


  public void setmAutotunePV(Boolean mAutotunePV) {
    this.mAutotunePV = mAutotunePV;
  }


  public MAP mAutotuneByFeatures(Boolean mAutotuneByFeatures) {
    
    this.mAutotuneByFeatures = mAutotuneByFeatures;
    return this;
  }

   /**
   * Get mAutotuneByFeatures
   * @return mAutotuneByFeatures
  **/
  @javax.annotation.Nonnull

  public Boolean getmAutotuneByFeatures() {
    return mAutotuneByFeatures;
  }


  public void setmAutotuneByFeatures(Boolean mAutotuneByFeatures) {
    this.mAutotuneByFeatures = mAutotuneByFeatures;
  }


  public MAP mMaxClusters(BigDecimal mMaxClusters) {
    
    this.mMaxClusters = mMaxClusters;
    return this;
  }

   /**
   * Get mMaxClusters
   * @return mMaxClusters
  **/
  @javax.annotation.Nullable

  public BigDecimal getmMaxClusters() {
    return mMaxClusters;
  }


  public void setmMaxClusters(BigDecimal mMaxClusters) {
    this.mMaxClusters = mMaxClusters;
  }


  public MAP mFeaturesToTuneArray(List<BigDecimal> mFeaturesToTuneArray) {
    
    this.mFeaturesToTuneArray = mFeaturesToTuneArray;
    return this;
  }

  public MAP addMFeaturesToTuneArrayItem(BigDecimal mFeaturesToTuneArrayItem) {
    if (this.mFeaturesToTuneArray == null) {
      this.mFeaturesToTuneArray = new ArrayList<>();
    }
    this.mFeaturesToTuneArray.add(mFeaturesToTuneArrayItem);
    return this;
  }

   /**
   * Get mFeaturesToTuneArray
   * @return mFeaturesToTuneArray
  **/
  @javax.annotation.Nullable

  public List<BigDecimal> getmFeaturesToTuneArray() {
    return mFeaturesToTuneArray;
  }


  public void setmFeaturesToTuneArray(List<BigDecimal> mFeaturesToTuneArray) {
    this.mFeaturesToTuneArray = mFeaturesToTuneArray;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MAP mAP = (MAP) o;
    return Objects.equals(this.versionNumber, mAP.versionNumber) &&
        Objects.equals(this.mAutotuneRange, mAP.mAutotuneRange) &&
        Objects.equals(this.mAutotunePV, mAP.mAutotunePV) &&
        Objects.equals(this.mAutotuneByFeatures, mAP.mAutotuneByFeatures) &&
        Objects.equals(this.mMaxClusters, mAP.mMaxClusters) &&
        Objects.equals(this.mFeaturesToTuneArray, mAP.mFeaturesToTuneArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mAutotuneRange, mAutotunePV, mAutotuneByFeatures, mMaxClusters, mFeaturesToTuneArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MAP {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mAutotuneRange: ").append(toIndentedString(mAutotuneRange)).append("\n");
    sb.append("    mAutotunePV: ").append(toIndentedString(mAutotunePV)).append("\n");
    sb.append("    mAutotuneByFeatures: ").append(toIndentedString(mAutotuneByFeatures)).append("\n");
    sb.append("    mMaxClusters: ").append(toIndentedString(mMaxClusters)).append("\n");
    sb.append("    mFeaturesToTuneArray: ").append(toIndentedString(mFeaturesToTuneArray)).append("\n");
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
    openapiFields.add("versionNumber");
    openapiFields.add("m_AutotuneRange");
    openapiFields.add("m_AutotunePV");
    openapiFields.add("m_AutotuneByFeatures");
    openapiFields.add("m_MaxClusters");
    openapiFields.add("m_FeaturesToTuneArray");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_AutotuneRange");
    openapiRequiredFields.add("m_AutotunePV");
    openapiRequiredFields.add("m_AutotuneByFeatures");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MAP
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MAP.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MAP is not found in the empty JSON string", MAP.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MAP.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MAP` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MAP.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("m_FeaturesToTuneArray") != null && !jsonObj.get("m_FeaturesToTuneArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_FeaturesToTuneArray` to be an array in the JSON string but got `%s`", jsonObj.get("m_FeaturesToTuneArray").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MAP.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MAP' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MAP> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MAP.class));

       return (TypeAdapter<T>) new TypeAdapter<MAP>() {
           @Override
           public void write(JsonWriter out, MAP value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MAP read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MAP given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MAP
  * @throws IOException if the JSON string is invalid with respect to MAP
  */
  public static MAP fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MAP.class);
  }

 /**
  * Convert an instance of MAP to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
