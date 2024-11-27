/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * IdentificationData
 */
@JsonPropertyOrder({
  IdentificationData.JSON_PROPERTY_CARD_NUMBER,
  IdentificationData.JSON_PROPERTY_EXPIRY_DATE,
  IdentificationData.JSON_PROPERTY_ISSUER_COUNTRY,
  IdentificationData.JSON_PROPERTY_ISSUER_STATE,
  IdentificationData.JSON_PROPERTY_NATIONAL_ID_EXEMPT,
  IdentificationData.JSON_PROPERTY_NUMBER,
  IdentificationData.JSON_PROPERTY_TYPE
})

public class IdentificationData {
  public static final String JSON_PROPERTY_CARD_NUMBER = "cardNumber";
  private String cardNumber;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public static final String JSON_PROPERTY_ISSUER_COUNTRY = "issuerCountry";
  @Deprecated // deprecated since Legal Entity Management API v1
  private String issuerCountry;

  public static final String JSON_PROPERTY_ISSUER_STATE = "issuerState";
  private String issuerState;

  public static final String JSON_PROPERTY_NATIONAL_ID_EXEMPT = "nationalIdExempt";
  private Boolean nationalIdExempt;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  /**
   * Type of identity data. For individuals, the following types are supported:  - Australia: **driversLicense**, **passport**  - Hong Kong: **driversLicense**, **nationalIdNumber**, **passport**  - New Zealand: **driversLicense**, **passport**  - Singapore: **driversLicense**, **nationalIdNumber**, **passport**   - All other supported countries: **nationalIdNumber**
   */
  public enum TypeEnum {
    NATIONALIDNUMBER("nationalIdNumber"),
    
    PASSPORT("passport"),
    
    DRIVERSLICENSE("driversLicense"),
    
    IDENTITYCARD("identityCard");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public IdentificationData() { 
  }

  /**
   * The card number of the document that was issued (AU only).
   *
   * @param cardNumber
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * The card number of the document that was issued (AU only).
   * @return cardNumber
   */
  @ApiModelProperty(value = "The card number of the document that was issued (AU only).")
  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardNumber() {
    return cardNumber;
  }

  /**
   * The card number of the document that was issued (AU only).
   *
   * @param cardNumber
   */ 
  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   * The expiry date of the document, in YYYY-MM-DD format.
   *
   * @param expiryDate
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * The expiry date of the document, in YYYY-MM-DD format.
   * @return expiryDate
   */
  @ApiModelProperty(value = "The expiry date of the document, in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpiryDate() {
    return expiryDate;
  }

  /**
   * The expiry date of the document, in YYYY-MM-DD format.
   *
   * @param expiryDate
   */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.
   *
   * @param issuerCountry
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   *
   * @deprecated since Legal Entity Management API v1
   */
  @Deprecated
  public IdentificationData issuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
    return this;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.
   * @return issuerCountry
   *
   * @deprecated since Legal Entity Management API v1
   */
  @Deprecated
  @ApiModelProperty(value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.")
  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuerCountry() {
    return issuerCountry;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.
   *
   * @param issuerCountry
   *
   * @deprecated since Legal Entity Management API v1
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }

  /**
   * The state or province where the document was issued (AU only).
   *
   * @param issuerState
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData issuerState(String issuerState) {
    this.issuerState = issuerState;
    return this;
  }

  /**
   * The state or province where the document was issued (AU only).
   * @return issuerState
   */
  @ApiModelProperty(value = "The state or province where the document was issued (AU only).")
  @JsonProperty(JSON_PROPERTY_ISSUER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuerState() {
    return issuerState;
  }

  /**
   * The state or province where the document was issued (AU only).
   *
   * @param issuerState
   */ 
  @JsonProperty(JSON_PROPERTY_ISSUER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerState(String issuerState) {
    this.issuerState = issuerState;
  }

  /**
   * Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.
   *
   * @param nationalIdExempt
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData nationalIdExempt(Boolean nationalIdExempt) {
    this.nationalIdExempt = nationalIdExempt;
    return this;
  }

  /**
   * Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.
   * @return nationalIdExempt
   */
  @ApiModelProperty(value = "Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.")
  @JsonProperty(JSON_PROPERTY_NATIONAL_ID_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNationalIdExempt() {
    return nationalIdExempt;
  }

  /**
   * Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.
   *
   * @param nationalIdExempt
   */ 
  @JsonProperty(JSON_PROPERTY_NATIONAL_ID_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationalIdExempt(Boolean nationalIdExempt) {
    this.nationalIdExempt = nationalIdExempt;
  }

  /**
   * The number in the document.
   *
   * @param number
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The number in the document.
   * @return number
   */
  @ApiModelProperty(value = "The number in the document.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNumber() {
    return number;
  }

  /**
   * The number in the document.
   *
   * @param number
   */ 
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Type of identity data. For individuals, the following types are supported:  - Australia: **driversLicense**, **passport**  - Hong Kong: **driversLicense**, **nationalIdNumber**, **passport**  - New Zealand: **driversLicense**, **passport**  - Singapore: **driversLicense**, **nationalIdNumber**, **passport**   - All other supported countries: **nationalIdNumber**
   *
   * @param type
   * @return the current {@code IdentificationData} instance, allowing for method chaining
   */
  public IdentificationData type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of identity data. For individuals, the following types are supported:  - Australia: **driversLicense**, **passport**  - Hong Kong: **driversLicense**, **nationalIdNumber**, **passport**  - New Zealand: **driversLicense**, **passport**  - Singapore: **driversLicense**, **nationalIdNumber**, **passport**   - All other supported countries: **nationalIdNumber**
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of identity data. For individuals, the following types are supported:  - Australia: **driversLicense**, **passport**  - Hong Kong: **driversLicense**, **nationalIdNumber**, **passport**  - New Zealand: **driversLicense**, **passport**  - Singapore: **driversLicense**, **nationalIdNumber**, **passport**   - All other supported countries: **nationalIdNumber**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Type of identity data. For individuals, the following types are supported:  - Australia: **driversLicense**, **passport**  - Hong Kong: **driversLicense**, **nationalIdNumber**, **passport**  - New Zealand: **driversLicense**, **passport**  - Singapore: **driversLicense**, **nationalIdNumber**, **passport**   - All other supported countries: **nationalIdNumber**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this IdentificationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationData identificationData = (IdentificationData) o;
    return Objects.equals(this.cardNumber, identificationData.cardNumber) &&
        Objects.equals(this.expiryDate, identificationData.expiryDate) &&
        Objects.equals(this.issuerCountry, identificationData.issuerCountry) &&
        Objects.equals(this.issuerState, identificationData.issuerState) &&
        Objects.equals(this.nationalIdExempt, identificationData.nationalIdExempt) &&
        Objects.equals(this.number, identificationData.number) &&
        Objects.equals(this.type, identificationData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expiryDate, issuerCountry, issuerState, nationalIdExempt, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationData {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    issuerState: ").append(toIndentedString(issuerState)).append("\n");
    sb.append("    nationalIdExempt: ").append(toIndentedString(nationalIdExempt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of IdentificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IdentificationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to IdentificationData
   */
  public static IdentificationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, IdentificationData.class);
  }
/**
  * Convert an instance of IdentificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}