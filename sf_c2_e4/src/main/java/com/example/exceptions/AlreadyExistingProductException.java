package com.example.exceptions;

public class AlreadyExistingProductException extends RuntimeException {

  public AlreadyExistingProductException() {
    super("This product already exists!");
  }
}
