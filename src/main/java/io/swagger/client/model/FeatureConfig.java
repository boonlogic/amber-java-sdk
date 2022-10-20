/*
 * Amber API Server
 * Boon Logic Amber API Server
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FeatureConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class FeatureConfig {
  @SerializedName("maxVal")
  private Float maxVal = null;

  @SerializedName("minVal")
  private Float minVal = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("label")
  private String label = null;

  /**
   * policy for submitting sensor fusion vector when this feature is updated. One of \&quot;submit\&quot;, \&quot;nosubmit\&quot; (defaults to \&quot;submit\&quot;)
   */
  @JsonAdapter(SubmitRuleEnum.Adapter.class)
  public enum SubmitRuleEnum {
    SUBMIT("submit"),
    NOSUBMIT("nosubmit");

    private String value;

    SubmitRuleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SubmitRuleEnum fromValue(String input) {
      for (SubmitRuleEnum b : SubmitRuleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SubmitRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubmitRuleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SubmitRuleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SubmitRuleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("submitRule")
  private SubmitRuleEnum submitRule = null;

  public FeatureConfig maxVal(Float maxVal) {
    this.maxVal = maxVal;
    return this;
  }

   /**
   * corresponding maximum value
   * @return maxVal
  **/
  @Schema(description = "corresponding maximum value")
  public Float getMaxVal() {
    return maxVal;
  }

  public void setMaxVal(Float maxVal) {
    this.maxVal = maxVal;
  }

  public FeatureConfig minVal(Float minVal) {
    this.minVal = minVal;
    return this;
  }

   /**
   * the value that should be considered the minimum value for this feature. This can be set to a value larger than the actual min if you want to treat all value less than that as the same (for instance, to keep a noise spike from having undue influence in the clustering
   * @return minVal
  **/
  @Schema(description = "the value that should be considered the minimum value for this feature. This can be set to a value larger than the actual min if you want to treat all value less than that as the same (for instance, to keep a noise spike from having undue influence in the clustering")
  public Float getMinVal() {
    return minVal;
  }

  public void setMinVal(Float minVal) {
    this.minVal = minVal;
  }

  public FeatureConfig weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * corresponding weight
   * @return weight
  **/
  @Schema(description = "corresponding weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public FeatureConfig label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label associated with feature
   * @return label
  **/
  @Schema(description = "label associated with feature")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public FeatureConfig submitRule(SubmitRuleEnum submitRule) {
    this.submitRule = submitRule;
    return this;
  }

   /**
   * policy for submitting sensor fusion vector when this feature is updated. One of \&quot;submit\&quot;, \&quot;nosubmit\&quot; (defaults to \&quot;submit\&quot;)
   * @return submitRule
  **/
  @Schema(description = "policy for submitting sensor fusion vector when this feature is updated. One of \"submit\", \"nosubmit\" (defaults to \"submit\")")
  public SubmitRuleEnum getSubmitRule() {
    return submitRule;
  }

  public void setSubmitRule(SubmitRuleEnum submitRule) {
    this.submitRule = submitRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureConfig featureConfig = (FeatureConfig) o;
    return Objects.equals(this.maxVal, featureConfig.maxVal) &&
        Objects.equals(this.minVal, featureConfig.minVal) &&
        Objects.equals(this.weight, featureConfig.weight) &&
        Objects.equals(this.label, featureConfig.label) &&
        Objects.equals(this.submitRule, featureConfig.submitRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVal, minVal, weight, label, submitRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureConfig {\n");
    
    sb.append("    maxVal: ").append(toIndentedString(maxVal)).append("\n");
    sb.append("    minVal: ").append(toIndentedString(minVal)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    submitRule: ").append(toIndentedString(submitRule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
