package com.example.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultipleLock {

  public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    if(lock.tryLock()) {
      try {
        lock.lock();
        System.out.println("Lock obtained, entering protected code");
      } finally {
        lock.unlock();
        lock.unlock();
      }
    }

    new Thread(() -> System.out.print(lock.tryLock())).start();
//    System.out.println(lock.tryLock());
  }

}
