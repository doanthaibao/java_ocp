package com.example.demo;

public class GiraffeFamily {

  static {
    System.out.print("A");
  }

  {
    System.out.print("B");
  }

  public GiraffeFamily(String name) {
    this(1);
    System.out.print("C");
  }
  public void test(){}

//  public GiraffeFamily() {
//    System.out.print("D");
//  }

  public GiraffeFamily(int stripes) {
    System.out.print("E");
  }

}
