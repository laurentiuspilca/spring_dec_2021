package config;

import beans.Product;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

  @Bean
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public Product product1() {
    return new Product("Prod 1");
  }

}