package com.example.controllers;

import com.example.model.HttpBinResponse;
import com.example.model.Product;
import com.example.proxy.HttpBinProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  private final HttpBinProxy httpBinProxy;

  public DemoController(HttpBinProxy httpBinProxy) {
    this.httpBinProxy = httpBinProxy;
  }

  @GetMapping("/demo")
  public HttpBinResponse demo(@RequestBody Product product) {
    var response = httpBinProxy.sendProduct(product);
    System.out.println(response.getStatusCode());
    return response.getBody();
  }
}
