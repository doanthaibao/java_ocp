package com.example.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleService {

  public static void main(String[] args) throws Exception {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    Runnable task1 = () -> System.out.println("Hello Zoo");
    Callable<String> task2 = () -> "Monkey";
    ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
    ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES);
  }
}
