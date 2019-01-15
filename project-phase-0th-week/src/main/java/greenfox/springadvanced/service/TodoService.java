package greenfox.springadvanced.service;

import greenfox.springadvanced.model.Todo;

import java.util.List;

public interface TodoService {
  void addTodo(Todo todo);

  List<Todo> getTodos();
}
