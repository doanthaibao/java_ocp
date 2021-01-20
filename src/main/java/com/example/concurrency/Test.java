package com.example.concurrency;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {

  public static void main(String[] args) {
    Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();
  }

  public void addAndPrintItems(BlockingQueue<Integer> queue) throws InterruptedException {
    queue.offer(103);
    queue.offer(20, 1, TimeUnit.SECONDS);
    queue.offer(85, 7, TimeUnit.HOURS);
    System.out.print(queue.poll(200, TimeUnit.NANOSECONDS));
    System.out.print(" " + queue.poll(1, TimeUnit.MINUTES));
  }
}
