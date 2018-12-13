package greenfox.thymeleaf_practice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BankController {
  BankAccount account = new BankAccount("Simba", 2000, "lion");
  BankRegister accountList = new BankRegister();

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
    model.addAttribute("accountList", accountList.getAccountList());
    return "all";
  }

  @PostMapping(value="/add-balance", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String giveThemZebras(@RequestBody MultiValueMap<String, String> formData) {
    accountList.incrementBalance(formData.toSingleValueMap().get("addThemZebra"));
    return "redirect:/show-all";
  }

/*
  @PostMapping (path="/add-account")
  public String addAccount () {

  }
*/

}
