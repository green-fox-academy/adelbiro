package greenfox.mysql_connect.contoller;

import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  TodoServiceImpl service;

  @Autowired
  TodoController(TodoServiceImpl service) {
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

  @PostMapping (value = "/{id}/edit")
  public String edit(@ModelAttribute Todo editedTodo, @PathVariable long id) {
    service.add(editedTodo);
    return "redirect:/todo/";
  }

  @GetMapping (value = "/search")
  public String search(@RequestParam(value = "text", required = false) String text, Model model) {
    model.addAttribute("todos", service.search(text));
    return "todolist";
  }

}
