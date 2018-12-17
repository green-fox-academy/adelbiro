package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
  TodoRepository repository;
  List<Todo> list;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public List<Todo> getAllTodos() {
    list = new ArrayList<>();
    repository.findAll()
              .forEach(list::add);
    return list;
  }


  public boolean getActive() {
    if (list.stream().filter(Todo::isDone))
  }
}
