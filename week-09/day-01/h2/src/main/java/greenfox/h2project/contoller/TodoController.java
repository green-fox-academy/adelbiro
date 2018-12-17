package greenfox.h2project.contoller;

import greenfox.h2project.model.Todo;
import greenfox.h2project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {


  TodoRepository repository;

  @Autowired
  TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping (value = {"/", "/list"})
  public String list(Model model){
    this.repository.save(new Todo("learn this sht"));
    this.repository.save(new Todo("print list elements"));
    model.addAttribute("todos", this.repository.findAll());
    return "todolist";
  }


}
