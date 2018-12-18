package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
  TodoRepository repository;
  List<Todo> list;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public List<Todo> getAllTodos() {
    this.list = new ArrayList<>();
    repository.findAll().forEach(list::add);
    return list;
  }

  public List<Todo> getActive() {
    this.list = getAllTodos()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    return list;
  }

  public void add(Todo item) {
    repository.save(item);
  }

  public void delete(long id) {
    repository.deleteById(id);
  }
}
