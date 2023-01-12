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
 * PostAuth2Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T15:34:16.605003-06:00[America/Chicago]")
public class PostAuth2Response {
  public static final String SERIALIZED_NAME_ID_TOKEN = "idToken";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public PostAuth2Response() {
  }

  public PostAuth2Response idToken(String idToken) {
    
    this.idToken = idToken;
    return this;
  }

   /**
   * Identifier token to be used as Bearer token
   * @return idToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier token to be used as Bearer token")

  public String getIdToken() {
    return idToken;
  }


  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  public PostAuth2Response refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Refresh token identifier
   * @return refreshToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Refresh token identifier")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public PostAuth2Response expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Amount of time before token expires
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Amount of time before token expires")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public PostAuth2Response tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Type of authentication token
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of authentication token")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAuth2Response postAuth2Response = (PostAuth2Response) o;
    return Objects.equals(this.idToken, postAuth2Response.idToken) &&
        Objects.equals(this.refreshToken, postAuth2Response.refreshToken) &&
        Objects.equals(this.expiresIn, postAuth2Response.expiresIn) &&
        Objects.equals(this.tokenType, postAuth2Response.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, refreshToken, expiresIn, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAuth2Response {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
    openapiFields.add("idToken");
    openapiFields.add("refreshToken");
    openapiFields.add("expiresIn");
    openapiFields.add("tokenType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("idToken");
    openapiRequiredFields.add("refreshToken");
    openapiRequiredFields.add("expiresIn");
    openapiRequiredFields.add("tokenType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostAuth2Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostAuth2Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostAuth2Response is not found in the empty JSON string", PostAuth2Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostAuth2Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostAuth2Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostAuth2Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("idToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idToken").toString()));
      }
      if (!jsonObj.get("refreshToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshToken").toString()));
      }
      if (!jsonObj.get("expiresIn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiresIn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiresIn").toString()));
      }
      if (!jsonObj.get("tokenType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostAuth2Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostAuth2Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostAuth2Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostAuth2Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PostAuth2Response>() {
           @Override
           public void write(JsonWriter out, PostAuth2Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostAuth2Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostAuth2Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostAuth2Response
  * @throws IOException if the JSON string is invalid with respect to PostAuth2Response
  */
  public static PostAuth2Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostAuth2Response.class);
  }

 /**
  * Convert an instance of PostAuth2Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

