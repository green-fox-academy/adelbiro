package greenfox.springadvanced.controller;

import greenfox.springadvanced.model.Todo;
import greenfox.springadvanced.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RTodoController {

  TodoServiceImpl service;

  @Autowired
  public RTodoController (TodoServiceImpl service) {
    this.service = service;
  }

  @GetMapping ("/api/")
  public ResponseEntity<List<Todo>> show() {
    return new ResponseEntity<>(service.getTodos(), HttpStatus.OK);
  }

  @PostMapping("/api/")
  public ResponseEntity save(@RequestBody Todo todo) {
    service.addTodo(todo);
    return new ResponseEntity(HttpStatus.CREATED);
  }
}
