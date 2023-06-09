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
import com.boonamber.models.FusionFeature;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.boonamber.JSON;

/**
 * PutDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PutDataRequest {
  public static final String SERIALIZED_NAME_VECTOR = "vector";
  @SerializedName(SERIALIZED_NAME_VECTOR)
  private List<FusionFeature> vector = new ArrayList<>();

  /**
   * If &#x60;submit&#x60;, the fusion vector will be submitted for inference on this request. If &#x60;nosubmit&#x60;, this request will not trigger an inference. If &#x60;default&#x60;, follow the rules for the submitted features.
   */
  @JsonAdapter(FusionRuleEnum.Adapter.class)
  public enum FusionRuleEnum {
    DEFAULT("default"),
    
    SUBMIT("submit"),
    
    NOSUBMIT("nosubmit");

    private String value;

    FusionRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FusionRuleEnum fromValue(String value) {
      for (FusionRuleEnum b : FusionRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FusionRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FusionRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FusionRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FusionRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FUSION_RULE = "fusionRule";
  @SerializedName(SERIALIZED_NAME_FUSION_RULE)
  private FusionRuleEnum fusionRule = FusionRuleEnum.DEFAULT;

  public PutDataRequest() {
  }

  public PutDataRequest vector(List<FusionFeature> vector) {
    
    this.vector = vector;
    return this;
  }

  public PutDataRequest addVectorItem(FusionFeature vectorItem) {
    this.vector.add(vectorItem);
    return this;
  }

   /**
   * Updates to apply to the current fusion vector.
   * @return vector
  **/
  @javax.annotation.Nonnull

  public List<FusionFeature> getVector() {
    return vector;
  }


  public void setVector(List<FusionFeature> vector) {
    this.vector = vector;
  }


  public PutDataRequest fusionRule(FusionRuleEnum fusionRule) {
    
    this.fusionRule = fusionRule;
    return this;
  }

   /**
   * If &#x60;submit&#x60;, the fusion vector will be submitted for inference on this request. If &#x60;nosubmit&#x60;, this request will not trigger an inference. If &#x60;default&#x60;, follow the rules for the submitted features.
   * @return fusionRule
  **/
  @javax.annotation.Nullable

  public FusionRuleEnum getFusionRule() {
    return fusionRule;
  }


  public void setFusionRule(FusionRuleEnum fusionRule) {
    this.fusionRule = fusionRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutDataRequest putDataRequest = (PutDataRequest) o;
    return Objects.equals(this.vector, putDataRequest.vector) &&
        Objects.equals(this.fusionRule, putDataRequest.fusionRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vector, fusionRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutDataRequest {\n");
    sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
    sb.append("    fusionRule: ").append(toIndentedString(fusionRule)).append("\n");
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
    openapiFields.add("vector");
    openapiFields.add("fusionRule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vector");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PutDataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PutDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutDataRequest is not found in the empty JSON string", PutDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PutDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutDataRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PutDataRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("vector").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector` to be an array in the JSON string but got `%s`", jsonObj.get("vector").toString()));
      }

      JsonArray jsonArrayvector = jsonObj.getAsJsonArray("vector");
      // validate the required field `vector` (array)
      for (int i = 0; i < jsonArrayvector.size(); i++) {
        FusionFeature.validateJsonObject(jsonArrayvector.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("fusionRule") != null && !jsonObj.get("fusionRule").isJsonNull()) && !jsonObj.get("fusionRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fusionRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fusionRule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PutDataRequest>() {
           @Override
           public void write(JsonWriter out, PutDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutDataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PutDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutDataRequest
  * @throws IOException if the JSON string is invalid with respect to PutDataRequest
  */
  public static PutDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutDataRequest.class);
  }

 /**
  * Convert an instance of PutDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

