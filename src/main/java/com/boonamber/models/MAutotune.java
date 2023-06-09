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
import com.boonamber.models.MAP;
import com.boonamber.models.MNCP;
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
 * MAutotune
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MAutotune {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private BigDecimal versionNumber;

  public static final String SERIALIZED_NAME_M_AUTOTUNING_IN_PROGRESS = "m_AutotuningInProgress";
  @SerializedName(SERIALIZED_NAME_M_AUTOTUNING_IN_PROGRESS)
  private Boolean mAutotuningInProgress;

  public static final String SERIALIZED_NAME_M_PERCENT_COMPLETE = "m_PercentComplete";
  @SerializedName(SERIALIZED_NAME_M_PERCENT_COMPLETE)
  private BigDecimal mPercentComplete;

  public static final String SERIALIZED_NAME_M_AUTOTUNING_SUCCEEDED = "m_AutotuningSucceeded";
  @SerializedName(SERIALIZED_NAME_M_AUTOTUNING_SUCCEEDED)
  private Boolean mAutotuningSucceeded;

  public static final String SERIALIZED_NAME_M_NUM_PATTERNS_TO_AUTOTUNE = "m_NumPatternsToAutotune";
  @SerializedName(SERIALIZED_NAME_M_NUM_PATTERNS_TO_AUTOTUNE)
  private BigDecimal mNumPatternsToAutotune;

  public static final String SERIALIZED_NAME_M_ERROR_STRING_BUFFER = "m_ErrorStringBuffer";
  @SerializedName(SERIALIZED_NAME_M_ERROR_STRING_BUFFER)
  private String mErrorStringBuffer;

  public static final String SERIALIZED_NAME_M_FEATURES_TO_TUNE_ARRAY = "m_FeaturesToTuneArray";
  @SerializedName(SERIALIZED_NAME_M_FEATURES_TO_TUNE_ARRAY)
  private List<Boolean> mFeaturesToTuneArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_M_N_C_P = "m_NCP";
  @SerializedName(SERIALIZED_NAME_M_N_C_P)
  private MNCP mNCP;

  public static final String SERIALIZED_NAME_M_A_P = "m_AP";
  @SerializedName(SERIALIZED_NAME_M_A_P)
  private MAP mAP;

  public MAutotune() {
  }

  public MAutotune versionNumber(BigDecimal versionNumber) {
    
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


  public MAutotune mAutotuningInProgress(Boolean mAutotuningInProgress) {
    
    this.mAutotuningInProgress = mAutotuningInProgress;
    return this;
  }

   /**
   * Get mAutotuningInProgress
   * @return mAutotuningInProgress
  **/
  @javax.annotation.Nullable

  public Boolean getmAutotuningInProgress() {
    return mAutotuningInProgress;
  }


  public void setmAutotuningInProgress(Boolean mAutotuningInProgress) {
    this.mAutotuningInProgress = mAutotuningInProgress;
  }


  public MAutotune mPercentComplete(BigDecimal mPercentComplete) {
    
    this.mPercentComplete = mPercentComplete;
    return this;
  }

   /**
   * Get mPercentComplete
   * @return mPercentComplete
  **/
  @javax.annotation.Nullable

  public BigDecimal getmPercentComplete() {
    return mPercentComplete;
  }


  public void setmPercentComplete(BigDecimal mPercentComplete) {
    this.mPercentComplete = mPercentComplete;
  }


  public MAutotune mAutotuningSucceeded(Boolean mAutotuningSucceeded) {
    
    this.mAutotuningSucceeded = mAutotuningSucceeded;
    return this;
  }

   /**
   * Get mAutotuningSucceeded
   * @return mAutotuningSucceeded
  **/
  @javax.annotation.Nullable

  public Boolean getmAutotuningSucceeded() {
    return mAutotuningSucceeded;
  }


  public void setmAutotuningSucceeded(Boolean mAutotuningSucceeded) {
    this.mAutotuningSucceeded = mAutotuningSucceeded;
  }


  public MAutotune mNumPatternsToAutotune(BigDecimal mNumPatternsToAutotune) {
    
    this.mNumPatternsToAutotune = mNumPatternsToAutotune;
    return this;
  }

   /**
   * Get mNumPatternsToAutotune
   * @return mNumPatternsToAutotune
  **/
  @javax.annotation.Nullable

  public BigDecimal getmNumPatternsToAutotune() {
    return mNumPatternsToAutotune;
  }


  public void setmNumPatternsToAutotune(BigDecimal mNumPatternsToAutotune) {
    this.mNumPatternsToAutotune = mNumPatternsToAutotune;
  }


  public MAutotune mErrorStringBuffer(String mErrorStringBuffer) {
    
    this.mErrorStringBuffer = mErrorStringBuffer;
    return this;
  }

   /**
   * Get mErrorStringBuffer
   * @return mErrorStringBuffer
  **/
  @javax.annotation.Nullable

  public String getmErrorStringBuffer() {
    return mErrorStringBuffer;
  }


  public void setmErrorStringBuffer(String mErrorStringBuffer) {
    this.mErrorStringBuffer = mErrorStringBuffer;
  }


  public MAutotune mFeaturesToTuneArray(List<Boolean> mFeaturesToTuneArray) {
    
    this.mFeaturesToTuneArray = mFeaturesToTuneArray;
    return this;
  }

  public MAutotune addMFeaturesToTuneArrayItem(Boolean mFeaturesToTuneArrayItem) {
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

  public List<Boolean> getmFeaturesToTuneArray() {
    return mFeaturesToTuneArray;
  }


  public void setmFeaturesToTuneArray(List<Boolean> mFeaturesToTuneArray) {
    this.mFeaturesToTuneArray = mFeaturesToTuneArray;
  }


  public MAutotune mNCP(MNCP mNCP) {
    
    this.mNCP = mNCP;
    return this;
  }

   /**
   * Get mNCP
   * @return mNCP
  **/
  @javax.annotation.Nullable

  public MNCP getmNCP() {
    return mNCP;
  }


  public void setmNCP(MNCP mNCP) {
    this.mNCP = mNCP;
  }


  public MAutotune mAP(MAP mAP) {
    
    this.mAP = mAP;
    return this;
  }

   /**
   * Get mAP
   * @return mAP
  **/
  @javax.annotation.Nonnull

  public MAP getmAP() {
    return mAP;
  }


  public void setmAP(MAP mAP) {
    this.mAP = mAP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MAutotune mAutotune = (MAutotune) o;
    return Objects.equals(this.versionNumber, mAutotune.versionNumber) &&
        Objects.equals(this.mAutotuningInProgress, mAutotune.mAutotuningInProgress) &&
        Objects.equals(this.mPercentComplete, mAutotune.mPercentComplete) &&
        Objects.equals(this.mAutotuningSucceeded, mAutotune.mAutotuningSucceeded) &&
        Objects.equals(this.mNumPatternsToAutotune, mAutotune.mNumPatternsToAutotune) &&
        Objects.equals(this.mErrorStringBuffer, mAutotune.mErrorStringBuffer) &&
        Objects.equals(this.mFeaturesToTuneArray, mAutotune.mFeaturesToTuneArray) &&
        Objects.equals(this.mNCP, mAutotune.mNCP) &&
        Objects.equals(this.mAP, mAutotune.mAP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mAutotuningInProgress, mPercentComplete, mAutotuningSucceeded, mNumPatternsToAutotune, mErrorStringBuffer, mFeaturesToTuneArray, mNCP, mAP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MAutotune {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mAutotuningInProgress: ").append(toIndentedString(mAutotuningInProgress)).append("\n");
    sb.append("    mPercentComplete: ").append(toIndentedString(mPercentComplete)).append("\n");
    sb.append("    mAutotuningSucceeded: ").append(toIndentedString(mAutotuningSucceeded)).append("\n");
    sb.append("    mNumPatternsToAutotune: ").append(toIndentedString(mNumPatternsToAutotune)).append("\n");
    sb.append("    mErrorStringBuffer: ").append(toIndentedString(mErrorStringBuffer)).append("\n");
    sb.append("    mFeaturesToTuneArray: ").append(toIndentedString(mFeaturesToTuneArray)).append("\n");
    sb.append("    mNCP: ").append(toIndentedString(mNCP)).append("\n");
    sb.append("    mAP: ").append(toIndentedString(mAP)).append("\n");
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
    openapiFields.add("m_AutotuningInProgress");
    openapiFields.add("m_PercentComplete");
    openapiFields.add("m_AutotuningSucceeded");
    openapiFields.add("m_NumPatternsToAutotune");
    openapiFields.add("m_ErrorStringBuffer");
    openapiFields.add("m_FeaturesToTuneArray");
    openapiFields.add("m_NCP");
    openapiFields.add("m_AP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_AP");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MAutotune
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MAutotune.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MAutotune is not found in the empty JSON string", MAutotune.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MAutotune.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MAutotune` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MAutotune.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("m_ErrorStringBuffer") != null && !jsonObj.get("m_ErrorStringBuffer").isJsonNull()) && !jsonObj.get("m_ErrorStringBuffer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_ErrorStringBuffer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_ErrorStringBuffer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("m_FeaturesToTuneArray") != null && !jsonObj.get("m_FeaturesToTuneArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_FeaturesToTuneArray` to be an array in the JSON string but got `%s`", jsonObj.get("m_FeaturesToTuneArray").toString()));
      }
      // validate the optional field `m_NCP`
      if (jsonObj.get("m_NCP") != null && !jsonObj.get("m_NCP").isJsonNull()) {
        MNCP.validateJsonObject(jsonObj.getAsJsonObject("m_NCP"));
      }
      // validate the required field `m_AP`
      MAP.validateJsonObject(jsonObj.getAsJsonObject("m_AP"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MAutotune.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MAutotune' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MAutotune> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MAutotune.class));

       return (TypeAdapter<T>) new TypeAdapter<MAutotune>() {
           @Override
           public void write(JsonWriter out, MAutotune value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MAutotune read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MAutotune given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MAutotune
  * @throws IOException if the JSON string is invalid with respect to MAutotune
  */
  public static MAutotune fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MAutotune.class);
  }

 /**
  * Convert an instance of MAutotune to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

