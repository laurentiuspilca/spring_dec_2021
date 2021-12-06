package beans;

import org.springframework.stereotype.Component;

@Component
public class Product {

  private String name;

  public void showName() {
    System.out.println(name);
  }

  public String getName() {
    return name;
  }
}
