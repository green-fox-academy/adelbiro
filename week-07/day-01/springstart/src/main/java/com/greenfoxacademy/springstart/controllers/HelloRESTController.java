package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

  AtomicLong atomic = new AtomicLong();

  @RequestMapping (value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam() String name) {
    Greeting greet = new Greeting(atomic.increment(), "Hello, " + name);
    return greet;
  }
}
