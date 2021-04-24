package com.example.chapter14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hello<T> {

  T t;

  public Hello(T t) {
    this.t = t;
  }

  public String toString() {
    return t.toString();
  }

  private <T> void println(T message) {
    System.out.print(t + "-" + message);
  }

  public static void main(String[] args) {
    List<? super Number> foo3 = new ArrayList<>(1);  // Integer is a "superclass" of Integer (in this context)
    foo3.add(new Integer(1));

  }
  public static void getExceptions(Collection<? super Exception> coll) {
    coll.add(new RuntimeException());
    coll.add(new Exception());
  }

}