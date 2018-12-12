package greenfox.thymeleaf_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BankController {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
  List<BankAccount> accountList;

  @RequestMapping (path="/show")
  public String show(Model model) {
    model.addAttribute("account", bankAccount);
    return "index";
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
  }

}
