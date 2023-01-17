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


package org.boonamber.client.model;

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
import org.boonamber.client.model.GetUsageResponseEndpoints;

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

import org.boonamber.client.JSON;

/**
 * GetUsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetUsageResponse {
  public static final String SERIALIZED_NAME_TOTAL_SAMPLES = "totalSamples";
  @SerializedName(SERIALIZED_NAME_TOTAL_SAMPLES)
  private Integer totalSamples;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private GetUsageResponseEndpoints endpoints;

  public GetUsageResponse() {
  }

  public GetUsageResponse totalSamples(Integer totalSamples) {
    
    this.totalSamples = totalSamples;
    return this;
  }

   /**
   * All-time total number of model inferences.
   * @return totalSamples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All-time total number of model inferences.")

  public Integer getTotalSamples() {
    return totalSamples;
  }


  public void setTotalSamples(Integer totalSamples) {
    this.totalSamples = totalSamples;
  }


  public GetUsageResponse endpoints(GetUsageResponseEndpoints endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUsageResponseEndpoints getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(GetUsageResponseEndpoints endpoints) {
    this.endpoints = endpoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsageResponse getUsageResponse = (GetUsageResponse) o;
    return Objects.equals(this.totalSamples, getUsageResponse.totalSamples) &&
        Objects.equals(this.endpoints, getUsageResponse.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSamples, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsageResponse {\n");
    sb.append("    totalSamples: ").append(toIndentedString(totalSamples)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
    openapiFields.add("totalSamples");
    openapiFields.add("endpoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetUsageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetUsageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUsageResponse is not found in the empty JSON string", GetUsageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetUsageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUsageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `endpoints`
      if (jsonObj.get("endpoints") != null && !jsonObj.get("endpoints").isJsonNull()) {
        GetUsageResponseEndpoints.validateJsonObject(jsonObj.getAsJsonObject("endpoints"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetUsageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUsageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUsageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUsageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUsageResponse>() {
           @Override
           public void write(JsonWriter out, GetUsageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUsageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetUsageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetUsageResponse
  * @throws IOException if the JSON string is invalid with respect to GetUsageResponse
  */
  public static GetUsageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUsageResponse.class);
  }

 /**
  * Convert an instance of GetUsageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

