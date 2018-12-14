package greenfox.foxclub.controllers;

import greenfox.foxclub.models.Fox;
import greenfox.foxclub.services.FoxHelper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
public class FoxController {

  ArrayList<Fox> boxOfFoxes;
  FoxHelper service;
  Fox fox;

  @RequestMapping ("/")
  public String main(Model model) {
    model.addAttribute("fox", new Fox("fox"));
    return "index";
  }

 @RequestMapping ("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping (value ="/login", consumes= MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String logIn(@RequestBody MultiValueMap<String, String> foxi) {
    boxOfFoxes.add(new Fox(foxi.toSingleValueMap().get("foxname")));
    fox = new Fox("Fox");
    return "redirect:/";
  }



}
