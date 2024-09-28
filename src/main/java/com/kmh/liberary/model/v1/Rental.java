package com.kmh.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rental
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-28T21:42:07.323633100+02:00[Africa/Cairo]", comments = "Generator version: 7.8.0")
public class Rental {

  private Optional<Integer> id = Optional.empty();

  private Optional<Integer> userId = Optional.empty();

  private Optional<Integer> bookId = Optional.empty();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Optional<LocalDate> rentDate = Optional.empty();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Optional<LocalDate> dueDate = Optional.empty();

  public Rental id(Integer id) {
    this.id = Optional.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  public void setId(Optional<Integer> id) {
    this.id = id;
  }

  public Rental userId(Integer userId) {
    this.userId = Optional.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Optional<Integer> getUserId() {
    return userId;
  }

  public void setUserId(Optional<Integer> userId) {
    this.userId = userId;
  }

  public Rental bookId(Integer bookId) {
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

  public Rental rentDate(LocalDate rentDate) {
    this.rentDate = Optional.of(rentDate);
    return this;
  }

  /**
   * Get rentDate
   * @return rentDate
   */
  @Valid 
  @Schema(name = "rentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rentDate")
  public Optional<LocalDate> getRentDate() {
    return rentDate;
  }

  public void setRentDate(Optional<LocalDate> rentDate) {
    this.rentDate = rentDate;
  }

  public Rental dueDate(LocalDate dueDate) {
    this.dueDate = Optional.of(dueDate);
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
   */
  @Valid 
  @Schema(name = "dueDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public Optional<LocalDate> getDueDate() {
    return dueDate;
  }

  public void setDueDate(Optional<LocalDate> dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rental rental = (Rental) o;
    return Objects.equals(this.id, rental.id) &&
        Objects.equals(this.userId, rental.userId) &&
        Objects.equals(this.bookId, rental.bookId) &&
        Objects.equals(this.rentDate, rental.rentDate) &&
        Objects.equals(this.dueDate, rental.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, bookId, rentDate, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rental {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    rentDate: ").append(toIndentedString(rentDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

