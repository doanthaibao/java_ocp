package com.example.chapter3;

public class WhackAnException {
  public static void main(String... hammer) {
    try {
      throw new ClassCastException();
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException();
    } catch (RuntimeException e) {
      throw new NullPointerException();
    } finally {
      //throw new RuntimeException();
    }
  }
}
/*** TODO: Call grandma ***/
///** Insert */ in next method **/

/****** Find the kitty cat */

