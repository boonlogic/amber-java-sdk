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
 * PercentVariationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T15:06:47.098836-06:00[America/Chicago]")
public class PercentVariationResponse {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Float value;

  public static final String SERIALIZED_NAME_IS_DEFINED = "isDefined";
  @SerializedName(SERIALIZED_NAME_IS_DEFINED)
  private Boolean isDefined;

  public PercentVariationResponse() {
  }

  public PercentVariationResponse value(Float value) {
    
    this.value = value;
    return this;
  }

   /**
   * Granularity of the underlying cluster model used for anomaly detection. This is a number between 0.01 and 0.20 which is the distance threshold used to determine whether a pattern should be assigned to an existing cluster or create a new cluster of its own. All things held equal, a small &#x60;percentVariation&#x60; will segment a dataset into many clusters while a larger &#x60;percentVariation&#x60; will segment the dataset into fewer clusters.  &#x60;percentVariation&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;percentVariation&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;.
   * minimum: 0.01
   * maximum: 0.2
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Granularity of the underlying cluster model used for anomaly detection. This is a number between 0.01 and 0.20 which is the distance threshold used to determine whether a pattern should be assigned to an existing cluster or create a new cluster of its own. All things held equal, a small `percentVariation` will segment a dataset into many clusters while a larger `percentVariation` will segment the dataset into fewer clusters.  `percentVariation` can be left unset if it is not known at configuration time. In that case, data collected during the `Buffering` stage will be used to infer an optimal `percentVariation` during the `Autotuning` stage and it will be set to the autotuned value at the start of `Learning`.")

  public Float getValue() {
    return value;
  }


  public void setValue(Float value) {
    this.value = value;
  }


  public PercentVariationResponse isDefined(Boolean isDefined) {
    
    this.isDefined = isDefined;
    return this;
  }

   /**
   * Whether the &#x60;percentVariation&#x60; has been set (through either configuration or autotuning). &#x60;value&#x60; is undefined when this field is false.
   * @return isDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the `percentVariation` has been set (through either configuration or autotuning). `value` is undefined when this field is false.")

  public Boolean getIsDefined() {
    return isDefined;
  }


  public void setIsDefined(Boolean isDefined) {
    this.isDefined = isDefined;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercentVariationResponse percentVariationResponse = (PercentVariationResponse) o;
    return Objects.equals(this.value, percentVariationResponse.value) &&
        Objects.equals(this.isDefined, percentVariationResponse.isDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, isDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercentVariationResponse {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isDefined: ").append(toIndentedString(isDefined)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("isDefined");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PercentVariationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PercentVariationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PercentVariationResponse is not found in the empty JSON string", PercentVariationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PercentVariationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PercentVariationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PercentVariationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PercentVariationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PercentVariationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PercentVariationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PercentVariationResponse>() {
           @Override
           public void write(JsonWriter out, PercentVariationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PercentVariationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PercentVariationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PercentVariationResponse
  * @throws IOException if the JSON string is invalid with respect to PercentVariationResponse
  */
  public static PercentVariationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PercentVariationResponse.class);
  }

 /**
  * Convert an instance of PercentVariationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

