package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  static AtomicLong atomicL = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam() String name) {
    model.addAttribute("name", name);
    atomicL.increment();
    model.addAttribute("counter", atomicL.toString());
    return "greeting";
  }
}
