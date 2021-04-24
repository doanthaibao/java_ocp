package com.example.chapter2;

import java.util.Comparator;
enum SEASON {
  WINTER,
  SPRING,
  SUMMER,
  AUTUMN
}
public class DemoVar {
 public void test(){}
  public static void main(String[] args) {
    var a = SEASON.valueOf("SPRING");
    switch (a){
      default:
      case WINTER:
        break;

    }
  }
}
class Abc extends DemoVar{
 public long testing(){
   return 5;
 }
}
