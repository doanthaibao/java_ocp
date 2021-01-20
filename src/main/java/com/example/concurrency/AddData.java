package com.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {
  public static <T> T[] unsafe(T... elements) {
    return elements; // unsafe! don't ever return a parameterized varargs array
  }

  public static void main(String[] args) throws Exception {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(() -> 30 + 11);
      System.out
          .println(result.get());
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }
  }
}