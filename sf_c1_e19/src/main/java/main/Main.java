package main;

import beans.Cat;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    final var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    c.getBean(Cat.class);

    c.close();
  }
}
