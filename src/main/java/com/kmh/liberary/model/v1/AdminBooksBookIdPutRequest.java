package com.kmh.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdminBooksBookIdPutRequest
 */

@JsonTypeName("_admin_books__bookId__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-28T21:42:07.323633100+02:00[Africa/Cairo]", comments = "Generator version: 7.8.0")
public class AdminBooksBookIdPutRequest {

  private Optional<Integer> quantity = Optional.empty();

  public AdminBooksBookIdPutRequest quantity(Integer quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  public void setQuantity(Optional<Integer> quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBooksBookIdPutRequest adminBooksBookIdPutRequest = (AdminBooksBookIdPutRequest) o;
    return Objects.equals(this.quantity, adminBooksBookIdPutRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBooksBookIdPutRequest {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
}

