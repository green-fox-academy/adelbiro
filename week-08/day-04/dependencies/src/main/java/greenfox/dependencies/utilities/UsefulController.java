package greenfox.dependencies.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

  UtilityService service;

  @Autowired
  public UsefulController(UtilityService service) {
    this.service = service;
  }

  @RequestMapping (value = "/useful")
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
    String thisIsTheEmail = email;
    model.addAttribute("email", service.validateEmail(email));
    model.addAttribute("theEmail", thisIsTheEmail);
    return "email";
  }


}
