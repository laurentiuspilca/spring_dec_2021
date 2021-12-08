package com.example.unit;

import com.example.entities.Product;
import com.example.exceptions.AlreadyExistingProductException;
import com.example.repositories.ProductRepository;
import com.example.services.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
class AddProductUnitTests {

  @Test
  @DisplayName("""
      If the product already exists in the database, 
      then we should not add the same product again.
      """)
  void test1() {
    ProductRepository productRepository = mock(ProductRepository.class);

    ProductService productService = new ProductService(productRepository);

    Product p = new Product();
    p.setName("Beer");
    p.setId(1);

    when(productRepository.findProductByName(anyString()))
        .thenReturn(Optional.of(p));

    assertThrows(AlreadyExistingProductException.class,
        () -> productService.addProduct(p));
  }

  @Test
  @DisplayName("""
      If the product doesn't exist in the database, 
      then we should add the product.
      """)
  void test2() {
    ProductRepository productRepository = mock(ProductRepository.class);

    ProductService productService = new ProductService(productRepository);

    Product p = new Product();
    p.setName("Beer");
    p.setId(1);

    when(productRepository.findProductByName(anyString()))
        .thenReturn(Optional.empty());

    productService.addProduct(p);

    verify(productRepository).save(p);
  }

}
