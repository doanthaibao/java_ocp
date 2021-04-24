package com.example.chapter3;
class ProblemException extends Exception {
  ProblemException(Exception e) { super(e); }
}
class MajorProblemException extends ProblemException {
  MajorProblemException(String message) { super(new Exception(message)); }
}

public class Sleep {

  public static void snore() throws Exception {
    try {
      String sheep[] = new String[3];
      System.out.println((Object) null);
    } catch (RuntimeException | Error e) {
      System.out.print("Awake!");
    } finally {
      throw new Exception();
    }
  }
  public static void main(String ... strings) throws Exception {
    new Sleep().snore();
  }
}


