package com.example.chapter9;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

class Student implements Serializable {

  transient int score = -1;
  String name;

  public String toString() {
    return name + ":" + score;
  }
}

public class StudentManager {

  public static void main(String[] grades) {
    var halleysComet = Path.of("stars/./rocks/../m1.meteor")
        .subpath(1, 5);
        //.normalize();
    var lexellsComet = Paths.get("./stars/../solar").subpath(1, 3);

    System.out.print(halleysComet.equals(lexellsComet) ? "Same!" : "Different!");

  }
}

