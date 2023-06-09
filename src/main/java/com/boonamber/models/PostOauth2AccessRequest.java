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
 * PostOauth2AccessRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostOauth2AccessRequest {
  public static final String SERIALIZED_NAME_LICENSE_ID = "licenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public PostOauth2AccessRequest() {
  }

  public PostOauth2AccessRequest licenseId(String licenseId) {
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * Amber account license.
   * @return licenseId
  **/
  @javax.annotation.Nonnull

  public String getLicenseId() {
    return licenseId;
  }


  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }


  public PostOauth2AccessRequest secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Amber account secret key.
   * @return secretKey
  **/
  @javax.annotation.Nonnull

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOauth2AccessRequest postOauth2AccessRequest = (PostOauth2AccessRequest) o;
    return Objects.equals(this.licenseId, postOauth2AccessRequest.licenseId) &&
        Objects.equals(this.secretKey, postOauth2AccessRequest.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseId, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOauth2AccessRequest {\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
    openapiFields.add("licenseId");
    openapiFields.add("secretKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("licenseId");
    openapiRequiredFields.add("secretKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostOauth2AccessRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostOauth2AccessRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostOauth2AccessRequest is not found in the empty JSON string", PostOauth2AccessRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostOauth2AccessRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostOauth2AccessRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostOauth2AccessRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("licenseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseId").toString()));
      }
      if (!jsonObj.get("secretKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostOauth2AccessRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostOauth2AccessRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostOauth2AccessRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostOauth2AccessRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostOauth2AccessRequest>() {
           @Override
           public void write(JsonWriter out, PostOauth2AccessRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostOauth2AccessRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostOauth2AccessRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostOauth2AccessRequest
  * @throws IOException if the JSON string is invalid with respect to PostOauth2AccessRequest
  */
  public static PostOauth2AccessRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostOauth2AccessRequest.class);
  }

 /**
  * Convert an instance of PostOauth2AccessRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

