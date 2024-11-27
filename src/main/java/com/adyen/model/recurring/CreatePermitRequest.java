/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.Permit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CreatePermitRequest
 */
@JsonPropertyOrder({
  CreatePermitRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  CreatePermitRequest.JSON_PROPERTY_PERMITS,
  CreatePermitRequest.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  CreatePermitRequest.JSON_PROPERTY_SHOPPER_REFERENCE
})

public class CreatePermitRequest {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PERMITS = "permits";
  private List<Permit> permits = new ArrayList<>();

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public CreatePermitRequest() { 
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code CreatePermitRequest} instance, allowing for method chaining
   */
  public CreatePermitRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * The permits to create for this recurring contract.
   *
   * @param permits
   * @return the current {@code CreatePermitRequest} instance, allowing for method chaining
   */
  public CreatePermitRequest permits(List<Permit> permits) {
    this.permits = permits;
    return this;
  }

  public CreatePermitRequest addPermitsItem(Permit permitsItem) {
    this.permits.add(permitsItem);
    return this;
  }

  /**
   * The permits to create for this recurring contract.
   * @return permits
   */
  @ApiModelProperty(required = true, value = "The permits to create for this recurring contract.")
  @JsonProperty(JSON_PROPERTY_PERMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Permit> getPermits() {
    return permits;
  }

  /**
   * The permits to create for this recurring contract.
   *
   * @param permits
   */ 
  @JsonProperty(JSON_PROPERTY_PERMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermits(List<Permit> permits) {
    this.permits = permits;
  }

  /**
   * The recurring contract the new permits will use.
   *
   * @param recurringDetailReference
   * @return the current {@code CreatePermitRequest} instance, allowing for method chaining
   */
  public CreatePermitRequest recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * The recurring contract the new permits will use.
   * @return recurringDetailReference
   */
  @ApiModelProperty(required = true, value = "The recurring contract the new permits will use.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }

  /**
   * The recurring contract the new permits will use.
   *
   * @param recurringDetailReference
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * The shopper&#39;s reference to uniquely identify this shopper (e.g. user ID or account ID).
   *
   * @param shopperReference
   * @return the current {@code CreatePermitRequest} instance, allowing for method chaining
   */
  public CreatePermitRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * The shopper&#39;s reference to uniquely identify this shopper (e.g. user ID or account ID).
   * @return shopperReference
   */
  @ApiModelProperty(required = true, value = "The shopper's reference to uniquely identify this shopper (e.g. user ID or account ID).")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * The shopper&#39;s reference to uniquely identify this shopper (e.g. user ID or account ID).
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * Return true if this CreatePermitRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePermitRequest createPermitRequest = (CreatePermitRequest) o;
    return Objects.equals(this.merchantAccount, createPermitRequest.merchantAccount) &&
        Objects.equals(this.permits, createPermitRequest.permits) &&
        Objects.equals(this.recurringDetailReference, createPermitRequest.recurringDetailReference) &&
        Objects.equals(this.shopperReference, createPermitRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, permits, recurringDetailReference, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePermitRequest {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    permits: ").append(toIndentedString(permits)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
   * Create an instance of CreatePermitRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePermitRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreatePermitRequest
   */
  public static CreatePermitRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreatePermitRequest.class);
  }
/**
  * Convert an instance of CreatePermitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}