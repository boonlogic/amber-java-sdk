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
 * MPatternMemory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MPatternMemory {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private BigDecimal versionNumber;

  public MPatternMemory() {
  }

  public MPatternMemory versionNumber(BigDecimal versionNumber) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MPatternMemory mPatternMemory = (MPatternMemory) o;
    return Objects.equals(this.versionNumber, mPatternMemory.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MPatternMemory {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MPatternMemory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MPatternMemory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MPatternMemory is not found in the empty JSON string", MPatternMemory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MPatternMemory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MPatternMemory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MPatternMemory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MPatternMemory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MPatternMemory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MPatternMemory.class));

       return (TypeAdapter<T>) new TypeAdapter<MPatternMemory>() {
           @Override
           public void write(JsonWriter out, MPatternMemory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MPatternMemory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MPatternMemory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MPatternMemory
  * @throws IOException if the JSON string is invalid with respect to MPatternMemory
  */
  public static MPatternMemory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MPatternMemory.class);
  }

 /**
  * Convert an instance of MPatternMemory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
