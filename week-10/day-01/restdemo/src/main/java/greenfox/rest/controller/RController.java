package greenfox.rest.controller;

import greenfox.rest.model.Doubled;
import greenfox.rest.model.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name="input", required=false) Integer inputNumber) {
    if (inputNumber == null) {
      return new ErrorMessage();
    } else return new Doubled(inputNumber);
  }
}
