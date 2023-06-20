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
 * AutotuneConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotuneConfig {
  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private Boolean range = true;

  public static final String SERIALIZED_NAME_PERCENT_VARIATION = "percentVariation";
  @SerializedName(SERIALIZED_NAME_PERCENT_VARIATION)
  private Boolean percentVariation = true;

  public AutotuneConfig() {
  }

  public AutotuneConfig range(Boolean range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable

  public Boolean getRange() {
    return range;
  }


  public void setRange(Boolean range) {
    this.range = range;
  }


  public AutotuneConfig percentVariation(Boolean percentVariation) {
    
    this.percentVariation = percentVariation;
    return this;
  }

   /**
   * Get percentVariation
   * @return percentVariation
  **/
  @javax.annotation.Nullable

  public Boolean getPercentVariation() {
    return percentVariation;
  }


  public void setPercentVariation(Boolean percentVariation) {
    this.percentVariation = percentVariation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotuneConfig autotuneConfig = (AutotuneConfig) o;
    return Objects.equals(this.range, autotuneConfig.range) &&
        Objects.equals(this.percentVariation, autotuneConfig.percentVariation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, percentVariation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutotuneConfig {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    percentVariation: ").append(toIndentedString(percentVariation)).append("\n");
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
    openapiFields.add("range");
    openapiFields.add("percentVariation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutotuneConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutotuneConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutotuneConfig is not found in the empty JSON string", AutotuneConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutotuneConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutotuneConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutotuneConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutotuneConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutotuneConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutotuneConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AutotuneConfig>() {
           @Override
           public void write(JsonWriter out, AutotuneConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutotuneConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutotuneConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutotuneConfig
  * @throws IOException if the JSON string is invalid with respect to AutotuneConfig
  */
  public static AutotuneConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutotuneConfig.class);
  }

 /**
  * Convert an instance of AutotuneConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
