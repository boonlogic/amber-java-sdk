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
 * PostPretrainResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T15:06:47.098836-06:00[America/Chicago]")
public class PostPretrainResponse {
  /**
   * Pretraining status of the model. One of: &#x60;None&#x60;, &#x60;Chunking&#x60;, &#x60;Pretraining&#x60;, &#x60;Pretrained&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NONE("None"),
    
    CHUNKING("Chunking"),
    
    PRETRAINING("Pretraining"),
    
    PRETRAINED("Pretrained");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_CHUNKSPEC = "chunkspec";
  @SerializedName(SERIALIZED_NAME_CHUNKSPEC)
  private String chunkspec;

  public PostPretrainResponse() {
  }

  public PostPretrainResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Pretraining status of the model. One of: &#x60;None&#x60;, &#x60;Chunking&#x60;, &#x60;Pretraining&#x60;, &#x60;Pretrained&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pretraining status of the model. One of: `None`, `Chunking`, `Pretraining`, `Pretrained`.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PostPretrainResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Pretraining status description.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pretraining status description.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PostPretrainResponse token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Transaction token for chunked uploads.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction token for chunked uploads.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public PostPretrainResponse chunkspec(String chunkspec) {
    
    this.chunkspec = chunkspec;
    return this;
  }

   /**
   * Chunk specifier for chunked uploads.
   * @return chunkspec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Chunk specifier for chunked uploads.")

  public String getChunkspec() {
    return chunkspec;
  }


  public void setChunkspec(String chunkspec) {
    this.chunkspec = chunkspec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPretrainResponse postPretrainResponse = (PostPretrainResponse) o;
    return Objects.equals(this.status, postPretrainResponse.status) &&
        Objects.equals(this.message, postPretrainResponse.message) &&
        Objects.equals(this.token, postPretrainResponse.token) &&
        Objects.equals(this.chunkspec, postPretrainResponse.chunkspec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, token, chunkspec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPretrainResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    chunkspec: ").append(toIndentedString(chunkspec)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("token");
    openapiFields.add("chunkspec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostPretrainResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostPretrainResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostPretrainResponse is not found in the empty JSON string", PostPretrainResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostPretrainResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostPretrainResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("chunkspec") != null && !jsonObj.get("chunkspec").isJsonNull()) && !jsonObj.get("chunkspec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chunkspec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chunkspec").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostPretrainResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostPretrainResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostPretrainResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostPretrainResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PostPretrainResponse>() {
           @Override
           public void write(JsonWriter out, PostPretrainResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostPretrainResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostPretrainResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostPretrainResponse
  * @throws IOException if the JSON string is invalid with respect to PostPretrainResponse
  */
  public static PostPretrainResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostPretrainResponse.class);
  }

 /**
  * Convert an instance of PostPretrainResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

