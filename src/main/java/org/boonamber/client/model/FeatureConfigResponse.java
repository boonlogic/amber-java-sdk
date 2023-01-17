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
 * FeatureConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeatureConfigResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MIN_VALUE = "minValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private Float minValue;

  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Float maxValue;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  /**
   * Inference policy for the fusion vector when using &#x60;PUT /data&#x60;. If &#x60;submit&#x60;, any &#x60;PUT /data&#x60; request that updates this feature will cause the fusion vector to be submitted for inference. If &#x60;nosubmit&#x60;, updates to this feature will not trigger a fusion vector inference.
   */
  @JsonAdapter(FusionRuleEnum.Adapter.class)
  public enum FusionRuleEnum {
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
  private FusionRuleEnum fusionRule = FusionRuleEnum.SUBMIT;

  public static final String SERIALIZED_NAME_FUSION_T_T_L = "fusionTTL";
  @SerializedName(SERIALIZED_NAME_FUSION_T_T_L)
  private Integer fusionTTL;

  public static final String SERIALIZED_NAME_MIN_MAX_DEFINED = "minMaxDefined";
  @SerializedName(SERIALIZED_NAME_MIN_MAX_DEFINED)
  private Boolean minMaxDefined;

  public FeatureConfigResponse() {
  }

  public FeatureConfigResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier for this feature. Must be unique with respect to other features in the configuration. Regex: &#x60;^[A-Za-z0-9.:_-]{1,1024}$&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier for this feature. Must be unique with respect to other features in the configuration. Regex: `^[A-Za-z0-9.:_-]{1,1024}$`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FeatureConfigResponse minValue(Float minValue) {
    
    this.minValue = minValue;
    return this;
  }

   /**
   * Minimum expected value for this feature. &#x60;minValue&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;minValue&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;.
   * @return minValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum expected value for this feature. `minValue` can be left unset if it is not known at configuration time. In that case, data collected during the `Buffering` stage will be used to infer an optimal `minValue` during the `Autotuning` stage and it will be set to the autotuned value at the start of `Learning`.")

  public Float getMinValue() {
    return minValue;
  }


  public void setMinValue(Float minValue) {
    this.minValue = minValue;
  }


  public FeatureConfigResponse maxValue(Float maxValue) {
    
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Maximum expected value for this feature. &#x60;maxValue&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal value during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;.
   * @return maxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum expected value for this feature. `maxValue` can be left unset if it is not known at configuration time. In that case, data collected during the `Buffering` stage will be used to infer an optimal value during the `Autotuning` stage and it will be set to the autotuned value at the start of `Learning`.")

  public Float getMaxValue() {
    return maxValue;
  }


  public void setMaxValue(Float maxValue) {
    this.maxValue = maxValue;
  }


  public FeatureConfigResponse weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight of this feature relative to others, as an integer between 1 and 1000.
   * minimum: 1
   * maximum: 1000
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Weight of this feature relative to others, as an integer between 1 and 1000.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public FeatureConfigResponse fusionRule(FusionRuleEnum fusionRule) {
    
    this.fusionRule = fusionRule;
    return this;
  }

   /**
   * Inference policy for the fusion vector when using &#x60;PUT /data&#x60;. If &#x60;submit&#x60;, any &#x60;PUT /data&#x60; request that updates this feature will cause the fusion vector to be submitted for inference. If &#x60;nosubmit&#x60;, updates to this feature will not trigger a fusion vector inference.
   * @return fusionRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inference policy for the fusion vector when using `PUT /data`. If `submit`, any `PUT /data` request that updates this feature will cause the fusion vector to be submitted for inference. If `nosubmit`, updates to this feature will not trigger a fusion vector inference.")

  public FusionRuleEnum getFusionRule() {
    return fusionRule;
  }


  public void setFusionRule(FusionRuleEnum fusionRule) {
    this.fusionRule = fusionRule;
  }


  public FeatureConfigResponse fusionTTL(Integer fusionTTL) {
    
    this.fusionTTL = fusionTTL;
    return this;
  }

   /**
   * Number of seconds without an update before this feature&#39;s value is considered invalid.
   * @return fusionTTL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds without an update before this feature's value is considered invalid.")

  public Integer getFusionTTL() {
    return fusionTTL;
  }


  public void setFusionTTL(Integer fusionTTL) {
    this.fusionTTL = fusionTTL;
  }


  public FeatureConfigResponse minMaxDefined(Boolean minMaxDefined) {
    
    this.minMaxDefined = minMaxDefined;
    return this;
  }

   /**
   * Whether &#x60;minValue&#x60; and &#x60;maxValue&#x60; have been set for this feature (through either configuration or autotuning). &#x60;minValue&#x60; and &#x60;maxValue&#x60; are undefined when this field is false.
   * @return minMaxDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether `minValue` and `maxValue` have been set for this feature (through either configuration or autotuning). `minValue` and `maxValue` are undefined when this field is false.")

  public Boolean getMinMaxDefined() {
    return minMaxDefined;
  }


  public void setMinMaxDefined(Boolean minMaxDefined) {
    this.minMaxDefined = minMaxDefined;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureConfigResponse featureConfigResponse = (FeatureConfigResponse) o;
    return Objects.equals(this.id, featureConfigResponse.id) &&
        Objects.equals(this.minValue, featureConfigResponse.minValue) &&
        Objects.equals(this.maxValue, featureConfigResponse.maxValue) &&
        Objects.equals(this.weight, featureConfigResponse.weight) &&
        Objects.equals(this.fusionRule, featureConfigResponse.fusionRule) &&
        Objects.equals(this.fusionTTL, featureConfigResponse.fusionTTL) &&
        Objects.equals(this.minMaxDefined, featureConfigResponse.minMaxDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, minValue, maxValue, weight, fusionRule, fusionTTL, minMaxDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureConfigResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    fusionRule: ").append(toIndentedString(fusionRule)).append("\n");
    sb.append("    fusionTTL: ").append(toIndentedString(fusionTTL)).append("\n");
    sb.append("    minMaxDefined: ").append(toIndentedString(minMaxDefined)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("minValue");
    openapiFields.add("maxValue");
    openapiFields.add("weight");
    openapiFields.add("fusionRule");
    openapiFields.add("fusionTTL");
    openapiFields.add("minMaxDefined");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeatureConfigResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FeatureConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeatureConfigResponse is not found in the empty JSON string", FeatureConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeatureConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeatureConfigResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("fusionRule") != null && !jsonObj.get("fusionRule").isJsonNull()) && !jsonObj.get("fusionRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fusionRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fusionRule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeatureConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeatureConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeatureConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeatureConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FeatureConfigResponse>() {
           @Override
           public void write(JsonWriter out, FeatureConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeatureConfigResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeatureConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeatureConfigResponse
  * @throws IOException if the JSON string is invalid with respect to FeatureConfigResponse
  */
  public static FeatureConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeatureConfigResponse.class);
  }

 /**
  * Convert an instance of FeatureConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

