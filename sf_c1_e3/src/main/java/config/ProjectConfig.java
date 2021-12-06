package config;

import beans.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  public Product product() {
    Product p = new Product();
    /// p
    return p;
  }

  @Bean
  public String str() {
    return "HELLO";
  }

}
