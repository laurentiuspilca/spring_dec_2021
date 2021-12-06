package beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter @Setter
public class Owner {

  private final Cat cat;

}
