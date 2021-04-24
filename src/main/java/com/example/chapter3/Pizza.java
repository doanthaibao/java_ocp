package com.example.chapter3;

public class Pizza {
  Exception order(RuntimeException e) {          // h1
    throw e;                                    // h2
  }
  public static void main(String... u) {
    var p = new Pizza();
    try {
      p.order(new IllegalArgumentException()); // h3
    } catch(RuntimeException e) {               // h4
      System.out.print(e);
    }
  }
}