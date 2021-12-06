package beans;

import org.springframework.beans.factory.annotation.Autowired;

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
