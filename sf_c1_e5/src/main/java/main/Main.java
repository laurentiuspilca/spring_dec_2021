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

    Product p4 = c.getBean("product2", Product.class);

    System.out.println(p1.getName());
    System.out.println(p2.getName());
    System.out.println(p3.getName());

    System.out.println(p4.getName());
  }
}
