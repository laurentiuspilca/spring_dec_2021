package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.DemoService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var ds = c.getBean(DemoService.class);

    ds.doSmth();

    System.out.println(ds.getClass());
  }
}
