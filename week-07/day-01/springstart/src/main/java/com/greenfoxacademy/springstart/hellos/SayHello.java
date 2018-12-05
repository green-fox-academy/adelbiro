package com.greenfoxacademy.springstart.hellos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHello {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  int fontSize;
  int color;

  @RequestMapping("/sayhello")
  public String sayHellos(Model model) {
    fontSize = 8 + (int) (Math.random() * 16);
    color = (int) (Math.random() * 256);
    String hello = "";
    for (int i = 0; i < hellos.length; i++) {
      hello = hellos[(int) (Math.random() * hellos.length)];
    }
    model.addAttribute("hello", hello);
    return "hello";
  }
}
