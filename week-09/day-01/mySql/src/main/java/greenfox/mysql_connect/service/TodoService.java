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
public class TodoService {
  TodoRepository repository;
  AssigneeRepository assigRepository;
  List<Todo> list;
  List<Assignee> listOf;

  @Autowired
  public TodoService(TodoRepository repository, AssigneeRepository assigRepository) {
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

  public Todo getTodo(long id) {
    return repository.findById(id).get();
  }

  public Iterable<Todo> search(String title) {
    return repository.findAllByTitleContaining(title);
  }

  public List<Assignee> getAllAssignees() {
    listOf = new ArrayList<>();
    assigRepository.findAll().forEach(listOf::add);
    return listOf;
  }

  public void addAssignee(Assignee assignee) {
    assigRepository.save(assignee);
  }
}
