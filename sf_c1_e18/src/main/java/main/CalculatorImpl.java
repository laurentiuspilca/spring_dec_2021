package main;

public class CalculatorImpl implements Calculator {

  @Override
  public int sum(int x, int y) {
    return x + y;
  }

  @Override
  public int substract(int x, int y) {
    return x - y;
  }
}
