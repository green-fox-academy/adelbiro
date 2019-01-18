package greenfox.springadvanced.service;

import greenfox.springadvanced.model.Todo;
import greenfox.springadvanced.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {


  @Autowired
  TodoRepository repository;

  @Override
  public void addTodo(Todo todo) {
    if (todo!= null)
    repository.save(todo);
  }

  @Override
  public List<Todo> getTodos() {
    return new ArrayList(repository.findAll());
  }

  public List<Todo> findTodosContaining(String text) {
    return new ArrayList(repository.findTodosByTitleContaining(text));

  }

  public Todo findTodo(long id) {
    return repository.findById(id);
  }

}
