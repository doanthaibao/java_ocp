package com.example.operator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Parent {

}

class A extends Parent {

}

class B extends Parent {

}

class Rabbit implements Comparable<Rabbit> {

  int id;


  @Override
  public int compareTo(Rabbit o) {
    return 0;
  }
}

public class InstanceOfTest {

  public static void main(String[] args) {
//    Set<Rabbit> rabbits = new TreeSet<>();
//    rabbits.add(new Rabbit());  // ClassCastException
//    System.out.println(rabbits.size());
    Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
    rabbits.add(new Rabbit());
  }

  public void remove(List<Character> chars) {
    final char end = 'z';
    chars.removeIf(c -> {
      char start = 'a';
      return start <= c && c <= end;
    });
    // end = 'e';
  }


}
