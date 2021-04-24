package com.example.chapter14;

import java.util.LinkedList;

public class TestLinkList {

  public static void main(String[] args) {
    var greetings = new LinkedList<String>();

    greetings.offer("hello");
    greetings.offer("hi");
    greetings.offer("ola");
    greetings.offer("bao");
    greetings.poll();
    while (greetings.peek() != null) {
      System.out.println(greetings.pop());
    }
  }
}
