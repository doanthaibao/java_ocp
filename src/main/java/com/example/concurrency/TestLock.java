package com.example.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

  public static void printMessage(Lock lock) {
    try {
      lock.lock();
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      //lock.unlock();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Lock lock = new ReentrantLock();
    new Thread(() -> printMessage(lock)).start();
    System.out.println("Start unlock " + System.currentTimeMillis());
    if (lock.tryLock(10, TimeUnit.SECONDS)) {
      try {
        System.out.println("Lock obtained, entering protected code");
      } finally {
        lock.unlock();
      }
    } else {
      System.out.println("Unable to acquire lock, doing something else");
    }
    System.out.println("End unlock " + System.currentTimeMillis());

  }
}
