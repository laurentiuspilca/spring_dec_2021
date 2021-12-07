package main;

public class Main {

  public static void main(String[] args) {
    ThreadLocal<String> tl = new ThreadLocal<>();

    new ExampleThread("T1", tl, "A").start();
    new ExampleThread("T2", tl, "B").start();
  }
}
