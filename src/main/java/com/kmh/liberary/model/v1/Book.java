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
 * Book
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-28T21:42:07.323633100+02:00[Africa/Cairo]", comments = "Generator version: 7.8.0")
public class Book {

  private Optional<Integer> id = Optional.empty();

  private Optional<String> title = Optional.empty();

  private Optional<String> author = Optional.empty();

  private Optional<String> isbn = Optional.empty();

  private Optional<Integer> quantity = Optional.empty();

  public Book id(Integer id) {
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

  public Book title(String title) {
    this.title = Optional.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  public void setTitle(Optional<String> title) {
    this.title = title;
  }

  public Book author(String author) {
    this.author = Optional.of(author);
    return this;
  }

  /**
   * Get author
   * @return author
   */
  
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public Optional<String> getAuthor() {
    return author;
  }

  public void setAuthor(Optional<String> author) {
    this.author = author;
  }

  public Book isbn(String isbn) {
    this.isbn = Optional.of(isbn);
    return this;
  }

  /**
   * Get isbn
   * @return isbn
   */
  
  @Schema(name = "isbn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public Optional<String> getIsbn() {
    return isbn;
  }

  public void setIsbn(Optional<String> isbn) {
    this.isbn = isbn;
  }

  public Book quantity(Integer quantity) {
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
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.quantity, book.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, author, isbn, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
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

