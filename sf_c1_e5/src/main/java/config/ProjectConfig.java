package config;

import beans.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

  @Bean
  public Product product1() {
    return new Product("Prod 1");
  }

  @Bean
  public Product product2() {
    return new Product("Prod 2");
  }
}