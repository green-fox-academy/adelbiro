package greenfox.mysql_connect.contoller;

import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.service.AssigneeService;
import greenfox.mysql_connect.service.TodoService;
import greenfox.mysql_connect.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  private TodoService service;
  private AssigneeService assigneeService;

  @Autowired
  TodoController(TodoService service, AssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
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
    model.addAttribute("allassignees", assigneeService.getAllAssignees());
    return "new";
  }

  @PostMapping (value = "/add")
  public String add(@ModelAttribute Todo todo){
    service.add(todo);
    return "redirect:/todo/";
  }

  @GetMapping (value = "/{id}/delete")
  public String delete(@PathVariable long id) {
    service.delete(id);
    return "redirect:/todo/";
  }

  @GetMapping (value = "/{id}/edit")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.findTodo(id));
    return "edit";
  }

  @PutMapping (value = "/{id}/edit")
  public String edit(@ModelAttribute Todo editedTodo, @PathVariable long id) {
    service.add(editedTodo);
    return "redirect:/todo/";
  }

  @GetMapping (value = "/search")
  public String search(@RequestParam(value = "text", required = false) String text, Model model) {
    model.addAttribute("todos", service.search(text));
    return "todolist";
  }

  @PutMapping (value = "/{id}")
  public String markAsDOne(@PathVariable long id) {
    service.markDone(id);
    return "todolist";
  }

}
