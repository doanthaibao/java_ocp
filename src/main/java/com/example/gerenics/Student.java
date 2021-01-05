package com.example.gerenics;

import org.springframework.util.CollectionUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class Student {

  String name;
  int age;
  public static void print(List<? extends Object> list) {
    for(var i : list) {
      System.out.println(i.toString());
    }
  }
  public static  <T> void check(T t){

  }

  public static void main(String[] args) {
    List t = new ArrayList();
    System.out.println(CollectionUtils.isEmpty(t));
  }

}
