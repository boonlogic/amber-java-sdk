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
 * MAmberStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T09:54:04.469994-06:00[America/Chicago]")
public class MAmberStatus {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "VersionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_M_STATUS = "m_Status";
  @SerializedName(SERIALIZED_NAME_M_STATUS)
  private String mStatus;

  public static final String SERIALIZED_NAME_M_MESSAGE = "m_Message";
  @SerializedName(SERIALIZED_NAME_M_MESSAGE)
  private String mMessage;

  public static final String SERIALIZED_NAME_M_PROGRESS = "m_Progress";
  @SerializedName(SERIALIZED_NAME_M_PROGRESS)
  private Integer mProgress;

  public static final String SERIALIZED_NAME_M_CURRENT_CLUSTER_COUNT = "m_CurrentClusterCount";
  @SerializedName(SERIALIZED_NAME_M_CURRENT_CLUSTER_COUNT)
  private Integer mCurrentClusterCount;

  public static final String SERIALIZED_NAME_M_RETRY_COUNT = "m_RetryCount";
  @SerializedName(SERIALIZED_NAME_M_RETRY_COUNT)
  private Integer mRetryCount;

  public static final String SERIALIZED_NAME_M_STREAMING_WINDOW_SIZE = "m_StreamingWindowSize";
  @SerializedName(SERIALIZED_NAME_M_STREAMING_WINDOW_SIZE)
  private Integer mStreamingWindowSize;

  public static final String SERIALIZED_NAME_M_TOTAL_INFERENCES = "m_TotalInferences";
  @SerializedName(SERIALIZED_NAME_M_TOTAL_INFERENCES)
  private Integer mTotalInferences;

  public static final String SERIALIZED_NAME_M_TOTAL_SAMPLES_WRITTEN = "m_TotalSamplesWritten";
  @SerializedName(SERIALIZED_NAME_M_TOTAL_SAMPLES_WRITTEN)
  private Integer mTotalSamplesWritten;

  public MAmberStatus() {
  }

