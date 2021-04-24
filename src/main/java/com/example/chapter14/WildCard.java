package com.example.chapter14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Sparrow extends Bird {

}

class Bird {

}

public class WildCard {

  public static void print(List<? extends String> input) {
    input.stream().forEach(System.out::println);
  }

  public static void main(String[] args) {
    List<String> list = List.of("1", "2");
    print(list);
    var t = new ArrayList<String>();
    ArrayList<?> k = new ArrayList<>();
    List<? extends Bird> birds = new ArrayList<Bird>();

//    birds.add(new Sparrow()); // DOES NOT COMPILE8:
//    birds.add(new Bird());    // DOES NOT COMPILE

    List<? super IOException> exceptions = new ArrayList<Exception>();
//    exceptions.add(new Exception()); // DOES NOT COMPILE
    exceptions.add(new IOException());
    exceptions.add(new FileNotFoundException());
    List<?> list6 = new ArrayList< >();

  }
}
