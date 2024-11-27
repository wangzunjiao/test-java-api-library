/*
 * Disputes API
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.disputes;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.disputes.DefenseDocumentType;
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
 * DefenseReason
 */
@JsonPropertyOrder({
  DefenseReason.JSON_PROPERTY_DEFENSE_DOCUMENT_TYPES,
  DefenseReason.JSON_PROPERTY_DEFENSE_REASON_CODE,
  DefenseReason.JSON_PROPERTY_SATISFIED
})

public class DefenseReason {
  public static final String JSON_PROPERTY_DEFENSE_DOCUMENT_TYPES = "defenseDocumentTypes";
  private List<DefenseDocumentType> defenseDocumentTypes = null;

  public static final String JSON_PROPERTY_DEFENSE_REASON_CODE = "defenseReasonCode";
  private String defenseReasonCode;

  public static final String JSON_PROPERTY_SATISFIED = "satisfied";
  private Boolean satisfied;

  public DefenseReason() { 
  }

  /**
   * Array of defense document types for a specific defense reason. Indicates the document types that you can submit to the schemes to defend this dispute, and whether they are required.
   *
   * @param defenseDocumentTypes
   * @return the current {@code DefenseReason} instance, allowing for method chaining
   */
  public DefenseReason defenseDocumentTypes(List<DefenseDocumentType> defenseDocumentTypes) {
    this.defenseDocumentTypes = defenseDocumentTypes;
    return this;
  }

  public DefenseReason addDefenseDocumentTypesItem(DefenseDocumentType defenseDocumentTypesItem) {
    if (this.defenseDocumentTypes == null) {
      this.defenseDocumentTypes = new ArrayList<>();
    }
    this.defenseDocumentTypes.add(defenseDocumentTypesItem);
    return this;
  }

  /**
   * Array of defense document types for a specific defense reason. Indicates the document types that you can submit to the schemes to defend this dispute, and whether they are required.
   * @return defenseDocumentTypes
   */
  @ApiModelProperty(value = "Array of defense document types for a specific defense reason. Indicates the document types that you can submit to the schemes to defend this dispute, and whether they are required.")
  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DefenseDocumentType> getDefenseDocumentTypes() {
    return defenseDocumentTypes;
  }

  /**
   * Array of defense document types for a specific defense reason. Indicates the document types that you can submit to the schemes to defend this dispute, and whether they are required.
   *
   * @param defenseDocumentTypes
   */ 
  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefenseDocumentTypes(List<DefenseDocumentType> defenseDocumentTypes) {
    this.defenseDocumentTypes = defenseDocumentTypes;
  }

  /**
   * The defense reason code that was selected to defend this dispute.
   *
   * @param defenseReasonCode
   * @return the current {@code DefenseReason} instance, allowing for method chaining
   */
  public DefenseReason defenseReasonCode(String defenseReasonCode) {
    this.defenseReasonCode = defenseReasonCode;
    return this;
  }

  /**
   * The defense reason code that was selected to defend this dispute.
   * @return defenseReasonCode
   */
  @ApiModelProperty(required = true, value = "The defense reason code that was selected to defend this dispute.")
  @JsonProperty(JSON_PROPERTY_DEFENSE_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefenseReasonCode() {
    return defenseReasonCode;
  }

  /**
   * The defense reason code that was selected to defend this dispute.
   *
   * @param defenseReasonCode
   */ 
  @JsonProperty(JSON_PROPERTY_DEFENSE_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefenseReasonCode(String defenseReasonCode) {
    this.defenseReasonCode = defenseReasonCode;
  }

  /**
   * Indicates if sufficient defense material has been supplied.
   *
   * @param satisfied
   * @return the current {@code DefenseReason} instance, allowing for method chaining
   */
  public DefenseReason satisfied(Boolean satisfied) {
    this.satisfied = satisfied;
    return this;
  }

  /**
   * Indicates if sufficient defense material has been supplied.
   * @return satisfied
   */
  @ApiModelProperty(required = true, value = "Indicates if sufficient defense material has been supplied.")
  @JsonProperty(JSON_PROPERTY_SATISFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSatisfied() {
    return satisfied;
  }

  /**
   * Indicates if sufficient defense material has been supplied.
   *
   * @param satisfied
   */ 
  @JsonProperty(JSON_PROPERTY_SATISFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSatisfied(Boolean satisfied) {
    this.satisfied = satisfied;
  }

  /**
   * Return true if this DefenseReason object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefenseReason defenseReason = (DefenseReason) o;
    return Objects.equals(this.defenseDocumentTypes, defenseReason.defenseDocumentTypes) &&
        Objects.equals(this.defenseReasonCode, defenseReason.defenseReasonCode) &&
        Objects.equals(this.satisfied, defenseReason.satisfied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defenseDocumentTypes, defenseReasonCode, satisfied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefenseReason {\n");
    sb.append("    defenseDocumentTypes: ").append(toIndentedString(defenseDocumentTypes)).append("\n");
    sb.append("    defenseReasonCode: ").append(toIndentedString(defenseReasonCode)).append("\n");
    sb.append("    satisfied: ").append(toIndentedString(satisfied)).append("\n");
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
   * Create an instance of DefenseReason given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefenseReason
   * @throws JsonProcessingException if the JSON string is invalid with respect to DefenseReason
   */
  public static DefenseReason fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DefenseReason.class);
  }
/**
  * Convert an instance of DefenseReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}