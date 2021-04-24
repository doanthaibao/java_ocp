package com.example.chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class JavaNIO implements Serializable {

  private Integer size = 1;
  private transient String name = "Red";

  {
    size = 3;
    name = "Purple";
  }

  public JavaNIO() {
    this.size = 2;
    name = "Green";
  }

  public static void main(String[] love) throws Throwable {
    var s = Path.of("/tea", "earlGrey", "hot");
    Files.find(s,2, (p, a) -> a.isDirectory());

  }

}
