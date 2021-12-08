package com.example.controllers;

import com.example.entities.Product;
import com.example.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

  private final ProductService productService;

  @PostMapping("/")
  public void addProduct(@RequestBody Product product) {
    productService.addProduct(product);
  }
}
