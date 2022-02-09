package com.emirleroglu.carsharingproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

  @Autowired
  private DataSource dataSource;

  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  public String userAccess() {
    return "User Content.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }



  @RequestMapping("/db")
  String db() {
    try (Connection connection = dataSource.getConnection()) {
      Statement stmt = connection.createStatement();

      stmt.executeUpdate("INSERT INTO stations(stationname,town_id) VALUES ('DUDULLU CAMPUS','292');\n" +
              "INSERT INTO stations(stationname,town_id) VALUES ('ÇENGELKÖY CAMPUS','292');");







      return "db";
    } catch (Exception e) {

      return "error";
    }
  }

}






