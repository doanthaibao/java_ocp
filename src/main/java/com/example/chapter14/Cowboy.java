package com.example.chapter14;

public class Cowboy {

  private int space = 5;
  private double ship = space < 2 ? 3L : 10.0f;  // g1

  public void printMessage() {
    if (ship > 1) {
      System.out.print("Goodbye!");
    }
    if (ship < 10 && space >= 2)                   // g2
    {
      System.out.print("Hello!");
    } else {
      System.out.print("See you again!");
    }
  }

  public static final void main(String... stars) {
    new Cowboy().printMessage();
  }
}