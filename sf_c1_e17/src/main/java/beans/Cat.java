package beans;

import org.springframework.stereotype.Component;

@Component
public class Cat {

  private final Owner owner;

  public Cat(Owner owner) {
    this.owner = owner;
  }

}
