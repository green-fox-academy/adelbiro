package greenfox.mysql_connect.contoller;

import greenfox.mysql_connect.model.Assignee;
import greenfox.mysql_connect.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (value = "/todo")
public class AssigneeController {

  private AssigneeService service;

  @Autowired
  public AssigneeController(AssigneeService service) {
    this.service = service;
  }

  @GetMapping(value = "/assignees")
  public String listAssignees(Model model) {
    model.addAttribute("assigs", service.getAllAssignees());
    return "assignees";
  }

  @PostMapping (value = "/assignees")
  public String saveAssignee(@ModelAttribute Assignee assignee) {
    service.addAssignee(assignee);
    return"redirect:/assignees";
  }

  @GetMapping (value = "/assignees/{id}")
  public String editAssignee() {

    return "/editassignees";
  }


  @PutMapping (value = "/assignees/{id}")
  public String editAssignee(@ModelAttribute Assignee assignee) {
    service.editAssignee(assignee);
    return "assignees";
  }
}
