package com.example.chapter3;

interface GameItem {
  int sell();
}
interface  A{
  default void test(){};
}
abstract class Vegetable implements GameItem {
  public final int sell() { return 5; }
}
public class Turnip extends Vegetable {
//  public final int sell() { return 3; }
  public static void main(String[] expensive) {
    System.out.print(new Turnip().sell());
  }
  public static final void test(){}
}

