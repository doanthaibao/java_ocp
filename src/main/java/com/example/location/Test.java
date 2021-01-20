package com.example.location;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

  public static void main(String[] args) {
    Locale locale = Locale.getDefault();
    System.out.println(locale);
    double price = 48;
    var myLocale = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println(myLocale.format(price));
  }
}
