package beans;

public class Product {

  private String name;

  public Product(String name) {
    this.name = name;
  }

  public void showName() {
    System.out.println(name);
  }

  public String getName() {
    return name;
  }
}
