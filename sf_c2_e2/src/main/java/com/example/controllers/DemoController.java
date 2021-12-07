package com.example.controllers;

import com.example.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {

  /*
  GET, POST, PUT, DELETE, PATCH, OPTIONS
   */
//  @RequestMapping(method = RequestMethod.GET, value = "/")
  @GetMapping("/")  // @PostMapping, @PatchMapping
  public String demo() {
    return "HELLO";
  }

  @GetMapping("/ex1/{demo}")
  public void exemplu1(@PathVariable String demo) {
    System.out.println(demo);
  }

  @GetMapping("/ex2")
  public void exemplu2(@RequestParam String demo) {
    System.out.println(demo);
  }

  @GetMapping("/ex3")
  public void exemplu3(@RequestParam Map<String, String> demo) {
    System.out.println(demo);
  }

  @GetMapping("/ex4")
  public void exemplu4(@RequestBody Product product) {
    System.out.println(product);
  }

  @PatchMapping("/ex5")
  public void exemplu5(@RequestBody Product product) {
    System.out.println(product);
  }

  @GetMapping("/ex6")
  public Product exemplu6() {
    Product p = new Product();
    p.setColor("Gold");
    p.setName("Beer");
    return p;
  }

  @GetMapping("/ex7")
  public ResponseEntity<Product> exemplu7() {
    Product p = new Product();
    p.setColor("Gold");
    p.setName("Beer");
    return  ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .header("xyz", "bla bla bla")
        .body(p); //ResponseEntity.ok(p);
  }

  @GetMapping("/ex8")
  public Product exemplu7(HttpServletResponse response) {
    Product p = new Product();
    p.setColor("Gold");
    p.setName("Beer");

    response.setStatus(400);
    response.setHeader("xyz", "bla bla");

    return  p;
  }
}
