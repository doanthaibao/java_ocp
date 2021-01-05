package com.example.demo;

interface A {
  default public void test(){System.out.println("A");}
}
interface B {
  default public void test(){System.out.println("B");}
}
enum AAA {
  MAMAL(true);
  boolean t = false;
   AAA(Boolean tt){
    t = tt;
  }
}
public class CatInterface implements A, B{

  @Override
  public void test() {

  }
}