  public MAmberStatus versionNumber(Integer versionNumber) {
    
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


  public MAmberStatus mStatus(String mStatus) {
    
    this.mStatus = mStatus;
    return this;
  }

   /**
   * Get mStatus
   * @return mStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getmStatus() {
    return mStatus;
  }


  public void setmStatus(String mStatus) {
    this.mStatus = mStatus;
  }


  public MAmberStatus mMessage(String mMessage) {
    
    this.mMessage = mMessage;
    return this;
  }

   /**
   * Get mMessage
   * @return mMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getmMessage() {
    return mMessage;
  }


  public void setmMessage(String mMessage) {
    this.mMessage = mMessage;
  }


  public MAmberStatus mProgress(Integer mProgress) {
    
    this.mProgress = mProgress;
    return this;
  }

   /**
   * Get mProgress
   * @return mProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getmProgress() {
    return mProgress;
  }


  public void setmProgress(Integer mProgress) {
    this.mProgress = mProgress;
  }


  public MAmberStatus mCurrentClusterCount(Integer mCurrentClusterCount) {
    
    this.mCurrentClusterCount = mCurrentClusterCount;
    return this;
  }

   /**
   * Get mCurrentClusterCount
   * @return mCurrentClusterCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getmCurrentClusterCount() {
    return mCurrentClusterCount;
  }


  public void setmCurrentClusterCount(Integer mCurrentClusterCount) {
    this.mCurrentClusterCount = mCurrentClusterCount;
  }


  public MAmberStatus mRetryCount(Integer mRetryCount) {
    
    this.mRetryCount = mRetryCount;
    return this;
  }

   /**
   * Get mRetryCount
   * @return mRetryCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getmRetryCount() {
    return mRetryCount;
  }


  public void setmRetryCount(Integer mRetryCount) {
    this.mRetryCount = mRetryCount;
  }


  public MAmberStatus mStreamingWindowSize(Integer mStreamingWindowSize) {
    
    this.mStreamingWindowSize = mStreamingWindowSize;
    return this;
  }

   /**
   * Get mStreamingWindowSize
   * @return mStreamingWindowSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getmStreamingWindowSize() {
    return mStreamingWindowSize;
  }


  public void setmStreamingWindowSize(Integer mStreamingWindowSize) {
    this.mStreamingWindowSize = mStreamingWindowSize;
  }


  public MAmberStatus mTotalInferences(Integer mTotalInferences) {
    
    this.mTotalInferences = mTotalInferences;
    return this;
  }

   /**
   * Get mTotalInferences
   * @return mTotalInferences
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getmTotalInferences() {
    return mTotalInferences;
  }


  public void setmTotalInferences(Integer mTotalInferences) {
    this.mTotalInferences = mTotalInferences;
  }


  public MAmberStatus mTotalSamplesWritten(Integer mTotalSamplesWritten) {
    
    this.mTotalSamplesWritten = mTotalSamplesWritten;
    return this;
  }

   /**
   * Get mTotalSamplesWritten
   * @return mTotalSamplesWritten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getmTotalSamplesWritten() {
    return mTotalSamplesWritten;
  }


  public void setmTotalSamplesWritten(Integer mTotalSamplesWritten) {
    this.mTotalSamplesWritten = mTotalSamplesWritten;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MAmberStatus mAmberStatus = (MAmberStatus) o;
    return Objects.equals(this.versionNumber, mAmberStatus.versionNumber) &&
        Objects.equals(this.mStatus, mAmberStatus.mStatus) &&
        Objects.equals(this.mMessage, mAmberStatus.mMessage) &&
        Objects.equals(this.mProgress, mAmberStatus.mProgress) &&
        Objects.equals(this.mCurrentClusterCount, mAmberStatus.mCurrentClusterCount) &&
        Objects.equals(this.mRetryCount, mAmberStatus.mRetryCount) &&
        Objects.equals(this.mStreamingWindowSize, mAmberStatus.mStreamingWindowSize) &&
        Objects.equals(this.mTotalInferences, mAmberStatus.mTotalInferences) &&
        Objects.equals(this.mTotalSamplesWritten, mAmberStatus.mTotalSamplesWritten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mStatus, mMessage, mProgress, mCurrentClusterCount, mRetryCount, mStreamingWindowSize, mTotalInferences, mTotalSamplesWritten);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MAmberStatus {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mStatus: ").append(toIndentedString(mStatus)).append("\n");
    sb.append("    mMessage: ").append(toIndentedString(mMessage)).append("\n");
    sb.append("    mProgress: ").append(toIndentedString(mProgress)).append("\n");
    sb.append("    mCurrentClusterCount: ").append(toIndentedString(mCurrentClusterCount)).append("\n");
    sb.append("    mRetryCount: ").append(toIndentedString(mRetryCount)).append("\n");
    sb.append("    mStreamingWindowSize: ").append(toIndentedString(mStreamingWindowSize)).append("\n");
    sb.append("    mTotalInferences: ").append(toIndentedString(mTotalInferences)).append("\n");
    sb.append("    mTotalSamplesWritten: ").append(toIndentedString(mTotalSamplesWritten)).append("\n");
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
    openapiFields.add("m_Status");
    openapiFields.add("m_Message");
    openapiFields.add("m_Progress");
    openapiFields.add("m_CurrentClusterCount");
    openapiFields.add("m_RetryCount");
    openapiFields.add("m_StreamingWindowSize");
    openapiFields.add("m_TotalInferences");
    openapiFields.add("m_TotalSamplesWritten");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_Status");
    openapiRequiredFields.add("m_CurrentClusterCount");
    openapiRequiredFields.add("m_RetryCount");
    openapiRequiredFields.add("m_StreamingWindowSize");
    openapiRequiredFields.add("m_TotalInferences");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MAmberStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MAmberStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MAmberStatus is not found in the empty JSON string", MAmberStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MAmberStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MAmberStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MAmberStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("m_Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_Status").toString()));
      }
      if ((jsonObj.get("m_Message") != null && !jsonObj.get("m_Message").isJsonNull()) && !jsonObj.get("m_Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_Message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MAmberStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MAmberStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MAmberStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MAmberStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<MAmberStatus>() {
           @Override
           public void write(JsonWriter out, MAmberStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MAmberStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MAmberStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MAmberStatus
  * @throws IOException if the JSON string is invalid with respect to MAmberStatus
  */
  public static MAmberStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MAmberStatus.class);
  }

 /**
  * Convert an instance of MAmberStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

