package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Assignee;
import greenfox.mysql_connect.model.Todo;
import greenfox.mysql_connect.repository.AssigneeRepository;
import greenfox.mysql_connect.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {
  private TodoRepository repository;
  private AssigneeRepository assigRepository;
  private List<Todo> list;
  private List<Assignee> listOf;

  @Autowired
  public TodoServiceImpl(TodoRepository repository, AssigneeRepository assigRepository) {
    this.repository = repository;
    this.assigRepository = assigRepository;
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

  public Todo findTodo(long id) {
    return repository.findById(id);
  }

  public List<Todo> search(String title) {
    return repository.findAllByTitleContaining(title);
  }

  @Override
  public void markDone(long id) {
    Todo todo = repository.findById(id);
    if (todo.isDone()) {
      todo.setDone(false);
    } else {
      todo.setDone(true);
    }
    repository.save(todo);
  }

}
