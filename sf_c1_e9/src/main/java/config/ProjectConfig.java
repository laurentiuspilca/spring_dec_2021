package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  public Cat cat() {
    return new Cat();
  }

  @Bean
  public Owner owner() {
    return new Owner();
  }
}
