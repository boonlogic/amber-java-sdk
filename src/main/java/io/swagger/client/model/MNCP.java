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
 * MNCP
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class MNCP {
  @SerializedName("VersionNumber")
  private Integer versionNumber = null;

  @SerializedName("NumOfFeatures")
  private Integer numOfFeatures = null;

  @SerializedName("m_NumericFormat")
  private Integer mNumericFormat = null;

  @SerializedName("m_PercentVariation")
  private Float mPercentVariation = null;

  @SerializedName("m_Accuracy")
  private Float mAccuracy = null;

  @SerializedName("m_StreamingWindowSize")
  private Integer mStreamingWindowSize = null;

  public MNCP versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @Schema(description = "")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  public MNCP numOfFeatures(Integer numOfFeatures) {
    this.numOfFeatures = numOfFeatures;
    return this;
  }

   /**
   * Get numOfFeatures
   * @return numOfFeatures
  **/
  @Schema(description = "")
  public Integer getNumOfFeatures() {
    return numOfFeatures;
  }

  public void setNumOfFeatures(Integer numOfFeatures) {
    this.numOfFeatures = numOfFeatures;
  }

  public MNCP mNumericFormat(Integer mNumericFormat) {
    this.mNumericFormat = mNumericFormat;
    return this;
  }

   /**
   * Get mNumericFormat
   * @return mNumericFormat
  **/
  @Schema(description = "")
  public Integer getMNumericFormat() {
    return mNumericFormat;
  }

  public void setMNumericFormat(Integer mNumericFormat) {
    this.mNumericFormat = mNumericFormat;
  }

  public MNCP mPercentVariation(Float mPercentVariation) {
    this.mPercentVariation = mPercentVariation;
    return this;
  }

   /**
   * Get mPercentVariation
   * @return mPercentVariation
  **/
  @Schema(description = "")
  public Float getMPercentVariation() {
    return mPercentVariation;
  }

  public void setMPercentVariation(Float mPercentVariation) {
    this.mPercentVariation = mPercentVariation;
  }

  public MNCP mAccuracy(Float mAccuracy) {
    this.mAccuracy = mAccuracy;
    return this;
  }

   /**
   * Get mAccuracy
   * @return mAccuracy
  **/
  @Schema(description = "")
  public Float getMAccuracy() {
    return mAccuracy;
  }

  public void setMAccuracy(Float mAccuracy) {
    this.mAccuracy = mAccuracy;
  }

  public MNCP mStreamingWindowSize(Integer mStreamingWindowSize) {
    this.mStreamingWindowSize = mStreamingWindowSize;
    return this;
  }

   /**
   * Get mStreamingWindowSize
   * @return mStreamingWindowSize
  **/
  @Schema(description = "")
  public Integer getMStreamingWindowSize() {
    return mStreamingWindowSize;
  }

  public void setMStreamingWindowSize(Integer mStreamingWindowSize) {
    this.mStreamingWindowSize = mStreamingWindowSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MNCP mNCP = (MNCP) o;
    return Objects.equals(this.versionNumber, mNCP.versionNumber) &&
        Objects.equals(this.numOfFeatures, mNCP.numOfFeatures) &&
        Objects.equals(this.mNumericFormat, mNCP.mNumericFormat) &&
        Objects.equals(this.mPercentVariation, mNCP.mPercentVariation) &&
        Objects.equals(this.mAccuracy, mNCP.mAccuracy) &&
        Objects.equals(this.mStreamingWindowSize, mNCP.mStreamingWindowSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, numOfFeatures, mNumericFormat, mPercentVariation, mAccuracy, mStreamingWindowSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MNCP {\n");
    
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    numOfFeatures: ").append(toIndentedString(numOfFeatures)).append("\n");
    sb.append("    mNumericFormat: ").append(toIndentedString(mNumericFormat)).append("\n");
    sb.append("    mPercentVariation: ").append(toIndentedString(mPercentVariation)).append("\n");
    sb.append("    mAccuracy: ").append(toIndentedString(mAccuracy)).append("\n");
    sb.append("    mStreamingWindowSize: ").append(toIndentedString(mStreamingWindowSize)).append("\n");
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
