/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.LineItem;
import com.adyen.model.checkout.Split;
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
 * PaymentAmountUpdateResponse
 */
@JsonPropertyOrder({
  PaymentAmountUpdateResponse.JSON_PROPERTY_AMOUNT,
  PaymentAmountUpdateResponse.JSON_PROPERTY_INDUSTRY_USAGE,
  PaymentAmountUpdateResponse.JSON_PROPERTY_LINE_ITEMS,
  PaymentAmountUpdateResponse.JSON_PROPERTY_MERCHANT_ACCOUNT,
  PaymentAmountUpdateResponse.JSON_PROPERTY_PAYMENT_PSP_REFERENCE,
  PaymentAmountUpdateResponse.JSON_PROPERTY_PSP_REFERENCE,
  PaymentAmountUpdateResponse.JSON_PROPERTY_REFERENCE,
  PaymentAmountUpdateResponse.JSON_PROPERTY_SPLITS,
  PaymentAmountUpdateResponse.JSON_PROPERTY_STATUS
})

public class PaymentAmountUpdateResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  /**
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   */
  public enum IndustryUsageEnum {
    DELAYEDCHARGE("delayedCharge"),
    
    INSTALLMENT("installment"),
    
    NOSHOW("noShow");

    private String value;

    IndustryUsageEnum(String value) {
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
    public static IndustryUsageEnum fromValue(String value) {
      for (IndustryUsageEnum b : IndustryUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INDUSTRY_USAGE = "industryUsage";
  private IndustryUsageEnum industryUsage;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItem> lineItems = null;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_PSP_REFERENCE = "paymentPspReference";
  private String paymentPspReference;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SPLITS = "splits";
  private List<Split> splits = null;

  /**
   * The status of your request. This will always have the value **received**.
   */
  public enum StatusEnum {
    RECEIVED("received");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public PaymentAmountUpdateResponse() { 
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse amount(Amount amount) {
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
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   *
   * @param industryUsage
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse industryUsage(IndustryUsageEnum industryUsage) {
    this.industryUsage = industryUsage;
    return this;
  }

  /**
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   * @return industryUsage
   */
  @ApiModelProperty(value = "The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IndustryUsageEnum getIndustryUsage() {
    return industryUsage;
  }

  /**
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   *
   * @param industryUsage
   */ 
  @JsonProperty(JSON_PROPERTY_INDUSTRY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryUsage(IndustryUsageEnum industryUsage) {
    this.industryUsage = industryUsage;
  }

  /**
   * Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.
   *
   * @param lineItems
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PaymentAmountUpdateResponse addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.
   * @return lineItems
   */
  @ApiModelProperty(value = "Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). > This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.")
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.
   *
   * @param lineItems
   */ 
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The merchant account that is used to process the payment.
   *
   * @param merchantAccount
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account that is used to process the payment.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to update. 
   *
   * @param paymentPspReference
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse paymentPspReference(String paymentPspReference) {
    this.paymentPspReference = paymentPspReference;
    return this;
  }

  /**
   * The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to update. 
   * @return paymentPspReference
   */
  @ApiModelProperty(required = true, value = "The [`pspReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to update. ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentPspReference() {
    return paymentPspReference;
  }

  /**
   * The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to update. 
   *
   * @param paymentPspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentPspReference(String paymentPspReference) {
    this.paymentPspReference = paymentPspReference;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the amount update request.
   *
   * @param pspReference
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the amount update request.
   * @return pspReference
   */
  @ApiModelProperty(required = true, value = "Adyen's 16-character reference associated with the amount update request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspReference() {
    return pspReference;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the amount update request.
   *
   * @param pspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }

  /**
   * Your reference for the amount update request. Maximum length: 80 characters.
   *
   * @param reference
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the amount update request. Maximum length: 80 characters.
   * @return reference
   */
  @ApiModelProperty(required = true, value = "Your reference for the amount update request. Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the amount update request. Maximum length: 80 characters.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to process payments for [marketplaces](https://docs.adyen.com/marketplaces/process-payments) or [platforms](https://docs.adyen.com/platforms/process-payments).
   *
   * @param splits
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse splits(List<Split> splits) {
    this.splits = splits;
    return this;
  }

  public PaymentAmountUpdateResponse addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

  /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to process payments for [marketplaces](https://docs.adyen.com/marketplaces/process-payments) or [platforms](https://docs.adyen.com/platforms/process-payments).
   * @return splits
   */
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to process payments for [marketplaces](https://docs.adyen.com/marketplaces/process-payments) or [platforms](https://docs.adyen.com/platforms/process-payments).")
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Split> getSplits() {
    return splits;
  }

  /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to process payments for [marketplaces](https://docs.adyen.com/marketplaces/process-payments) or [platforms](https://docs.adyen.com/platforms/process-payments).
   *
   * @param splits
   */ 
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }

  /**
   * The status of your request. This will always have the value **received**.
   *
   * @param status
   * @return the current {@code PaymentAmountUpdateResponse} instance, allowing for method chaining
   */
  public PaymentAmountUpdateResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of your request. This will always have the value **received**.
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of your request. This will always have the value **received**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of your request. This will always have the value **received**.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Return true if this PaymentAmountUpdateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAmountUpdateResponse paymentAmountUpdateResponse = (PaymentAmountUpdateResponse) o;
    return Objects.equals(this.amount, paymentAmountUpdateResponse.amount) &&
        Objects.equals(this.industryUsage, paymentAmountUpdateResponse.industryUsage) &&
        Objects.equals(this.lineItems, paymentAmountUpdateResponse.lineItems) &&
        Objects.equals(this.merchantAccount, paymentAmountUpdateResponse.merchantAccount) &&
        Objects.equals(this.paymentPspReference, paymentAmountUpdateResponse.paymentPspReference) &&
        Objects.equals(this.pspReference, paymentAmountUpdateResponse.pspReference) &&
        Objects.equals(this.reference, paymentAmountUpdateResponse.reference) &&
        Objects.equals(this.splits, paymentAmountUpdateResponse.splits) &&
        Objects.equals(this.status, paymentAmountUpdateResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, industryUsage, lineItems, merchantAccount, paymentPspReference, pspReference, reference, splits, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAmountUpdateResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    industryUsage: ").append(toIndentedString(industryUsage)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentPspReference: ").append(toIndentedString(paymentPspReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of PaymentAmountUpdateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentAmountUpdateResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentAmountUpdateResponse
   */
  public static PaymentAmountUpdateResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentAmountUpdateResponse.class);
  }
/**
  * Convert an instance of PaymentAmountUpdateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}