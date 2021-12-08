package com.example.exceptions;

public class AlreadyExistingProductException extends RuntimeException {

  public AlreadyExistingProductException(int id) {
    super("Product with id " + id + " already exists.");
  }
}
