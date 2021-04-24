package com.example.chapter9;
import java.util.concurrent.*;
import java.util.stream.*;
public class Boat {
  static int count= 0;
  private void waitTillFinished(CyclicBarrier c) {
    try {
      System.out.println(count++);
      c.await();
      System.out.print("W");
    } catch (Exception e) {}
  }
  public void row(ExecutorService s) {
    var cb = new CyclicBarrier(5);
    IntStream.iterate(1, i-> i+1)
        .limit(12)
        .forEach(i -> s.submit(() -> waitTillFinished(cb)));
  }
  public static void main(String[] oars) {
    ExecutorService service = null;
    try {
      service = Executors.newCachedThreadPool();
      new Boat().row(service);
    } finally {
      service.isShutdown();
      new Thread().run();
    }
  }
}
