package greenfox.rest.service;

import greenfox.rest.model.ErrorMessage;
import greenfox.rest.model.Greet;
import org.springframework.stereotype.Service;

@Service
public class Services {

  public Object greeting(String name, String title) {
    if (name != null & title != null) {
      return new Greet(name, title);
    } else if (name == null & title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name == null & title != null) {
      return new ErrorMessage("Please provide a name!");
    } else if (name != null & title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new ErrorMessage("another error");
    }
  }
}

