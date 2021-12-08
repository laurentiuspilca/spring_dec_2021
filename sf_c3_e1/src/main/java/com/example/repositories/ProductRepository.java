package com.example.repositories;

import com.example.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("SELECT p FROM Product p WHERE p.name = :name") // JPQL / HQL
  Optional<Product> findProductByName(String name);
}
