/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payout.Address;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.Name;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * FundSource
 */
@JsonPropertyOrder({
  FundSource.JSON_PROPERTY_ADDITIONAL_DATA,
  FundSource.JSON_PROPERTY_BILLING_ADDRESS,
  FundSource.JSON_PROPERTY_CARD,
  FundSource.JSON_PROPERTY_SHOPPER_EMAIL,
  FundSource.JSON_PROPERTY_SHOPPER_NAME,
  FundSource.JSON_PROPERTY_TELEPHONE_NUMBER
})

public class FundSource {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  public FundSource() { 
  }

  /**
   * A map of name-value pairs for passing additional or industry-specific data.
   *
   * @param additionalData
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public FundSource putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * A map of name-value pairs for passing additional or industry-specific data.
   * @return additionalData
   */
  @ApiModelProperty(value = "A map of name-value pairs for passing additional or industry-specific data.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * A map of name-value pairs for passing additional or industry-specific data.
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * billingAddress
   * @return billingAddress
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getBillingAddress() {
    return billingAddress;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * card
   *
   * @param card
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * card
   * @return card
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Card getCard() {
    return card;
  }

  /**
   * card
   *
   * @param card
   */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * Email address of the person.
   *
   * @param shopperEmail
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * Email address of the person.
   * @return shopperEmail
   */
  @ApiModelProperty(value = "Email address of the person.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * Email address of the person.
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * shopperName
   *
   * @param shopperName
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource shopperName(Name shopperName) {
    this.shopperName = shopperName;
    return this;
  }

  /**
   * shopperName
   * @return shopperName
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Name getShopperName() {
    return shopperName;
  }

  /**
   * shopperName
   *
   * @param shopperName
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }

  /**
   * Phone number of the person
   *
   * @param telephoneNumber
   * @return the current {@code FundSource} instance, allowing for method chaining
   */
  public FundSource telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Phone number of the person
   * @return telephoneNumber
   */
  @ApiModelProperty(value = "Phone number of the person")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * Phone number of the person
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * Return true if this FundSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundSource fundSource = (FundSource) o;
    return Objects.equals(this.additionalData, fundSource.additionalData) &&
        Objects.equals(this.billingAddress, fundSource.billingAddress) &&
        Objects.equals(this.card, fundSource.card) &&
        Objects.equals(this.shopperEmail, fundSource.shopperEmail) &&
        Objects.equals(this.shopperName, fundSource.shopperName) &&
        Objects.equals(this.telephoneNumber, fundSource.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, billingAddress, card, shopperEmail, shopperName, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSource {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
   * Create an instance of FundSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FundSource
   * @throws JsonProcessingException if the JSON string is invalid with respect to FundSource
   */
  public static FundSource fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, FundSource.class);
  }
/**
  * Convert an instance of FundSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}