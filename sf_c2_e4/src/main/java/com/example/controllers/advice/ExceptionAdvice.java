package com.example.controllers.advice;

import com.example.exceptions.AlreadyExistingProductException;
import com.example.exceptions.NonExistingProductException;
import com.example.model.ExceptionBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

  @ExceptionHandler(AlreadyExistingProductException.class)
  public ResponseEntity<ExceptionBody> alreadyExistingProductException() {
    ExceptionBody body = new ExceptionBody("12345", "Exception. Product already exists");
    return ResponseEntity.badRequest().body(body);
  }

  @ExceptionHandler(NonExistingProductException.class)
  public ResponseEntity<ExceptionBody> nonExistingProductException() {
    ExceptionBody body = new ExceptionBody("55555", "Exception. Product doesn't exist");
    return ResponseEntity.badRequest().body(body);
  }

  @ExceptionHandler(Throwable.class)
  public ResponseEntity<ExceptionBody> genericException(Throwable t) {
    ExceptionBody body = new ExceptionBody("000000", "Generic exception");
    t.printStackTrace();
    return ResponseEntity.badRequest().body(body);
  }
}
