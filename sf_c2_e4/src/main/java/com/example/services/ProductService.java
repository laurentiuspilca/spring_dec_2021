package com.example.services;

import com.example.exceptions.AlreadyExistingProductException;
import com.example.model.Product;
import com.example.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void addProduct(Product p) {
    var o = productRepository.findByName(p.getName());

    if (o.isEmpty()) {
      productRepository.add(p);
    } else {
      throw new AlreadyExistingProductException();
    }
  }

  public Product findProduct(int id) {
    return productRepository.find(id);
  }
}
