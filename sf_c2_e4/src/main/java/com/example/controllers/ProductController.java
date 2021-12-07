package com.example.controllers;

import com.example.model.Product;
import com.example.services.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/{id}")
  public Product findProduct(@PathVariable int id) {
    return productService.findProduct(id);
  }

  // @Valid vs. @Validated
  @PostMapping("/")
  public void addProduct(@Valid @RequestBody Product product) {
    productService.addProduct(product);
  }
}
