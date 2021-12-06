package main;

import beans.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Spring {

  public static void main(String[] args) throws Exception {

    Class productKlass = Class.forName("beans.Product");
    Constructor constructor = productKlass.getDeclaredConstructor();

    Product p1 = (Product) constructor.newInstance();

    Field f1 = productKlass.getDeclaredField("name");
    f1.setAccessible(true);
    f1.set(p1, "Beer");

    System.out.println(p1 + " " + p1.getName());

    Product p2 = new Product();

    System.out.println(p2+ " " + p2.getName());
  }
}
