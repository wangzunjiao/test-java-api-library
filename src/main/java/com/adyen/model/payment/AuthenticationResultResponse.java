/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.ThreeDS1Result;
import com.adyen.model.payment.ThreeDS2Result;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AuthenticationResultResponse
 */
@JsonPropertyOrder({
  AuthenticationResultResponse.JSON_PROPERTY_THREE_D_S1_RESULT,
  AuthenticationResultResponse.JSON_PROPERTY_THREE_D_S2_RESULT
})

public class AuthenticationResultResponse {
  public static final String JSON_PROPERTY_THREE_D_S1_RESULT = "threeDS1Result";
  private ThreeDS1Result threeDS1Result;

  public static final String JSON_PROPERTY_THREE_D_S2_RESULT = "threeDS2Result";
  private ThreeDS2Result threeDS2Result;

  public AuthenticationResultResponse() { 
  }

  /**
   * threeDS1Result
   *
   * @param threeDS1Result
   * @return the current {@code AuthenticationResultResponse} instance, allowing for method chaining
   */
  public AuthenticationResultResponse threeDS1Result(ThreeDS1Result threeDS1Result) {
    this.threeDS1Result = threeDS1Result;
    return this;
  }

  /**
   * threeDS1Result
   * @return threeDS1Result
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_S1_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ThreeDS1Result getThreeDS1Result() {
    return threeDS1Result;
  }

  /**
   * threeDS1Result
   *
   * @param threeDS1Result
   */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_S1_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS1Result(ThreeDS1Result threeDS1Result) {
    this.threeDS1Result = threeDS1Result;
  }

  /**
   * threeDS2Result
   *
   * @param threeDS2Result
   * @return the current {@code AuthenticationResultResponse} instance, allowing for method chaining
   */
  public AuthenticationResultResponse threeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
    return this;
  }

  /**
   * threeDS2Result
   * @return threeDS2Result
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ThreeDS2Result getThreeDS2Result() {
    return threeDS2Result;
  }

  /**
   * threeDS2Result
   *
   * @param threeDS2Result
   */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
  }

  /**
   * Return true if this AuthenticationResultResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResultResponse authenticationResultResponse = (AuthenticationResultResponse) o;
    return Objects.equals(this.threeDS1Result, authenticationResultResponse.threeDS1Result) &&
        Objects.equals(this.threeDS2Result, authenticationResultResponse.threeDS2Result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDS1Result, threeDS2Result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResultResponse {\n");
    sb.append("    threeDS1Result: ").append(toIndentedString(threeDS1Result)).append("\n");
    sb.append("    threeDS2Result: ").append(toIndentedString(threeDS2Result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of AuthenticationResultResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticationResultResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to AuthenticationResultResponse
   */
  public static AuthenticationResultResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AuthenticationResultResponse.class);
  }
/**
  * Convert an instance of AuthenticationResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}