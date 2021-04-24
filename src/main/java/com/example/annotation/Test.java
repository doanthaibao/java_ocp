package com.example.annotation;

public class Test {

  @Age(value = 1)
  int age;
  public static void main(String[] args) {
//    Object x = null;
//    System.out.println(x.toString());
//    try {
//      test();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }

  }

  public void whatHappensNext() throws Exception {
    System.out.println("d");
    throw new Exception("");
  }
  public static void test() throws Exception {
    throw new Exception("");
  }

//  public void callSuperhero() {
//    try (String raspberry = new String("Olivia")) {
//      System.out.print("Q");
//    } catch (Error e) {
//      System.out.print("X");
//    } finally {
//      System.out.print("M");
//    }
//  }

}
