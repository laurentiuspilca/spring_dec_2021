package com.example.repositories;

import com.example.exceptions.NonExistingProductException;
import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArrayProductRepository implements ProductRepository {

  private List<Product> list = new ArrayList<>();

  @Override
  public void add(Product product) {
    list.add(product);
  }

  @Override
  public Product find(int id) {
    return list.stream()
        .filter(p -> p.getId() == id)
        .findFirst()
        .orElseThrow(NonExistingProductException::new);
  }

  @Override
  public Optional<Product> findByName(String name) {
    return list.stream()
        .filter(p -> p.getName().equals(name))
        .findFirst();
  }
}
