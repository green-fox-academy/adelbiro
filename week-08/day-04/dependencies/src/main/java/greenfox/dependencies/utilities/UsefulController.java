package greenfox.dependencies.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

  @Autowired
  UtilityService service;

  @RequestMapping ("/useful")
  public String showEveryUtility() {
    return "useful";
  }

  @RequestMapping ("/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("color", service.randomColor());
    return "coloredBg";
  }


  @RequestMapping ("/useful/email")
  public String emailValidator(Model model, @RequestParam() String email) {
    model.addAttribute("email", service.validateEmail(email));
    model.addAttribute("theEmail", email);
    return "email";
  }

  @RequestMapping ("/caesar")
  public String decode(Model model, @RequestParam() String text) {
    model.addAttribute("input", service.caesar(text, text.length()));
    return "caesar";
  }
}
