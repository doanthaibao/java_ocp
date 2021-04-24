package com.example.chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

  public static void main(String[] args) {
    var str = "abc";
    Consumer<List<Integer>> methodRef = Collections::sort;
    Predicate<String> methodRef2 = str::startsWith;
    Predicate<String> methodRef3 = String::isEmpty;
    Supplier<List<String>> methodRef4 = ArrayList::new;
  }
}
