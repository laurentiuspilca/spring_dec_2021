package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equals("sum")) {
      Integer x = (Integer) args[0];
      Integer y = (Integer) args[1];
      return x + y;
    }
    if (method.getName().equals("substract")) {
      Integer x = (Integer) args[0];
      Integer y = (Integer) args[1];
      return x - y;
    }
    return null;
  }
}
