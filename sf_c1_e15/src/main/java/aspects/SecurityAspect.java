package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

  // pointcut
  @Around("@annotation(Security)")
  // @Before     join point
  // @After
  // @AfterReturning
  // @AfterThrowing
  public Object aspectLogic(ProceedingJoinPoint jp) throws Throwable {
    System.out.println("SecurityAspect");
    return jp.proceed();
  }
}
