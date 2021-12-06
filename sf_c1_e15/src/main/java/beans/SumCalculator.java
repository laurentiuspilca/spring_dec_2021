package beans;

import aspects.Intercept;
import aspects.Security;
import org.springframework.stereotype.Component;

@Component
public class SumCalculator implements Calculator {

  @Intercept
  @Security
  public Integer sum(int x, int y) {
    return x + y;
  }
}
