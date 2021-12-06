package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

  public static void main(String[] args) {

    Calculator c = (Calculator) Proxy.newProxyInstance(
        Main.class.getClassLoader(),   // class loader
        new Class[]{Calculator.class}, // interfetele implementate
        new CustomInvocationHandler() // logica - cum le implementezi
    );

    System.out.println(c.sum(10, 20));
    System.out.println(c.substract(10, 20));

    System.out.println(c.getClass());
  }
}
