package greenfox.testing.controller;

import greenfox.testing.model.ErrorMessage;
import greenfox.testing.model.UserMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<Object> sayGroot(@RequestParam(value="message", required = false) String message) {
    if (message != null) {
      return new ResponseEntity(new UserMessage(message, "I am Groot!"), HttpStatus.OK);
    } else return new ResponseEntity(new ErrorMessage("I am Groot!"),  HttpStatus.BAD_REQUEST);
  }
}
