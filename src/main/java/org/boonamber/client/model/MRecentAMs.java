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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 * MRecentAMs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MRecentAMs {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private BigDecimal versionNumber;

  public static final String SERIALIZED_NAME_M_VALUES = "m_Values";
  @SerializedName(SERIALIZED_NAME_M_VALUES)
  private List<Float> mValues = new ArrayList<>();

  public MRecentAMs() {
  }

  public MRecentAMs versionNumber(BigDecimal versionNumber) {
    
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


  public MRecentAMs mValues(List<Float> mValues) {
    
    this.mValues = mValues;
    return this;
  }

  public MRecentAMs addMValuesItem(Float mValuesItem) {
    this.mValues.add(mValuesItem);
    return this;
  }

   /**
   * Get mValues
   * @return mValues
  **/
  @javax.annotation.Nonnull

  public List<Float> getmValues() {
    return mValues;
  }


  public void setmValues(List<Float> mValues) {
    this.mValues = mValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MRecentAMs mRecentAMs = (MRecentAMs) o;
    return Objects.equals(this.versionNumber, mRecentAMs.versionNumber) &&
        Objects.equals(this.mValues, mRecentAMs.mValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MRecentAMs {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mValues: ").append(toIndentedString(mValues)).append("\n");
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
    openapiFields.add("m_Values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("m_Values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MRecentAMs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MRecentAMs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MRecentAMs is not found in the empty JSON string", MRecentAMs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MRecentAMs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MRecentAMs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MRecentAMs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("m_Values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("m_Values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_Values` to be an array in the JSON string but got `%s`", jsonObj.get("m_Values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MRecentAMs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MRecentAMs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MRecentAMs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MRecentAMs.class));

       return (TypeAdapter<T>) new TypeAdapter<MRecentAMs>() {
           @Override
           public void write(JsonWriter out, MRecentAMs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MRecentAMs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MRecentAMs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MRecentAMs
  * @throws IOException if the JSON string is invalid with respect to MRecentAMs
  */
  public static MRecentAMs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MRecentAMs.class);
  }

 /**
  * Convert an instance of MRecentAMs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

