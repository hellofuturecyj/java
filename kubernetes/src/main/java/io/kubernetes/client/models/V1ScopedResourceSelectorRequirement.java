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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
@ApiModel(description = "A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.")

public class V1ScopedResourceSelectorRequirement {
  @SerializedName("operator")
  private String operator = null;

  @SerializedName("scopeName")
  private String scopeName = null;

  @SerializedName("values")
  private List<String> values = null;

  public V1ScopedResourceSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1ScopedResourceSelectorRequirement scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

   /**
   * The name of the scope that the selector applies to.
   * @return scopeName
  **/
  @ApiModelProperty(required = true, value = "The name of the scope that the selector applies to.")
  public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }

  public V1ScopedResourceSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public V1ScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   * @return values
  **/
  @ApiModelProperty(value = "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScopedResourceSelectorRequirement v1ScopedResourceSelectorRequirement = (V1ScopedResourceSelectorRequirement) o;
    return Objects.equals(this.operator, v1ScopedResourceSelectorRequirement.operator) &&
        Objects.equals(this.scopeName, v1ScopedResourceSelectorRequirement.scopeName) &&
        Objects.equals(this.values, v1ScopedResourceSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, scopeName, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopedResourceSelectorRequirement {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

