package com.example.repositories;

import com.example.model.Product;

import java.util.Optional;

public interface ProductRepository {

  void add(Product product);
  Product find(int id);
  Optional<Product> findByName(String name);

}
