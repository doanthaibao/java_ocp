package com.example.chapter3;

import java.io.IOException;

public class TestException extends RuntimeException {

  public TestException(Throwable e) {
    super(e);
  }

  public static void main(String []args){
//    new TestException("sdd");
  }
}
