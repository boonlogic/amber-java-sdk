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
import java.math.BigDecimal;
/**
 * StreamingParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class StreamingParameters {
  @SerializedName("anomalyHistoryWindow")
  private BigDecimal anomalyHistoryWindow = null;

  @SerializedName("learningRateNumerator")
  private BigDecimal learningRateNumerator = null;

  @SerializedName("learningRateDenominator")
  private BigDecimal learningRateDenominator = null;

  @SerializedName("learningMaxClusters")
  private BigDecimal learningMaxClusters = null;

  @SerializedName("learningMaxSamples")
  private BigDecimal learningMaxSamples = null;

  public StreamingParameters anomalyHistoryWindow(BigDecimal anomalyHistoryWindow) {
    this.anomalyHistoryWindow = anomalyHistoryWindow;
    return this;
  }

   /**
   * the number of samples to use when calculating AH
   * @return anomalyHistoryWindow
  **/
  @Schema(description = "the number of samples to use when calculating AH")
  public BigDecimal getAnomalyHistoryWindow() {
    return anomalyHistoryWindow;
  }

  public void setAnomalyHistoryWindow(BigDecimal anomalyHistoryWindow) {
    this.anomalyHistoryWindow = anomalyHistoryWindow;
  }

  public StreamingParameters learningRateNumerator(BigDecimal learningRateNumerator) {
    this.learningRateNumerator = learningRateNumerator;
    return this;
  }

   /**
   * enables graduation requirements for learning
   * @return learningRateNumerator
  **/
  @Schema(description = "enables graduation requirements for learning")
  public BigDecimal getLearningRateNumerator() {
    return learningRateNumerator;
  }

  public void setLearningRateNumerator(BigDecimal learningRateNumerator) {
    this.learningRateNumerator = learningRateNumerator;
  }

  public StreamingParameters learningRateDenominator(BigDecimal learningRateDenominator) {
    this.learningRateDenominator = learningRateDenominator;
    return this;
  }

   /**
   * enables graduation requirements for learning
   * @return learningRateDenominator
  **/
  @Schema(description = "enables graduation requirements for learning")
  public BigDecimal getLearningRateDenominator() {
    return learningRateDenominator;
  }

  public void setLearningRateDenominator(BigDecimal learningRateDenominator) {
    this.learningRateDenominator = learningRateDenominator;
  }

  public StreamingParameters learningMaxClusters(BigDecimal learningMaxClusters) {
    this.learningMaxClusters = learningMaxClusters;
    return this;
  }

   /**
   * learning graduation requirement for stopping learning upon reaching this cluster count
   * @return learningMaxClusters
  **/
  @Schema(description = "learning graduation requirement for stopping learning upon reaching this cluster count")
  public BigDecimal getLearningMaxClusters() {
    return learningMaxClusters;
  }

  public void setLearningMaxClusters(BigDecimal learningMaxClusters) {
    this.learningMaxClusters = learningMaxClusters;
  }

  public StreamingParameters learningMaxSamples(BigDecimal learningMaxSamples) {
    this.learningMaxSamples = learningMaxSamples;
    return this;
  }

   /**
   * learning graduation requirement for stopping learning after acquiring this many samples
   * @return learningMaxSamples
  **/
  @Schema(description = "learning graduation requirement for stopping learning after acquiring this many samples")
  public BigDecimal getLearningMaxSamples() {
    return learningMaxSamples;
  }

  public void setLearningMaxSamples(BigDecimal learningMaxSamples) {
    this.learningMaxSamples = learningMaxSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamingParameters streamingParameters = (StreamingParameters) o;
    return Objects.equals(this.anomalyHistoryWindow, streamingParameters.anomalyHistoryWindow) &&
        Objects.equals(this.learningRateNumerator, streamingParameters.learningRateNumerator) &&
        Objects.equals(this.learningRateDenominator, streamingParameters.learningRateDenominator) &&
        Objects.equals(this.learningMaxClusters, streamingParameters.learningMaxClusters) &&
        Objects.equals(this.learningMaxSamples, streamingParameters.learningMaxSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyHistoryWindow, learningRateNumerator, learningRateDenominator, learningMaxClusters, learningMaxSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamingParameters {\n");
    
    sb.append("    anomalyHistoryWindow: ").append(toIndentedString(anomalyHistoryWindow)).append("\n");
    sb.append("    learningRateNumerator: ").append(toIndentedString(learningRateNumerator)).append("\n");
    sb.append("    learningRateDenominator: ").append(toIndentedString(learningRateDenominator)).append("\n");
    sb.append("    learningMaxClusters: ").append(toIndentedString(learningMaxClusters)).append("\n");
    sb.append("    learningMaxSamples: ").append(toIndentedString(learningMaxSamples)).append("\n");
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
