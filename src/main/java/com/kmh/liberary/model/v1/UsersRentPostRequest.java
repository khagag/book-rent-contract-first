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
 * UsersRentPostRequest
 */

@JsonTypeName("_users_rent_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-28T21:42:07.323633100+02:00[Africa/Cairo]", comments = "Generator version: 7.8.0")
public class UsersRentPostRequest {

  private Optional<Integer> bookId = Optional.empty();

  public UsersRentPostRequest bookId(Integer bookId) {
    this.bookId = Optional.of(bookId);
    return this;
  }

  /**
   * Get bookId
   * @return bookId
   */
  
  @Schema(name = "bookId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookId")
  public Optional<Integer> getBookId() {
    return bookId;
  }

  public void setBookId(Optional<Integer> bookId) {
    this.bookId = bookId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRentPostRequest usersRentPostRequest = (UsersRentPostRequest) o;
    return Objects.equals(this.bookId, usersRentPostRequest.bookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRentPostRequest {\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
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

