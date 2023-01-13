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
 * PostOauth2RefreshResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T15:13:44.158456-06:00[America/Chicago]")
public class PostOauth2RefreshResponse {
  public static final String SERIALIZED_NAME_ID_TOKEN = "idToken";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public PostOauth2RefreshResponse() {
  }

  public PostOauth2RefreshResponse idToken(String idToken) {
    
    this.idToken = idToken;
    return this;
  }

   /**
   * Authorization token. Requests to all API endpoints except &#x60;POST /oauth2&#x60; must include a valid token in a header field called &#x60;Authorization&#x60; with value &#x60;Bearer ${idToken}&#x60;.
   * @return idToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authorization token. Requests to all API endpoints except `POST /oauth2` must include a valid token in a header field called `Authorization` with value `Bearer ${idToken}`.")

  public String getIdToken() {
    return idToken;
  }


  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  public PostOauth2RefreshResponse tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Always &#x60;Bearer&#x60;.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Always `Bearer`.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public PostOauth2RefreshResponse expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Number of seconds before &#x60;idToken&#x60; becomes invalid.
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds before `idToken` becomes invalid.")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public PostOauth2RefreshResponse refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Can be used to refresh the &#x60;idToken&#x60; when it is nearing expiration.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can be used to refresh the `idToken` when it is nearing expiration.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOauth2RefreshResponse postOauth2RefreshResponse = (PostOauth2RefreshResponse) o;
    return Objects.equals(this.idToken, postOauth2RefreshResponse.idToken) &&
        Objects.equals(this.tokenType, postOauth2RefreshResponse.tokenType) &&
        Objects.equals(this.expiresIn, postOauth2RefreshResponse.expiresIn) &&
        Objects.equals(this.refreshToken, postOauth2RefreshResponse.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, tokenType, expiresIn, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOauth2RefreshResponse {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
    openapiFields.add("tokenType");
    openapiFields.add("expiresIn");
    openapiFields.add("refreshToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostOauth2RefreshResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostOauth2RefreshResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostOauth2RefreshResponse is not found in the empty JSON string", PostOauth2RefreshResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostOauth2RefreshResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostOauth2RefreshResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("idToken") != null && !jsonObj.get("idToken").isJsonNull()) && !jsonObj.get("idToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idToken").toString()));
      }
      if ((jsonObj.get("tokenType") != null && !jsonObj.get("tokenType").isJsonNull()) && !jsonObj.get("tokenType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenType").toString()));
      }
      if ((jsonObj.get("expiresIn") != null && !jsonObj.get("expiresIn").isJsonNull()) && !jsonObj.get("expiresIn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiresIn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiresIn").toString()));
      }
      if ((jsonObj.get("refreshToken") != null && !jsonObj.get("refreshToken").isJsonNull()) && !jsonObj.get("refreshToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostOauth2RefreshResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostOauth2RefreshResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostOauth2RefreshResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostOauth2RefreshResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PostOauth2RefreshResponse>() {
           @Override
           public void write(JsonWriter out, PostOauth2RefreshResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostOauth2RefreshResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostOauth2RefreshResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostOauth2RefreshResponse
  * @throws IOException if the JSON string is invalid with respect to PostOauth2RefreshResponse
  */
  public static PostOauth2RefreshResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostOauth2RefreshResponse.class);
  }

 /**
  * Convert an instance of PostOauth2RefreshResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

