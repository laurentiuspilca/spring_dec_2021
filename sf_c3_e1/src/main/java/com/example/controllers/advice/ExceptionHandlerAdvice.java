package com.example.controllers.advice;

import com.example.exceptions.AlreadyExistingProductException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

  @ExceptionHandler(AlreadyExistingProductException.class)
  public ResponseEntity<ExceptionBody> alreadyExistingProductException(AlreadyExistingProductException e) {
    ExceptionBody eb = new ExceptionBody("0001", "AlreadyExistingProductException");
    log.error("Problem with storing the product", e);
    return ResponseEntity.badRequest().body(eb);
  }
}
