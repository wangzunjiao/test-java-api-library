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
 * Company
 */
@JsonPropertyOrder({
  Company.JSON_PROPERTY_HOMEPAGE,
  Company.JSON_PROPERTY_NAME,
  Company.JSON_PROPERTY_REGISTRATION_NUMBER,
  Company.JSON_PROPERTY_REGISTRY_LOCATION,
  Company.JSON_PROPERTY_TAX_ID,
  Company.JSON_PROPERTY_TYPE
})

public class Company {
  public static final String JSON_PROPERTY_HOMEPAGE = "homepage";
  private String homepage;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
  private String registrationNumber;

  public static final String JSON_PROPERTY_REGISTRY_LOCATION = "registryLocation";
  private String registryLocation;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Company() { 
  }

  /**
   * The company website&#39;s home page.
   *
   * @param homepage
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company homepage(String homepage) {
    this.homepage = homepage;
    return this;
  }

  /**
   * The company website&#39;s home page.
   * @return homepage
   */
  @ApiModelProperty(value = "The company website's home page.")
  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHomepage() {
    return homepage;
  }

  /**
   * The company website&#39;s home page.
   *
   * @param homepage
   */ 
  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }

  /**
   * The company name.
   *
   * @param name
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The company name.
   * @return name
   */
  @ApiModelProperty(value = "The company name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * The company name.
   *
   * @param name
   */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Registration number of the company.
   *
   * @param registrationNumber
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Registration number of the company.
   * @return registrationNumber
   */
  @ApiModelProperty(value = "Registration number of the company.")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  /**
   * Registration number of the company.
   *
   * @param registrationNumber
   */ 
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  /**
   * Registry location of the company.
   *
   * @param registryLocation
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company registryLocation(String registryLocation) {
    this.registryLocation = registryLocation;
    return this;
  }

  /**
   * Registry location of the company.
   * @return registryLocation
   */
  @ApiModelProperty(value = "Registry location of the company.")
  @JsonProperty(JSON_PROPERTY_REGISTRY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegistryLocation() {
    return registryLocation;
  }

  /**
   * Registry location of the company.
   *
   * @param registryLocation
   */ 
  @JsonProperty(JSON_PROPERTY_REGISTRY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistryLocation(String registryLocation) {
    this.registryLocation = registryLocation;
  }

  /**
   * Tax ID of the company.
   *
   * @param taxId
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Tax ID of the company.
   * @return taxId
   */
  @ApiModelProperty(value = "Tax ID of the company.")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaxId() {
    return taxId;
  }

  /**
   * Tax ID of the company.
   *
   * @param taxId
   */ 
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  /**
   * The company type.
   *
   * @param type
   * @return the current {@code Company} instance, allowing for method chaining
   */
  public Company type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The company type.
   * @return type
   */
  @ApiModelProperty(value = "The company type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * The company type.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this Company object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.homepage, company.homepage) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.registrationNumber, company.registrationNumber) &&
        Objects.equals(this.registryLocation, company.registryLocation) &&
        Objects.equals(this.taxId, company.taxId) &&
        Objects.equals(this.type, company.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homepage, name, registrationNumber, registryLocation, taxId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registryLocation: ").append(toIndentedString(registryLocation)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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
   * Create an instance of Company given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Company
   * @throws JsonProcessingException if the JSON string is invalid with respect to Company
   */
  public static Company fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Company.class);
  }
/**
  * Convert an instance of Company to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}