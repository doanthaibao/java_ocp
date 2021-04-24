package com.example.chapter3;

class DiskPlayer implements AutoCloseable {

  public void close() {
  }
}

public class LightCycle {

  public static void main(String ...bits) {
    DiskPlayer john = new DiskPlayer();
    try (john) {
      System.out.println("ping");
      john.close();
    }
    catch (Exception e){
      john.close();
    }
    finally {
      System.out.println("pong");
      john.close();
    }
//    john = null;
    System.out.println("return");
  }
}

