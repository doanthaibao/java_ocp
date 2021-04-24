package com.example.chapter14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

interface Test6z$ {
   private static int test(){
    return 1;
  }
   void kk();
    default void tt(){

    }
}
public class Test {
  public static void main(String []args){
   var dice = new TreeSet<Integer>();
    dice.add(6);
    dice.add(6);
    dice.add(4);

//    dice.stream()
//        .filter(n -> n != 4).max
//        .forEach(System.out::println);
//        .count();


  }
  public static void getExceptions(Collection<? super Exception> coll) {
    coll.add(new RuntimeException());
    coll.add(new Exception());
  }
}
