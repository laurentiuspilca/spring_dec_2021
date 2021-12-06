package beans;

import org.springframework.stereotype.Component;

@Component
public class Owner {

  private final Cat cat;

  public Owner(Cat cat) {
    this.cat = cat;
  }
}
