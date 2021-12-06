package service;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductManagementService {

  private final ProductRepository productRepository;

  public ProductManagementService(@Qualifier("mongo") ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void addProduct(Product p) {
    productRepository.add(p);
  }
}
