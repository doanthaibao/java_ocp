package com.example.demo;

public class Zoo {

  private  interface Paper {
    public String getId();
  }
  public class Ticket implements Paper {

    private String serialNumber;
    @Override
    public String getId() {
      return serialNumber;
    }
  }

  public Ticket sellTicket(String serialNumber) {
    var t = new Ticket();
    t.serialNumber = serialNumber;
    return t;
  }
}
