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
import com.boonamber.models.MPatternMemory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

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
 * MNanoBackend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MNanoBackend {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private BigDecimal versionNumber;

  public static final String SERIALIZED_NAME_M_PATTERN_MEMORY = "m_PatternMemory";
  @SerializedName(SERIALIZED_NAME_M_PATTERN_MEMORY)
  private MPatternMemory mPatternMemory;

  public static final String SERIALIZED_NAME_M_INIT_COMPLETE = "m_InitComplete";
  @SerializedName(SERIALIZED_NAME_M_INIT_COMPLETE)
  private Boolean mInitComplete;

  public static final String SERIALIZED_NAME_M_PATTERN_LENGTH = "m_PatternLength";
  @SerializedName(SERIALIZED_NAME_M_PATTERN_LENGTH)
  private BigDecimal mPatternLength;

  public static final String SERIALIZED_NAME_M_LEARNING_IS_ON = "m_LearningIsOn";
  @SerializedName(SERIALIZED_NAME_M_LEARNING_IS_ON)
  private Boolean mLearningIsOn;

  public static final String SERIALIZED_NAME_M_NUM_OF_PATTERNS_CLUSTERED = "m_NumOfPatternsClustered";
  @SerializedName(SERIALIZED_NAME_M_NUM_OF_PATTERNS_CLUSTERED)
  private BigDecimal mNumOfPatternsClustered;

  public MNanoBackend() {
  }

  public MNanoBackend versionNumber(BigDecimal versionNumber) {
    
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


  public MNanoBackend mPatternMemory(MPatternMemory mPatternMemory) {
    
    this.mPatternMemory = mPatternMemory;
    return this;
  }

   /**
   * Get mPatternMemory
   * @return mPatternMemory
  **/
  @javax.annotation.Nullable

  public MPatternMemory getmPatternMemory() {
    return mPatternMemory;
  }


  public void setmPatternMemory(MPatternMemory mPatternMemory) {
    this.mPatternMemory = mPatternMemory;
  }


  public MNanoBackend mInitComplete(Boolean mInitComplete) {
    
    this.mInitComplete = mInitComplete;
    return this;
  }

   /**
   * Get mInitComplete
   * @return mInitComplete
  **/
  @javax.annotation.Nullable

  public Boolean getmInitComplete() {
    return mInitComplete;
  }


  public void setmInitComplete(Boolean mInitComplete) {
    this.mInitComplete = mInitComplete;
  }


  public MNanoBackend mPatternLength(BigDecimal mPatternLength) {
    
    this.mPatternLength = mPatternLength;
    return this;
  }

   /**
   * Get mPatternLength
   * @return mPatternLength
  **/
  @javax.annotation.Nullable

  public BigDecimal getmPatternLength() {
    return mPatternLength;
  }


  public void setmPatternLength(BigDecimal mPatternLength) {
    this.mPatternLength = mPatternLength;
  }


  public MNanoBackend mLearningIsOn(Boolean mLearningIsOn) {
    
    this.mLearningIsOn = mLearningIsOn;
    return this;
  }

   /**
   * Get mLearningIsOn
   * @return mLearningIsOn
  **/
  @javax.annotation.Nullable

  public Boolean getmLearningIsOn() {
    return mLearningIsOn;
  }


  public void setmLearningIsOn(Boolean mLearningIsOn) {
    this.mLearningIsOn = mLearningIsOn;
  }


  public MNanoBackend mNumOfPatternsClustered(BigDecimal mNumOfPatternsClustered) {
    
    this.mNumOfPatternsClustered = mNumOfPatternsClustered;
    return this;
  }

   /**
   * Get mNumOfPatternsClustered
   * @return mNumOfPatternsClustered
  **/
  @javax.annotation.Nullable

  public BigDecimal getmNumOfPatternsClustered() {
    return mNumOfPatternsClustered;
  }


  public void setmNumOfPatternsClustered(BigDecimal mNumOfPatternsClustered) {
    this.mNumOfPatternsClustered = mNumOfPatternsClustered;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MNanoBackend mNanoBackend = (MNanoBackend) o;
    return Objects.equals(this.versionNumber, mNanoBackend.versionNumber) &&
        Objects.equals(this.mPatternMemory, mNanoBackend.mPatternMemory) &&
        Objects.equals(this.mInitComplete, mNanoBackend.mInitComplete) &&
        Objects.equals(this.mPatternLength, mNanoBackend.mPatternLength) &&
        Objects.equals(this.mLearningIsOn, mNanoBackend.mLearningIsOn) &&
        Objects.equals(this.mNumOfPatternsClustered, mNanoBackend.mNumOfPatternsClustered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mPatternMemory, mInitComplete, mPatternLength, mLearningIsOn, mNumOfPatternsClustered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MNanoBackend {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mPatternMemory: ").append(toIndentedString(mPatternMemory)).append("\n");
    sb.append("    mInitComplete: ").append(toIndentedString(mInitComplete)).append("\n");
    sb.append("    mPatternLength: ").append(toIndentedString(mPatternLength)).append("\n");
    sb.append("    mLearningIsOn: ").append(toIndentedString(mLearningIsOn)).append("\n");
    sb.append("    mNumOfPatternsClustered: ").append(toIndentedString(mNumOfPatternsClustered)).append("\n");
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
    openapiFields.add("m_PatternMemory");
    openapiFields.add("m_InitComplete");
    openapiFields.add("m_PatternLength");
    openapiFields.add("m_LearningIsOn");
    openapiFields.add("m_NumOfPatternsClustered");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MNanoBackend
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MNanoBackend.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MNanoBackend is not found in the empty JSON string", MNanoBackend.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MNanoBackend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MNanoBackend` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `m_PatternMemory`
      if (jsonObj.get("m_PatternMemory") != null && !jsonObj.get("m_PatternMemory").isJsonNull()) {
        MPatternMemory.validateJsonObject(jsonObj.getAsJsonObject("m_PatternMemory"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MNanoBackend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MNanoBackend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MNanoBackend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MNanoBackend.class));

       return (TypeAdapter<T>) new TypeAdapter<MNanoBackend>() {
           @Override
           public void write(JsonWriter out, MNanoBackend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MNanoBackend read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MNanoBackend given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MNanoBackend
  * @throws IOException if the JSON string is invalid with respect to MNanoBackend
  */
  public static MNanoBackend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MNanoBackend.class);
  }

 /**
  * Convert an instance of MNanoBackend to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

