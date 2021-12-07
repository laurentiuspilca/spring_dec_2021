package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

  @RequestMapping("/")
  public String home() {
    return "home.html";
  }
}
