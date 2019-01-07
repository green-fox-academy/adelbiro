package greenfox.rest.service;

import greenfox.rest.model.ErrorMessage;
import greenfox.rest.model.Greet;
import greenfox.rest.model.Until;
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

  public Object action(String action, Until until) {
    if (action.equals("factor")) {
      return factor(until);
    } else if (action.equals("sum")) {
      return sum(until);
    } else return new ErrorMessage("Please provide a number!");
  }

  private Object factor(Until until) {
    Integer result = 1;
    for (int i = 1; i <= until.getUntil() ; i++) {
      result = result * i;
    }
    until.setResult(result);
    return until;
  }

  private Object sum(Until until) {
    Integer result = 0;
    for (int i = 0; i <= until.getUntil(); i++) {
      result += i;
    }
    until.setResult(result);
    return until;
  }
}

