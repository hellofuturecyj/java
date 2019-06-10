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
 * TokenReviewSpec is a description of the token authentication request.
 */
@ApiModel(description = "TokenReviewSpec is a description of the token authentication request.")

public class V1beta1TokenReviewSpec {
  @SerializedName("audiences")
  private List<String> audiences = null;

  @SerializedName("token")
  private String token = null;

  public V1beta1TokenReviewSpec audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public V1beta1TokenReviewSpec addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<String>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
   * @return audiences
  **/
  @ApiModelProperty(value = "Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public V1beta1TokenReviewSpec token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token is the opaque bearer token.
   * @return token
  **/
  @ApiModelProperty(value = "Token is the opaque bearer token.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TokenReviewSpec v1beta1TokenReviewSpec = (V1beta1TokenReviewSpec) o;
    return Objects.equals(this.audiences, v1beta1TokenReviewSpec.audiences) &&
        Objects.equals(this.token, v1beta1TokenReviewSpec.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TokenReviewSpec {\n");
    
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

