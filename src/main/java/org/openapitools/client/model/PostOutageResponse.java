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
 * PostOutageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T09:54:04.469994-06:00[America/Chicago]")
public class PostOutageResponse {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Integer progress;

  public static final String SERIALIZED_NAME_CLUSTER_COUNT = "clusterCount";
  @SerializedName(SERIALIZED_NAME_CLUSTER_COUNT)
  private Integer clusterCount;

  public static final String SERIALIZED_NAME_RETRY_COUNT = "retryCount";
  @SerializedName(SERIALIZED_NAME_RETRY_COUNT)
  private Integer retryCount;

  public static final String SERIALIZED_NAME_STREAMING_WINDOW_SIZE = "streamingWindowSize";
  @SerializedName(SERIALIZED_NAME_STREAMING_WINDOW_SIZE)
  private Integer streamingWindowSize;

  public static final String SERIALIZED_NAME_TOTAL_INFERENCES = "totalInferences";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFERENCES)
  private Integer totalInferences;

  public PostOutageResponse() {
  }

  public PostOutageResponse state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * state of the sensor, states will be prefixed with a state variable  followed by a colon followed by a message indicating progress.  Possible state variables  are: Not streaming, Buffering, Autotuning, Learning, Learning Complete, Monitoring,  Streaming error,  Autotuning error, Autotuning retry
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "state of the sensor, states will be prefixed with a state variable  followed by a colon followed by a message indicating progress.  Possible state variables  are: Not streaming, Buffering, Autotuning, Learning, Learning Complete, Monitoring,  Streaming error,  Autotuning error, Autotuning retry")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PostOutageResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message to accompany the current state
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "message to accompany the current state")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PostOutageResponse progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * completion percentage (applies to Buffering and Autotuning states)
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "completion percentage (applies to Buffering and Autotuning states)")

  public Integer getProgress() {
    return progress;
  }


  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public PostOutageResponse clusterCount(Integer clusterCount) {
    
    this.clusterCount = clusterCount;
    return this;
  }

   /**
   * current cluster count (applies to Learning and Monitoring states)
   * @return clusterCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "current cluster count (applies to Learning and Monitoring states)")

  public Integer getClusterCount() {
    return clusterCount;
  }


  public void setClusterCount(Integer clusterCount) {
    this.clusterCount = clusterCount;
  }


  public PostOutageResponse retryCount(Integer retryCount) {
    
    this.retryCount = retryCount;
    return this;
  }

   /**
   * number of restarts that have happened during autotuning
   * @return retryCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "number of restarts that have happened during autotuning")

  public Integer getRetryCount() {
    return retryCount;
  }


  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }


  public PostOutageResponse streamingWindowSize(Integer streamingWindowSize) {
    
    this.streamingWindowSize = streamingWindowSize;
    return this;
  }

   /**
   * the current streaming window size that is being used
   * @return streamingWindowSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the current streaming window size that is being used")

  public Integer getStreamingWindowSize() {
    return streamingWindowSize;
  }


  public void setStreamingWindowSize(Integer streamingWindowSize) {
    this.streamingWindowSize = streamingWindowSize;
  }


  public PostOutageResponse totalInferences(Integer totalInferences) {
    
    this.totalInferences = totalInferences;
    return this;
  }

   /**
   * inferences since the most recent restart
   * @return totalInferences
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "inferences since the most recent restart")

  public Integer getTotalInferences() {
    return totalInferences;
  }


  public void setTotalInferences(Integer totalInferences) {
    this.totalInferences = totalInferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOutageResponse postOutageResponse = (PostOutageResponse) o;
    return Objects.equals(this.state, postOutageResponse.state) &&
        Objects.equals(this.message, postOutageResponse.message) &&
        Objects.equals(this.progress, postOutageResponse.progress) &&
        Objects.equals(this.clusterCount, postOutageResponse.clusterCount) &&
        Objects.equals(this.retryCount, postOutageResponse.retryCount) &&
        Objects.equals(this.streamingWindowSize, postOutageResponse.streamingWindowSize) &&
        Objects.equals(this.totalInferences, postOutageResponse.totalInferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, message, progress, clusterCount, retryCount, streamingWindowSize, totalInferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOutageResponse {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    clusterCount: ").append(toIndentedString(clusterCount)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    streamingWindowSize: ").append(toIndentedString(streamingWindowSize)).append("\n");
    sb.append("    totalInferences: ").append(toIndentedString(totalInferences)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("message");
    openapiFields.add("progress");
    openapiFields.add("clusterCount");
    openapiFields.add("retryCount");
    openapiFields.add("streamingWindowSize");
    openapiFields.add("totalInferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("progress");
    openapiRequiredFields.add("clusterCount");
    openapiRequiredFields.add("retryCount");
    openapiRequiredFields.add("streamingWindowSize");
    openapiRequiredFields.add("totalInferences");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostOutageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostOutageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostOutageResponse is not found in the empty JSON string", PostOutageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostOutageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostOutageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostOutageResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostOutageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostOutageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostOutageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostOutageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PostOutageResponse>() {
           @Override
           public void write(JsonWriter out, PostOutageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostOutageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostOutageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostOutageResponse
  * @throws IOException if the JSON string is invalid with respect to PostOutageResponse
  */
  public static PostOutageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostOutageResponse.class);
  }

 /**
  * Convert an instance of PostOutageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

