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
import io.swagger.client.model.MPatternMemory;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MNanoBackend
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T15:52:03.807427-05:00[America/Chicago]")
public class MNanoBackend {
  @SerializedName("VersionNumber")
  private Integer versionNumber = null;

  @SerializedName("m_PatternMemory")
  private MPatternMemory mPatternMemory = null;

  @SerializedName("m_InitComplete")
  private Boolean mInitComplete = null;

  @SerializedName("m_PatternLength")
  private Integer mPatternLength = null;

  @SerializedName("m_LearningIsOn")
  private Boolean mLearningIsOn = null;

  @SerializedName("m_NumOfPatternsClustered")
  private Integer mNumOfPatternsClustered = null;

  public MNanoBackend versionNumber(Integer versionNumber) {
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

  public MNanoBackend mPatternMemory(MPatternMemory mPatternMemory) {
    this.mPatternMemory = mPatternMemory;
    return this;
  }

   /**
   * Get mPatternMemory
   * @return mPatternMemory
  **/
  @Schema(description = "")
  public MPatternMemory getMPatternMemory() {
    return mPatternMemory;
  }

  public void setMPatternMemory(MPatternMemory mPatternMemory) {
    this.mPatternMemory = mPatternMemory;
  }

  public MNanoBackend mInitComplete(Boolean mInitComplete) {
    this.mInitComplete = mInitComplete;
    return this;
  }

   /**
   * Get mInitComplete
   * @return mInitComplete
  **/
  @Schema(description = "")
  public Boolean isMInitComplete() {
    return mInitComplete;
  }

  public void setMInitComplete(Boolean mInitComplete) {
    this.mInitComplete = mInitComplete;
  }

  public MNanoBackend mPatternLength(Integer mPatternLength) {
    this.mPatternLength = mPatternLength;
    return this;
  }

   /**
   * Get mPatternLength
   * @return mPatternLength
  **/
  @Schema(description = "")
  public Integer getMPatternLength() {
    return mPatternLength;
  }

  public void setMPatternLength(Integer mPatternLength) {
    this.mPatternLength = mPatternLength;
  }

  public MNanoBackend mLearningIsOn(Boolean mLearningIsOn) {
    this.mLearningIsOn = mLearningIsOn;
    return this;
  }

   /**
   * Get mLearningIsOn
   * @return mLearningIsOn
  **/
  @Schema(description = "")
  public Boolean isMLearningIsOn() {
    return mLearningIsOn;
  }

  public void setMLearningIsOn(Boolean mLearningIsOn) {
    this.mLearningIsOn = mLearningIsOn;
  }

  public MNanoBackend mNumOfPatternsClustered(Integer mNumOfPatternsClustered) {
    this.mNumOfPatternsClustered = mNumOfPatternsClustered;
    return this;
  }

   /**
   * Get mNumOfPatternsClustered
   * @return mNumOfPatternsClustered
  **/
  @Schema(description = "")
  public Integer getMNumOfPatternsClustered() {
    return mNumOfPatternsClustered;
  }

  public void setMNumOfPatternsClustered(Integer mNumOfPatternsClustered) {
    this.mNumOfPatternsClustered = mNumOfPatternsClustered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MNanoBackend mNanoBackend = (MNanoBackend) o;
    return Objects.equals(this.versionNumber, mNanoBackend.versionNumber) &&
        Objects.equals(this.mPatternMemory, mNanoBackend.mPatternMemory) &&
        Objects.equals(this.mInitComplete, mNanoBackend.mInitComplete) &&
        Objects.equals(this.mPatternLength, mNanoBackend.mPatternLength) &&
        Objects.equals(this.mLearningIsOn, mNanoBackend.mLearningIsOn) &&
        Objects.equals(this.mNumOfPatternsClustered, mNanoBackend.mNumOfPatternsClustered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, mPatternMemory, mInitComplete, mPatternLength, mLearningIsOn, mNumOfPatternsClustered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MNanoBackend {\n");
    
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    mPatternMemory: ").append(toIndentedString(mPatternMemory)).append("\n");
    sb.append("    mInitComplete: ").append(toIndentedString(mInitComplete)).append("\n");
    sb.append("    mPatternLength: ").append(toIndentedString(mPatternLength)).append("\n");
    sb.append("    mLearningIsOn: ").append(toIndentedString(mLearningIsOn)).append("\n");
    sb.append("    mNumOfPatternsClustered: ").append(toIndentedString(mNumOfPatternsClustered)).append("\n");
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
