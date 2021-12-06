package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat {

  @PostConstruct
  void init() {
    System.out.println("INIT");
  }

  @PreDestroy
  void destroy() {
    System.out.println("DESTROY");
  }


}
