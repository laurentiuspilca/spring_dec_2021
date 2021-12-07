package com.example.proxy;

import com.example.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "productservice", url = "${base.url}")
public interface ProductServiceProxy {

  @GetMapping("/{id}")
  ResponseEntity<Product> findProduct(@PathVariable int id);

  @PostMapping("/")
  ResponseEntity<?> addProduct(@RequestBody Product product);

}
