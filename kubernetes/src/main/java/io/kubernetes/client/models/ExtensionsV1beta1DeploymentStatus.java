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
import io.kubernetes.client.models.ExtensionsV1beta1DeploymentCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 */
@ApiModel(description = "DeploymentStatus is the most recently observed status of the Deployment.")

public class ExtensionsV1beta1DeploymentStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("collisionCount")
  private Integer collisionCount = null;

  @SerializedName("conditions")
  private List<ExtensionsV1beta1DeploymentCondition> conditions = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("unavailableReplicas")
  private Integer unavailableReplicas = null;

  @SerializedName("updatedReplicas")
  private Integer updatedReplicas = null;

  public ExtensionsV1beta1DeploymentStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
   * @return availableReplicas
  **/
  @ApiModelProperty(value = "Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public ExtensionsV1beta1DeploymentStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   * @return collisionCount
  **/
  @ApiModelProperty(value = "Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public ExtensionsV1beta1DeploymentStatus conditions(List<ExtensionsV1beta1DeploymentCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ExtensionsV1beta1DeploymentStatus addConditionsItem(ExtensionsV1beta1DeploymentCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ExtensionsV1beta1DeploymentCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a deployment&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Represents the latest available observations of a deployment's current state.")
  public List<ExtensionsV1beta1DeploymentCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ExtensionsV1beta1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }

  public ExtensionsV1beta1DeploymentStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The generation observed by the deployment controller.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "The generation observed by the deployment controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public ExtensionsV1beta1DeploymentStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * Total number of ready pods targeted by this deployment.
   * @return readyReplicas
  **/
  @ApiModelProperty(value = "Total number of ready pods targeted by this deployment.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public ExtensionsV1beta1DeploymentStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
   * @return replicas
  **/
  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment (their labels match the selector).")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public ExtensionsV1beta1DeploymentStatus unavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

   /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   * @return unavailableReplicas
  **/
  @ApiModelProperty(value = "Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.")
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }

  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }

  public ExtensionsV1beta1DeploymentStatus updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
   * @return updatedReplicas
  **/
  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment that have the desired template spec.")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1DeploymentStatus extensionsV1beta1DeploymentStatus = (ExtensionsV1beta1DeploymentStatus) o;
    return Objects.equals(this.availableReplicas, extensionsV1beta1DeploymentStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, extensionsV1beta1DeploymentStatus.collisionCount) &&
        Objects.equals(this.conditions, extensionsV1beta1DeploymentStatus.conditions) &&
        Objects.equals(this.observedGeneration, extensionsV1beta1DeploymentStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, extensionsV1beta1DeploymentStatus.readyReplicas) &&
        Objects.equals(this.replicas, extensionsV1beta1DeploymentStatus.replicas) &&
        Objects.equals(this.unavailableReplicas, extensionsV1beta1DeploymentStatus.unavailableReplicas) &&
        Objects.equals(this.updatedReplicas, extensionsV1beta1DeploymentStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1DeploymentStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ").append(toIndentedString(unavailableReplicas)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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

