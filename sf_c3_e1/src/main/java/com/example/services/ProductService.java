package com.example.services;

import com.example.entities.Product;
import com.example.exceptions.AlreadyExistingProductException;
import com.example.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public void addProduct(Product p) {
    var prod = productRepository.findProductByName(p.getName());

    prod.ifPresentOrElse(pr -> {
      throw new AlreadyExistingProductException(pr.getId());
    }, () -> {
      productRepository.save(p);
    });
  }

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(int id) {
    return productRepository.findById(id)
        .orElse(null);
  }
}
