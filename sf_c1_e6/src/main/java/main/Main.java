package main;

import beans.Product;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Product p1 = c.getBean("product1", Product.class);
    Product p2 = c.getBean("product1", Product.class);
    Product p3 = c.getBean("product1", Product.class);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}
