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
import io.kubernetes.client.models.V1beta2RollingUpdateStatefulSetStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 */
@ApiModel(description = "StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")

public class V1beta2StatefulSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private V1beta2RollingUpdateStatefulSetStrategy rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public V1beta2StatefulSetUpdateStrategy rollingUpdate(V1beta2RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.")
  public V1beta2RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1beta2RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1beta2StatefulSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
   * @return type
  **/
  @ApiModelProperty(value = "Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.")
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
    V1beta2StatefulSetUpdateStrategy v1beta2StatefulSetUpdateStrategy = (V1beta2StatefulSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, v1beta2StatefulSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, v1beta2StatefulSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2StatefulSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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

