package com.example.services;

import com.example.entities.Product;
import com.example.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public void addProduct(Product p) {
    productRepository.save(p);
  }
}
