package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class CustomAspect {

  @Around("@annotation(Intercept)")
  public Object aspectLogic(ProceedingJoinPoint jp) throws Throwable {
    System.out.println("CustomAspect");
    return jp.proceed();
  }
}
