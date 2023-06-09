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
 * MTraining
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MTraining {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private List<BigDecimal> versionNumber = new ArrayList<>();

  public static final String SERIALIZED_NAME_M_GEOMETRIC_PLOT_Y = "m_GeometricPlotY";
  @SerializedName(SERIALIZED_NAME_M_GEOMETRIC_PLOT_Y)
  private List<Float> mGeometricPlotY = new ArrayList<>();

  public static final String SERIALIZED_NAME_M_GEOMETRIC_PLOT_X = "m_GeometricPlotX";
  @SerializedName(SERIALIZED_NAME_M_GEOMETRIC_PLOT_X)
  private List<BigDecimal> mGeometricPlotX = new ArrayList<>();

  public static final String SERIALIZED_NAME_M_CLUSTER_GROWTH = "m_ClusterGrowth";
  @SerializedName(SERIALIZED_NAME_M_CLUSTER_GROWTH)
  private List<BigDecimal> mClusterGrowth = new ArrayList<>();

  public static final String SERIALIZED_NAME_M_ANOMALY_INDEXES = "m_AnomalyIndexes";
  @SerializedName(SERIALIZED_NAME_M_ANOMALY_INDEXES)
  private List<BigDecimal> mAnomalyIndexes = new ArrayList<>();

  public MTraining() {
  }

  public MTraining versionNumber(List<BigDecimal> versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

  public MTraining addVersionNumberItem(BigDecimal versionNumberItem) {
    if (this.versionNumber == null) {
      this.versionNumber = new ArrayList<>();
    }
    this.versionNumber.add(versionNumberItem);
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @javax.annotation.Nullable

  public List<BigDecimal> getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(List<BigDecimal> versionNumber) {
    this.versionNumber = versionNumber;
  }


  public MTraining mGeometricPlotY(List<Float> mGeometricPlotY) {
    
    this.mGeometricPlotY = mGeometricPlotY;
    return this;
  }

  public MTraining addMGeometricPlotYItem(Float mGeometricPlotYItem) {
    this.mGeometricPlotY.add(mGeometricPlotYItem);
    return this;
  }

   /**
   * Get mGeometricPlotY
   * @return mGeometricPlotY
  **/
  @javax.annotation.Nonnull

  public List<Float> getmGeometricPlotY() {
    return mGeometricPlotY;
  }


  public void setmGeometricPlotY(List<Float> mGeometricPlotY) {
    this.mGeometricPlotY = mGeometricPlotY;
  }


  public MTraining mGeometricPlotX(List<BigDecimal> mGeometricPlotX) {
    
    this.mGeometricPlotX = mGeometricPlotX;
    return this;
  }

  public MTraining addMGeometricPlotXItem(BigDecimal mGeometricPlotXItem) {
    this.mGeometricPlotX.add(mGeometricPlotXItem);
    return this;
  }

   /**
   * Get mGeometricPlotX
   * @return mGeometricPlotX
  **/
  @javax.annotation.Nonnull

  public List<BigDecimal> getmGeometricPlotX() {
    return mGeometricPlotX;
  }


  public void setmGeometricPlotX(List<BigDecimal> mGeometricPlotX) {
    this.mGeometricPlotX = mGeometricPlotX;
  }


  public MTraining mClusterGrowth(List<BigDecimal> mClusterGrowth) {
    
    this.mClusterGrowth = mClusterGrowth;
    return this;
  }

  public MTraining addMClusterGrowthItem(BigDecimal mClusterGrowthItem) {
    this.mClusterGrowth.add(mClusterGrowthItem);
    return this;
  }

   /**
   * Get mClusterGrowth
   * @return mClusterGrowth
  **/
  @javax.annotation.Nonnull

  public List<BigDecimal> getmClusterGrowth() {
    return mClusterGrowth;
  }


  public void setmClusterGrowth(List<BigDecimal> mClusterGrowth) {
    this.mClusterGrowth = mClusterGrowth;
  }


  public MTraining mAnomalyIndexes(List<BigDecimal> mAnomalyIndexes) {
    
    this.mAnomalyIndexes = mAnomalyIndexes;
    return this;
  }

  public MTraining addMAnomalyIndexesItem(BigDecimal mAnomalyIndexesItem) {
    if (this.mAnomalyIndexes == null) {
      this.mAnomalyIndexes = new ArrayList<>();
    }
    this.mAnomalyIndexes.add(mAnomalyIndexesItem);
    return this;
  }

   /**
   * Get mAnomalyIndexes
   * @return mAnomalyIndexes
  **/
  @javax.annotation.Nullable

  public List<BigDecimal> getmAnomalyIndexes() {
    return mAnomalyIndexes;
  }


  public void setmAnomalyIndexes(List<BigDecimal> mAnomalyIndexes) {
    this.mAnomalyIndexes = mAnomalyIndexes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MTraining mTraining = (MTraining) o;
    return Objects.equals(this.versionNumber, mTraining.versionNumber) &&
        Objects.equals(this.mGeometricPlotY, mTraining.mGeometricPlotY) &&
        Objects.equals(this.mGeometricPlotX, mTraining.mGeometricPlotX) &&
        Objects.equals(this.mClusterGrowth, mTraining.mClusterGrowth) &&
        Objects.equals(this.mAnomalyIndexes, mTraining.mAnomalyIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mGeometricPlotY, mGeometricPlotX, mClusterGrowth, mAnomalyIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MTraining {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mGeometricPlotY: ").append(toIndentedString(mGeometricPlotY)).append("\n");
    sb.append("    mGeometricPlotX: ").append(toIndentedString(mGeometricPlotX)).append("\n");
    sb.append("    mClusterGrowth: ").append(toIndentedString(mClusterGrowth)).append("\n");
    sb.append("    mAnomalyIndexes: ").append(toIndentedString(mAnomalyIndexes)).append("\n");
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
    openapiFields.add("m_GeometricPlotY");
    openapiFields.add("m_GeometricPlotX");
    openapiFields.add("m_ClusterGrowth");
    openapiFields.add("m_AnomalyIndexes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_GeometricPlotY");
    openapiRequiredFields.add("m_GeometricPlotX");
    openapiRequiredFields.add("m_ClusterGrowth");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MTraining
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MTraining.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MTraining is not found in the empty JSON string", MTraining.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MTraining.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MTraining` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MTraining.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("versionNumber") != null && !jsonObj.get("versionNumber").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionNumber` to be an array in the JSON string but got `%s`", jsonObj.get("versionNumber").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("m_GeometricPlotY") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("m_GeometricPlotY").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_GeometricPlotY` to be an array in the JSON string but got `%s`", jsonObj.get("m_GeometricPlotY").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("m_GeometricPlotX") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("m_GeometricPlotX").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_GeometricPlotX` to be an array in the JSON string but got `%s`", jsonObj.get("m_GeometricPlotX").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("m_ClusterGrowth") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("m_ClusterGrowth").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_ClusterGrowth` to be an array in the JSON string but got `%s`", jsonObj.get("m_ClusterGrowth").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("m_AnomalyIndexes") != null && !jsonObj.get("m_AnomalyIndexes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_AnomalyIndexes` to be an array in the JSON string but got `%s`", jsonObj.get("m_AnomalyIndexes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MTraining.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MTraining' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MTraining> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MTraining.class));

       return (TypeAdapter<T>) new TypeAdapter<MTraining>() {
           @Override
           public void write(JsonWriter out, MTraining value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MTraining read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MTraining given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MTraining
  * @throws IOException if the JSON string is invalid with respect to MTraining
  */
  public static MTraining fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MTraining.class);
  }

 /**
  * Convert an instance of MTraining to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

