package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstDatabaseConnection {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
         PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"People\"");
         ResultSet rs = ps.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString("name"));
      }
    }
  }
}
