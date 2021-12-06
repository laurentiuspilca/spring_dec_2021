package controllers;

import entities.Product;
import org.springframework.stereotype.Controller;
import service.ProductManagementService;

@Controller
public class ProductController {

  private final ProductManagementService productManagementService;

  public ProductController(ProductManagementService productManagementService) {
    this.productManagementService = productManagementService;
  }

  public void addProduct(Product p) {
    productManagementService.addProduct(p);
  }
}
