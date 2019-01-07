package greenfox.rest.controller;

import greenfox.rest.model.Appended;
import greenfox.rest.model.Doubled;
import greenfox.rest.model.ErrorMessage;
import greenfox.rest.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

  @Autowired
  Services service = new Services();

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name="input", required=false) Integer inputNumber) {
    if (inputNumber == null) {
      return new ErrorMessage();
    } else return new Doubled(inputNumber);
  }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(name="name", required = false) String name,
                      @RequestParam( name="title", required = false) String title ) {
    return service.greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Appended appendA(@PathVariable(name = "appendable") String appendable) {
    return new Appended(appendable);
  }
}
