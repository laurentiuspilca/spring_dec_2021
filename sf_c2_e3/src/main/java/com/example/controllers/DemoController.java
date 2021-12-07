package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/ex1")
  public ResponseEntity<String> ex1() {
    try {
      return ResponseEntity.ok("Hello");
    } catch (RuntimeException e) {
      return ResponseEntity.badRequest().body("");
    }
  }
}
