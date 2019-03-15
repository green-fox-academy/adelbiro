package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> getAllTodos();

  List<Todo> getActive();

  void add(Todo item);

  void delete(long id);

  Todo findTodo(long id);

  List<Todo> search(String text);

  void markDone(long id);
}

