package com.example.controllers;

import com.example.model.Product;
import com.example.proxy.ProductServiceProxy;
import feign.FeignException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

  private final ProductServiceProxy productServiceProxy;

  public ProductController(ProductServiceProxy productServiceProxy) {
    this.productServiceProxy = productServiceProxy;
  }

  @GetMapping("/{id}")
  public Product findProduct(@PathVariable int id) {
    try {
      var re = productServiceProxy.findProduct(id);
      return re.getBody();
    } catch (FeignException e) {
      System.out.println("Status " + e.status());
    }

    return null;
  }

  @PostMapping("/")
  public void addProduct(@RequestBody Product product) {
     productServiceProxy.addProduct(product);
  }
}
