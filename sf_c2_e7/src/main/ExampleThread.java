package main;

import java.util.Random;

public class ExampleThread extends Thread {

  private ThreadLocal<String> tl;
  private String val;

  public ExampleThread(String name, ThreadLocal<String> tl, String val) {
    super(name);
    this.tl = tl;
    this.val = val;
  }

  @Override
  public void run() {
    try {
      while (true) {
        Thread.sleep(5000);

        tl.set(val);

        System.out.println(Thread.currentThread().getName() + " " + tl.get());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
