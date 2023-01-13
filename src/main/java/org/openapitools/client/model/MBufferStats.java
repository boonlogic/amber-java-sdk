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
 * MBufferStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T09:54:04.469994-06:00[America/Chicago]")
public class MBufferStats {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "VersionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_TOTAL_BYTES_WRITTEN = "TotalBytesWritten";
  @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_WRITTEN)
  private Integer totalBytesWritten;

  public static final String SERIALIZED_NAME_TOTAL_BYTES_PROCESSED = "TotalBytesProcessed";
  @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_PROCESSED)
  private Integer totalBytesProcessed;

  public static final String SERIALIZED_NAME_LOAD_BUFFER_LENGTH = "LoadBufferLength";
  @SerializedName(SERIALIZED_NAME_LOAD_BUFFER_LENGTH)
  private Integer loadBufferLength;

  public static final String SERIALIZED_NAME_LOAD_BUFFER_CAPACITY = "LoadBufferCapacity";
  @SerializedName(SERIALIZED_NAME_LOAD_BUFFER_CAPACITY)
  private Integer loadBufferCapacity;

  public MBufferStats() {
  }

  public MBufferStats versionNumber(Integer versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public MBufferStats totalBytesWritten(Integer totalBytesWritten) {
    
    this.totalBytesWritten = totalBytesWritten;
    return this;
  }

   /**
   * Get totalBytesWritten
   * @return totalBytesWritten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalBytesWritten() {
    return totalBytesWritten;
  }


  public void setTotalBytesWritten(Integer totalBytesWritten) {
    this.totalBytesWritten = totalBytesWritten;
  }


  public MBufferStats totalBytesProcessed(Integer totalBytesProcessed) {
    
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

   /**
   * Get totalBytesProcessed
   * @return totalBytesProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalBytesProcessed() {
    return totalBytesProcessed;
  }


  public void setTotalBytesProcessed(Integer totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
  }


  public MBufferStats loadBufferLength(Integer loadBufferLength) {
    
    this.loadBufferLength = loadBufferLength;
    return this;
  }

   /**
   * Get loadBufferLength
   * @return loadBufferLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLoadBufferLength() {
    return loadBufferLength;
  }


  public void setLoadBufferLength(Integer loadBufferLength) {
    this.loadBufferLength = loadBufferLength;
  }


  public MBufferStats loadBufferCapacity(Integer loadBufferCapacity) {
    
    this.loadBufferCapacity = loadBufferCapacity;
    return this;
  }

   /**
   * Get loadBufferCapacity
   * @return loadBufferCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLoadBufferCapacity() {
    return loadBufferCapacity;
  }


  public void setLoadBufferCapacity(Integer loadBufferCapacity) {
    this.loadBufferCapacity = loadBufferCapacity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBufferStats mBufferStats = (MBufferStats) o;
    return Objects.equals(this.versionNumber, mBufferStats.versionNumber) &&
        Objects.equals(this.totalBytesWritten, mBufferStats.totalBytesWritten) &&
        Objects.equals(this.totalBytesProcessed, mBufferStats.totalBytesProcessed) &&
        Objects.equals(this.loadBufferLength, mBufferStats.loadBufferLength) &&
        Objects.equals(this.loadBufferCapacity, mBufferStats.loadBufferCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, totalBytesWritten, totalBytesProcessed, loadBufferLength, loadBufferCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBufferStats {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    totalBytesWritten: ").append(toIndentedString(totalBytesWritten)).append("\n");
    sb.append("    totalBytesProcessed: ").append(toIndentedString(totalBytesProcessed)).append("\n");
    sb.append("    loadBufferLength: ").append(toIndentedString(loadBufferLength)).append("\n");
    sb.append("    loadBufferCapacity: ").append(toIndentedString(loadBufferCapacity)).append("\n");
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
    openapiFields.add("VersionNumber");
    openapiFields.add("TotalBytesWritten");
    openapiFields.add("TotalBytesProcessed");
    openapiFields.add("LoadBufferLength");
    openapiFields.add("LoadBufferCapacity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MBufferStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MBufferStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MBufferStats is not found in the empty JSON string", MBufferStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MBufferStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MBufferStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MBufferStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MBufferStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MBufferStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MBufferStats.class));

       return (TypeAdapter<T>) new TypeAdapter<MBufferStats>() {
           @Override
           public void write(JsonWriter out, MBufferStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MBufferStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MBufferStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MBufferStats
  * @throws IOException if the JSON string is invalid with respect to MBufferStats
  */
  public static MBufferStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MBufferStats.class);
  }

 /**
  * Convert an instance of MBufferStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

