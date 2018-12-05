package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

  @RequestMapping (value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam() String name) {
    Greeting greet = new Greeting(2, "Hello, " + name);
    return greet;
  }
}
