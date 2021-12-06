package config;

import beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ProjectConfig {

  @Bean
  @Lazy
  public Cat cat() {
    return new Cat();
  }


}
