package com.example.controllers;

import com.example.entities.Product;
import com.example.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

  private final ProductService productService;

  @PostMapping("/")
  public void addProduct(@RequestBody Product product) {
    productService.addProduct(product);
  }

  @GetMapping("/")
  public List<Product> findAll() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findById(@PathVariable int id) {
    return productService.findById(id);
  }
}
