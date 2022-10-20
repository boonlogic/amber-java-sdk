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
 * PutStreamFeature
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class PutStreamFeature {
  @SerializedName("label")
  private String label = null;

  @SerializedName("value")
  private Float value = null;

  @SerializedName("ts")
  private String ts = null;

  public PutStreamFeature label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label associated with feature
   * @return label
  **/
  @Schema(required = true, description = "label associated with feature")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PutStreamFeature value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * new value for this feature in sensor fusion vector
   * @return value
  **/
  @Schema(required = true, description = "new value for this feature in sensor fusion vector")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public PutStreamFeature ts(String ts) {
    this.ts = ts;
    return this;
  }

   /**
   * ISO-format timestamp for this data value
   * @return ts
  **/
  @Schema(description = "ISO-format timestamp for this data value")
  public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutStreamFeature putStreamFeature = (PutStreamFeature) o;
    return Objects.equals(this.label, putStreamFeature.label) &&
        Objects.equals(this.value, putStreamFeature.value) &&
        Objects.equals(this.ts, putStreamFeature.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value, ts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutStreamFeature {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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
