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
import io.kubernetes.client.models.V2beta2ExternalMetricStatus;
import io.kubernetes.client.models.V2beta2ObjectMetricStatus;
import io.kubernetes.client.models.V2beta2PodsMetricStatus;
import io.kubernetes.client.models.V2beta2ResourceMetricStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricStatus describes the last-read state of a single metric.
 */
@ApiModel(description = "MetricStatus describes the last-read state of a single metric.")

public class V2beta2MetricStatus {
  @SerializedName("external")
  private V2beta2ExternalMetricStatus external = null;

  @SerializedName("object")
  private V2beta2ObjectMetricStatus object = null;

  @SerializedName("pods")
  private V2beta2PodsMetricStatus pods = null;

  @SerializedName("resource")
  private V2beta2ResourceMetricStatus resource = null;

  @SerializedName("type")
  private String type = null;

  public V2beta2MetricStatus external(V2beta2ExternalMetricStatus external) {
    this.external = external;
    return this;
  }

   /**
   * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
   * @return external
  **/
  @ApiModelProperty(value = "external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).")
  public V2beta2ExternalMetricStatus getExternal() {
    return external;
  }

  public void setExternal(V2beta2ExternalMetricStatus external) {
    this.external = external;
  }

  public V2beta2MetricStatus object(V2beta2ObjectMetricStatus object) {
    this.object = object;
    return this;
  }

   /**
   * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
   * @return object
  **/
  @ApiModelProperty(value = "object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).")
  public V2beta2ObjectMetricStatus getObject() {
    return object;
  }

  public void setObject(V2beta2ObjectMetricStatus object) {
    this.object = object;
  }

  public V2beta2MetricStatus pods(V2beta2PodsMetricStatus pods) {
    this.pods = pods;
    return this;
  }

   /**
   * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
   * @return pods
  **/
  @ApiModelProperty(value = "pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.")
  public V2beta2PodsMetricStatus getPods() {
    return pods;
  }

  public void setPods(V2beta2PodsMetricStatus pods) {
    this.pods = pods;
  }

  public V2beta2MetricStatus resource(V2beta2ResourceMetricStatus resource) {
    this.resource = resource;
    return this;
  }

   /**
   * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
   * @return resource
  **/
  @ApiModelProperty(value = "resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
  public V2beta2ResourceMetricStatus getResource() {
    return resource;
  }

  public void setResource(V2beta2ResourceMetricStatus resource) {
    this.resource = resource;
  }

  public V2beta2MetricStatus type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It will be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It will be one of \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricStatus v2beta2MetricStatus = (V2beta2MetricStatus) o;
    return Objects.equals(this.external, v2beta2MetricStatus.external) &&
        Objects.equals(this.object, v2beta2MetricStatus.object) &&
        Objects.equals(this.pods, v2beta2MetricStatus.pods) &&
        Objects.equals(this.resource, v2beta2MetricStatus.resource) &&
        Objects.equals(this.type, v2beta2MetricStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, object, pods, resource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricStatus {\n");
    
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

