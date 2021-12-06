package repositories;

import entities.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysql")
public class MySQLProductRepository implements ProductRepository {

  @Override
  public void add(Product p) {
    System.out.println("Adding product with MySQL...");
  }
}
