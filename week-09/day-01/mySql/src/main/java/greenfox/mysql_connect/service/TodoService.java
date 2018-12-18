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

  public Todo getTodo(long id) {
    return repository.findById(id).get();
  }

  public void editTodo(long id, String newTitle, boolean urgent, boolean done) {
    if (newTitle != null) {
      getTodo(id).setTitle(newTitle);
      getTodo(id).setUrgent(urgent);
      getTodo(id).setUrgent(done);

      list.set(index, getTodo(id)))
      add(Todo(newTitle, urgent, done));
    }
  }

  public int searchIDFromList() {

  }
}
