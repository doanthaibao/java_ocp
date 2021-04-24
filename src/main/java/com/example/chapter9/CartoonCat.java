package com.example.chapter9;

import java.util.concurrent.*;

public class CartoonCat {

  private void await(CyclicBarrier c) {
    try {
      c.await();
    } catch (Exception e) {
    }
  }

  public void march(CyclicBarrier c) {
    var s = Executors.newCachedThreadPool();
    for (int i = 0; i < 12; i++) {
      s.execute(() -> await(c));
    }
    s.shutdown();
  }

  public static void main(String... strings) {
    new CartoonCat().march(new CyclicBarrier(4,
        () -> System.out.println("Ready")));
  }
}

