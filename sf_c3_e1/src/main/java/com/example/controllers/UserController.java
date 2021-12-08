package com.example.controllers;

import com.example.entities.User;
import com.example.services.JpaUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

  private final JpaUserDetailsService userDetailsService;

  @PostMapping("/")
  public void addUser(@RequestBody User user) {
    userDetailsService.addUser(user);
  }
}
