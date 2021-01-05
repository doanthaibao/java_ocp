package com.example.demo;

enum Test {
  BERRIES, INSECTS;
}
public class Beetle {
  public static void main(String []args){
    System.out.println(Test.INSECTS.ordinal());
  }
}

