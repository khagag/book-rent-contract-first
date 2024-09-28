package com.kmh.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Review
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-28T21:42:07.323633100+02:00[Africa/Cairo]", comments = "Generator version: 7.8.0")
public class Review {

  private Optional<Integer> id = Optional.empty();

  private Optional<Integer> userId = Optional.empty();

  private Optional<Integer> bookId = Optional.empty();

  private Optional<@Min(1) @Max(5) Integer> rating = Optional.empty();

  private Optional<String> comment = Optional.empty();

  public Review id(Integer id) {
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

  public Review userId(Integer userId) {
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

  public Review bookId(Integer bookId) {
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

  public Review rating(Integer rating) {
    this.rating = Optional.of(rating);
    return this;
  }

  /**
   * Get rating
   * minimum: 1
   * maximum: 5
   * @return rating
   */
  
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public Optional<@Min(1) @Max(5) Integer> getRating() {
    return rating;
  }

  public void setRating(Optional<Integer> rating) {
    this.rating = rating;
  }

  public Review comment(String comment) {
    this.comment = Optional.of(comment);
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public Optional<String> getComment() {
    return comment;
  }

  public void setComment(Optional<String> comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review review = (Review) o;
    return Objects.equals(this.id, review.id) &&
        Objects.equals(this.userId, review.userId) &&
        Objects.equals(this.bookId, review.bookId) &&
        Objects.equals(this.rating, review.rating) &&
        Objects.equals(this.comment, review.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, bookId, rating, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

