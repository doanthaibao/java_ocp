package com.example.location;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

  public static void printWelcomeMessage(Locale locale) {
    var rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello")
                       + ", " + rb.getString("open"));
  }

  public static void main(String[] args) {
    var us = new Locale("en", "US");
    var france = new Locale("fr", "FR");
    printWelcomeMessage(us);     // Hello, The zoo is open
    printWelcomeMessage(france); // Bonjour, Le zoo est ouvert
  }
}
