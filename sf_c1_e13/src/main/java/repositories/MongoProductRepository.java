package repositories;

import entities.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mongo")
public class MongoProductRepository implements ProductRepository {

  @Override
  public void add(Product p) {
    System.out.println("Adding product with Mongo...");
  }
}
