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
import com.adyen.model.payout.Amount;
import com.adyen.model.payout.BankAccount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * StoreDetailAndSubmitRequest
 */
@JsonPropertyOrder({
  StoreDetailAndSubmitRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_AMOUNT,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_BANK,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_BILLING_ADDRESS,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_CARD,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_DATE_OF_BIRTH,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_ENTITY_TYPE,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_FRAUD_OFFSET,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_NATIONALITY,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_RECURRING,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_REFERENCE,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SELECTED_BRAND,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SHOPPER_EMAIL,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SHOPPER_NAME,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SHOPPER_STATEMENT,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_SOCIAL_SECURITY_NUMBER,
  StoreDetailAndSubmitRequest.JSON_PROPERTY_TELEPHONE_NUMBER
})

public class StoreDetailAndSubmitRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BANK = "bank";
  private BankAccount bank;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  /**
   * The type of the entity the payout is processed for.
   */
  public enum EntityTypeEnum {
    NATURALPERSON("NaturalPerson"),
    
    COMPANY("Company");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityTypeEnum entityType;

  public static final String JSON_PROPERTY_FRAUD_OFFSET = "fraudOffset";
  private Integer fraudOffset;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Recurring recurring;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SELECTED_BRAND = "selectedBrand";
  private String selectedBrand;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_SHOPPER_STATEMENT = "shopperStatement";
  private String shopperStatement;

  public static final String JSON_PROPERTY_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  private String socialSecurityNumber;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  public StoreDetailAndSubmitRequest() { 
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   *
   * @param additionalData
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public StoreDetailAndSubmitRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
   */
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * This field contains additional data, which may be required for a particular request.
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getAmount() {
    return amount;
  }

  /**
   * amount
   *
   * @param amount
   */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * bank
   *
   * @param bank
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest bank(BankAccount bank) {
    this.bank = bank;
    return this;
  }

  /**
   * bank
   * @return bank
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccount getBank() {
    return bank;
  }

  /**
   * bank
   *
   * @param bank
   */ 
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBank(BankAccount bank) {
    this.bank = bank;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest billingAddress(Address billingAddress) {
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
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest card(Card card) {
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
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   *
   * @param dateOfBirth
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   * @return dateOfBirth
   */
  @ApiModelProperty(required = true, value = "The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. > This field is mandatory for natural persons.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   *
   * @param dateOfBirth
   */ 
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The type of the entity the payout is processed for.
   *
   * @param entityType
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The type of the entity the payout is processed for.
   * @return entityType
   */
  @ApiModelProperty(required = true, value = "The type of the entity the payout is processed for.")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  /**
   * The type of the entity the payout is processed for.
   *
   * @param entityType
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest fraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
    return this;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
   */
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFraudOffset() {
    return fraudOffset;
  }

  /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   *
   * @param fraudOffset
   */ 
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest merchantAccount(String merchantAccount) {
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
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   *
   * @param nationality
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   * @return nationality
   */
  @ApiModelProperty(required = true, value = "The shopper's nationality.  A valid value is an ISO 2-character country code (e.g. 'NL').")
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNationality() {
    return nationality;
  }

  /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   *
   * @param nationality
   */ 
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * recurring
   *
   * @param recurring
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * recurring
   * @return recurring
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Recurring getRecurring() {
    return recurring;
  }

  /**
   * recurring
   *
   * @param recurring
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  /**
   * The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.
   *
   * @param reference
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.
   * @return reference
   */
  @ApiModelProperty(required = true, value = "The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   *
   * @param selectedBrand
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest selectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
    return this;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   * @return selectedBrand
   */
  @ApiModelProperty(value = "The name of the brand to make a payout to.  For Paysafecard it must be set to `paysafecard`.")
  @JsonProperty(JSON_PROPERTY_SELECTED_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelectedBrand() {
    return selectedBrand;
  }

  /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   *
   * @param selectedBrand
   */ 
  @JsonProperty(JSON_PROPERTY_SELECTED_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
  }

  /**
   * The shopper&#39;s email address.
   *
   * @param shopperEmail
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * The shopper&#39;s email address.
   * @return shopperEmail
   */
  @ApiModelProperty(required = true, value = "The shopper's email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * The shopper&#39;s email address.
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
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest shopperName(Name shopperName) {
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
   * The shopper&#39;s reference for the payment transaction.
   *
   * @param shopperReference
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * The shopper&#39;s reference for the payment transaction.
   * @return shopperReference
   */
  @ApiModelProperty(required = true, value = "The shopper's reference for the payment transaction.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * The shopper&#39;s reference for the payment transaction.
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).
   *
   * @param shopperStatement
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest shopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
    return this;
  }

  /**
   * The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).
   * @return shopperStatement
   */
  @ApiModelProperty(value = "The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).")
  @JsonProperty(JSON_PROPERTY_SHOPPER_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperStatement() {
    return shopperStatement;
  }

  /**
   * The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).
   *
   * @param shopperStatement
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
  }

  /**
   * The shopper&#39;s social security number.
   *
   * @param socialSecurityNumber
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * The shopper&#39;s social security number.
   * @return socialSecurityNumber
   */
  @ApiModelProperty(value = "The shopper's social security number.")
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  /**
   * The shopper&#39;s social security number.
   *
   * @param socialSecurityNumber
   */ 
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  /**
   * The shopper&#39;s phone number.
   *
   * @param telephoneNumber
   * @return the current {@code StoreDetailAndSubmitRequest} instance, allowing for method chaining
   */
  public StoreDetailAndSubmitRequest telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * The shopper&#39;s phone number.
   * @return telephoneNumber
   */
  @ApiModelProperty(value = "The shopper's phone number.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * The shopper&#39;s phone number.
   *
   * @param telephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * Return true if this StoreDetailAndSubmitRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetailAndSubmitRequest storeDetailAndSubmitRequest = (StoreDetailAndSubmitRequest) o;
    return Objects.equals(this.additionalData, storeDetailAndSubmitRequest.additionalData) &&
        Objects.equals(this.amount, storeDetailAndSubmitRequest.amount) &&
        Objects.equals(this.bank, storeDetailAndSubmitRequest.bank) &&
        Objects.equals(this.billingAddress, storeDetailAndSubmitRequest.billingAddress) &&
        Objects.equals(this.card, storeDetailAndSubmitRequest.card) &&
        Objects.equals(this.dateOfBirth, storeDetailAndSubmitRequest.dateOfBirth) &&
        Objects.equals(this.entityType, storeDetailAndSubmitRequest.entityType) &&
        Objects.equals(this.fraudOffset, storeDetailAndSubmitRequest.fraudOffset) &&
        Objects.equals(this.merchantAccount, storeDetailAndSubmitRequest.merchantAccount) &&
        Objects.equals(this.nationality, storeDetailAndSubmitRequest.nationality) &&
        Objects.equals(this.recurring, storeDetailAndSubmitRequest.recurring) &&
        Objects.equals(this.reference, storeDetailAndSubmitRequest.reference) &&
        Objects.equals(this.selectedBrand, storeDetailAndSubmitRequest.selectedBrand) &&
        Objects.equals(this.shopperEmail, storeDetailAndSubmitRequest.shopperEmail) &&
        Objects.equals(this.shopperName, storeDetailAndSubmitRequest.shopperName) &&
        Objects.equals(this.shopperReference, storeDetailAndSubmitRequest.shopperReference) &&
        Objects.equals(this.shopperStatement, storeDetailAndSubmitRequest.shopperStatement) &&
        Objects.equals(this.socialSecurityNumber, storeDetailAndSubmitRequest.socialSecurityNumber) &&
        Objects.equals(this.telephoneNumber, storeDetailAndSubmitRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, amount, bank, billingAddress, card, dateOfBirth, entityType, fraudOffset, merchantAccount, nationality, recurring, reference, selectedBrand, shopperEmail, shopperName, shopperReference, shopperStatement, socialSecurityNumber, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetailAndSubmitRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedBrand: ").append(toIndentedString(selectedBrand)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    shopperStatement: ").append(toIndentedString(shopperStatement)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
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
   * Create an instance of StoreDetailAndSubmitRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoreDetailAndSubmitRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoreDetailAndSubmitRequest
   */
  public static StoreDetailAndSubmitRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoreDetailAndSubmitRequest.class);
  }
/**
  * Convert an instance of StoreDetailAndSubmitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}