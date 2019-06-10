/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.PolicyV1beta1IDRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
 */
@ApiModel(description = "FSGroupStrategyOptions defines the strategy type and options used to create the strategy.")

public class PolicyV1beta1FSGroupStrategyOptions {
  @SerializedName("ranges")
  private List<PolicyV1beta1IDRange> ranges = null;

  @SerializedName("rule")
  private String rule = null;

  public PolicyV1beta1FSGroupStrategyOptions ranges(List<PolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public PolicyV1beta1FSGroupStrategyOptions addRangesItem(PolicyV1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<PolicyV1beta1IDRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @ApiModelProperty(value = "ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.")
  public List<PolicyV1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<PolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public PolicyV1beta1FSGroupStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
   * @return rule
  **/
  @ApiModelProperty(value = "rule is the strategy that will dictate what FSGroup is used in the SecurityContext.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1FSGroupStrategyOptions policyV1beta1FSGroupStrategyOptions = (PolicyV1beta1FSGroupStrategyOptions) o;
    return Objects.equals(this.ranges, policyV1beta1FSGroupStrategyOptions.ranges) &&
        Objects.equals(this.rule, policyV1beta1FSGroupStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1FSGroupStrategyOptions {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

