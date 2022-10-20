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
 * MStreamingParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class MStreamingParameters {
  @SerializedName("VersionNumber")
  private Integer versionNumber = null;

  @SerializedName("m_EnableAutotuning")
  private Boolean mEnableAutotuning = null;

  @SerializedName("m_SamplesToBufferForAutotuning")
  private Integer mSamplesToBufferForAutotuning = null;

  @SerializedName("m_GraduationAtRateNumerator")
  private Integer mGraduationAtRateNumerator = null;

  @SerializedName("m_GraduationAtRateDenominator")
  private Integer mGraduationAtRateDenominator = null;

  @SerializedName("m_GraduateAtMaxClusters")
  private Integer mGraduateAtMaxClusters = null;

  @SerializedName("m_GraduateAtMaxSamples")
  private Integer mGraduateAtMaxSamples = null;

  public MStreamingParameters versionNumber(Integer versionNumber) {
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

  public MStreamingParameters mEnableAutotuning(Boolean mEnableAutotuning) {
    this.mEnableAutotuning = mEnableAutotuning;
    return this;
  }

   /**
   * Get mEnableAutotuning
   * @return mEnableAutotuning
  **/
  @Schema(description = "")
  public Boolean isMEnableAutotuning() {
    return mEnableAutotuning;
  }

  public void setMEnableAutotuning(Boolean mEnableAutotuning) {
    this.mEnableAutotuning = mEnableAutotuning;
  }

  public MStreamingParameters mSamplesToBufferForAutotuning(Integer mSamplesToBufferForAutotuning) {
    this.mSamplesToBufferForAutotuning = mSamplesToBufferForAutotuning;
    return this;
  }

   /**
   * Get mSamplesToBufferForAutotuning
   * @return mSamplesToBufferForAutotuning
  **/
  @Schema(required = true, description = "")
  public Integer getMSamplesToBufferForAutotuning() {
    return mSamplesToBufferForAutotuning;
  }

  public void setMSamplesToBufferForAutotuning(Integer mSamplesToBufferForAutotuning) {
    this.mSamplesToBufferForAutotuning = mSamplesToBufferForAutotuning;
  }

  public MStreamingParameters mGraduationAtRateNumerator(Integer mGraduationAtRateNumerator) {
    this.mGraduationAtRateNumerator = mGraduationAtRateNumerator;
    return this;
  }

   /**
   * Get mGraduationAtRateNumerator
   * @return mGraduationAtRateNumerator
  **/
  @Schema(required = true, description = "")
  public Integer getMGraduationAtRateNumerator() {
    return mGraduationAtRateNumerator;
  }

  public void setMGraduationAtRateNumerator(Integer mGraduationAtRateNumerator) {
    this.mGraduationAtRateNumerator = mGraduationAtRateNumerator;
  }

  public MStreamingParameters mGraduationAtRateDenominator(Integer mGraduationAtRateDenominator) {
    this.mGraduationAtRateDenominator = mGraduationAtRateDenominator;
    return this;
  }

   /**
   * Get mGraduationAtRateDenominator
   * @return mGraduationAtRateDenominator
  **/
  @Schema(required = true, description = "")
  public Integer getMGraduationAtRateDenominator() {
    return mGraduationAtRateDenominator;
  }

  public void setMGraduationAtRateDenominator(Integer mGraduationAtRateDenominator) {
    this.mGraduationAtRateDenominator = mGraduationAtRateDenominator;
  }

  public MStreamingParameters mGraduateAtMaxClusters(Integer mGraduateAtMaxClusters) {
    this.mGraduateAtMaxClusters = mGraduateAtMaxClusters;
    return this;
  }

   /**
   * Get mGraduateAtMaxClusters
   * @return mGraduateAtMaxClusters
  **/
  @Schema(required = true, description = "")
  public Integer getMGraduateAtMaxClusters() {
    return mGraduateAtMaxClusters;
  }

  public void setMGraduateAtMaxClusters(Integer mGraduateAtMaxClusters) {
    this.mGraduateAtMaxClusters = mGraduateAtMaxClusters;
  }

  public MStreamingParameters mGraduateAtMaxSamples(Integer mGraduateAtMaxSamples) {
    this.mGraduateAtMaxSamples = mGraduateAtMaxSamples;
    return this;
  }

   /**
   * Get mGraduateAtMaxSamples
   * @return mGraduateAtMaxSamples
  **/
  @Schema(required = true, description = "")
  public Integer getMGraduateAtMaxSamples() {
    return mGraduateAtMaxSamples;
  }

  public void setMGraduateAtMaxSamples(Integer mGraduateAtMaxSamples) {
    this.mGraduateAtMaxSamples = mGraduateAtMaxSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MStreamingParameters mStreamingParameters = (MStreamingParameters) o;
    return Objects.equals(this.versionNumber, mStreamingParameters.versionNumber) &&
        Objects.equals(this.mEnableAutotuning, mStreamingParameters.mEnableAutotuning) &&
        Objects.equals(this.mSamplesToBufferForAutotuning, mStreamingParameters.mSamplesToBufferForAutotuning) &&
        Objects.equals(this.mGraduationAtRateNumerator, mStreamingParameters.mGraduationAtRateNumerator) &&
        Objects.equals(this.mGraduationAtRateDenominator, mStreamingParameters.mGraduationAtRateDenominator) &&
        Objects.equals(this.mGraduateAtMaxClusters, mStreamingParameters.mGraduateAtMaxClusters) &&
        Objects.equals(this.mGraduateAtMaxSamples, mStreamingParameters.mGraduateAtMaxSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mEnableAutotuning, mSamplesToBufferForAutotuning, mGraduationAtRateNumerator, mGraduationAtRateDenominator, mGraduateAtMaxClusters, mGraduateAtMaxSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MStreamingParameters {\n");
    
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mEnableAutotuning: ").append(toIndentedString(mEnableAutotuning)).append("\n");
    sb.append("    mSamplesToBufferForAutotuning: ").append(toIndentedString(mSamplesToBufferForAutotuning)).append("\n");
    sb.append("    mGraduationAtRateNumerator: ").append(toIndentedString(mGraduationAtRateNumerator)).append("\n");
    sb.append("    mGraduationAtRateDenominator: ").append(toIndentedString(mGraduationAtRateDenominator)).append("\n");
    sb.append("    mGraduateAtMaxClusters: ").append(toIndentedString(mGraduateAtMaxClusters)).append("\n");
    sb.append("    mGraduateAtMaxSamples: ").append(toIndentedString(mGraduateAtMaxSamples)).append("\n");
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
