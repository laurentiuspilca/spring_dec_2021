package com.example.model;

public class ExceptionBody {

  private final String code;
  private final String message;

  public ExceptionBody(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
