package main;

import beans.Calculator;
import beans.SumCalculator;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var calc = c.getBean(Calculator.class);

    Integer sum = calc.sum(10, 20);

    System.out.println(calc.getClass());
    System.out.println(sum); // 30
  }
}
