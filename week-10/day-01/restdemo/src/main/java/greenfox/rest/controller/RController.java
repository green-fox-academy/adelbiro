package greenfox.rest.controller;

import greenfox.rest.model.*;
import greenfox.rest.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RController {

  Services service;

  @Autowired
  public RController(Services service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name="input", required = false) Integer inputNumber) {
    if (inputNumber == null) {
      return new ErrorMessage("Please provide an input!");
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

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(name = "action") String action, @RequestBody Until until) {
    return service.action(action, until);
  }

  @PostMapping("/arrays")
  public Object arraysHandler(@RequestBody Rosio arrayObject) {
    if (arrayObject.getWhat() != null && arrayObject.getNumbers() != null) {
      return service.arrayHandling(arrayObject);
    } else return new ErrorMessage("Please provide what to do with the number!");
  }
}
