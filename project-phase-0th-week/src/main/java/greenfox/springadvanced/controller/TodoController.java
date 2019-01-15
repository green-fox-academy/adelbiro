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
  public String showIndex() {
  //authorization needed,  if ()
    return "index";
  }

  @PostMapping ("/")
  public String addItem(Model model, Todo todo) {
    service.addTodo(todo);
    return "redirect:/";
  }


}
