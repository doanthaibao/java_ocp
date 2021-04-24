package com.example.chapter13;

public @interface Thermometer {

  int minTemp();

  int maxTemp() default 1;

  double[] color();

   String type = null;
  boolean compact = false;
}

