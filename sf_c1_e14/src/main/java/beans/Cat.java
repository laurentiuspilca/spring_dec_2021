package beans;

import org.springframework.stereotype.Component;

@Component
public class Cat {

  public Cat() {
    System.out.println("A cat has been created");
  }
}
