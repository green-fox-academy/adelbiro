package greenfox.springadvanced.controller;

import greenfox.springadvanced.model.Todo;
import greenfox.springadvanced.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

  TodoServiceImpl service;

  @Autowired
  public TodoController(TodoServiceImpl service) {
    this.service = service;
  }

  @GetMapping ("/")
  public String showIndex(Model model) {
    model.addAttribute("todos", service.getTodos());
    model.addAttribute("todo", new Todo());
  //authorization needed,  if ()
    return "index";
  }

  @PostMapping ("/")
  public String addItem(Todo todo) {
    service.addTodo(todo);
    return "redirect:/";
  }

}
