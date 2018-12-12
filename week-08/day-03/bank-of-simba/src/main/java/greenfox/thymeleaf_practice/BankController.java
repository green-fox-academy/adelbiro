package greenfox.thymeleaf_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
  BankAccount account = new BankAccount("Simba", 2000, "lion");
  BankRegister accountList = new BankRegister();
  List<BankAccount> list = new ArrayList<>();

  @RequestMapping (path="/show")
  public String show(Model model) {
    model.addAttribute("account", account);

    return "index";
  }

  @RequestMapping (path ="/enjoy")
  public String enjoyString () {
    return "enjoy";
  }

  @RequestMapping (path ="/show-all")
  public String showAll(Model model) {
    list.add(new BankAccount("Simba", 2000, "lion"));
    list.add(new BankAccount("Pumba", 600, "hog"));
    list.add(new BankAccount("Timon", 100, "szurikata"));
    list.add(new BankAccount("Nala", 1400, "lion"));
    list.add(new BankAccount("Simbas Father", 6000, "lion king"));

    model.addAttribute("list", list);
    return "all";
  }



}
