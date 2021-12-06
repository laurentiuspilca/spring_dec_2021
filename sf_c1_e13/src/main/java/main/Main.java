package main;

import controllers.ProductController;
import entities.Product;
import org.springframework.context.ApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext c = ApplicationContextHolder.getInstance().getApplicationContext();

    ProductController controller = c.getBean(ProductController.class);
    controller.addProduct(new Product());
  }

}
