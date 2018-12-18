package greenfox.mysql_connect.contoller;

import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  TodoService service;

  @Autowired
  TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping (value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive){
    if (isActive) {
    model.addAttribute("todos", service.getActive());
    } else {
    model.addAttribute("todos", service.getAllTodos());
    }
    return "todolist";
  }

  @GetMapping (value = "/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "new";
  }

  @PostMapping (value = "/add")
  public String add(@ModelAttribute Todo todo){
    service.add(todo);
    return "redirect:/todo/";
  }

}
