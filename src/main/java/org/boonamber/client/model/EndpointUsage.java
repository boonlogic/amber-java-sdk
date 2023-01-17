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
 * EndpointUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EndpointUsage {
  public static final String SERIALIZED_NAME_TOTAL_CALLS = "totalCalls";
  @SerializedName(SERIALIZED_NAME_TOTAL_CALLS)
  private Integer totalCalls;

  public static final String SERIALIZED_NAME_LAST_CALLED = "lastCalled";
  @SerializedName(SERIALIZED_NAME_LAST_CALLED)
  private String lastCalled;

  public EndpointUsage() {
  }

  public EndpointUsage totalCalls(Integer totalCalls) {
    
    this.totalCalls = totalCalls;
    return this;
  }

   /**
   * Total number of calls to this endpoint.
   * @return totalCalls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of calls to this endpoint.")

  public Integer getTotalCalls() {
    return totalCalls;
  }


  public void setTotalCalls(Integer totalCalls) {
    this.totalCalls = totalCalls;
  }


  public EndpointUsage lastCalled(String lastCalled) {
    
    this.lastCalled = lastCalled;
    return this;
  }

   /**
   * Last time this endpoint was called, in ISO format.
   * @return lastCalled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time this endpoint was called, in ISO format.")

  public String getLastCalled() {
    return lastCalled;
  }


  public void setLastCalled(String lastCalled) {
    this.lastCalled = lastCalled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointUsage endpointUsage = (EndpointUsage) o;
    return Objects.equals(this.totalCalls, endpointUsage.totalCalls) &&
        Objects.equals(this.lastCalled, endpointUsage.lastCalled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCalls, lastCalled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointUsage {\n");
    sb.append("    totalCalls: ").append(toIndentedString(totalCalls)).append("\n");
    sb.append("    lastCalled: ").append(toIndentedString(lastCalled)).append("\n");
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
    openapiFields.add("totalCalls");
    openapiFields.add("lastCalled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EndpointUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EndpointUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointUsage is not found in the empty JSON string", EndpointUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EndpointUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointUsage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("lastCalled") != null && !jsonObj.get("lastCalled").isJsonNull()) && !jsonObj.get("lastCalled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastCalled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastCalled").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointUsage>() {
           @Override
           public void write(JsonWriter out, EndpointUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointUsage
  * @throws IOException if the JSON string is invalid with respect to EndpointUsage
  */
  public static EndpointUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointUsage.class);
  }

 /**
  * Convert an instance of EndpointUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

