package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

  @Autowired
  private Cat cat;

  public Cat getCat() {
    return cat;
  }

  public void setCat(Cat cat) {
    this.cat = cat;
  }
}
