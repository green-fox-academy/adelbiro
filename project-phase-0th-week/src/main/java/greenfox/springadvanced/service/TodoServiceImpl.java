package greenfox.springadvanced.service;

import greenfox.springadvanced.model.Todo;
import greenfox.springadvanced.model.TodoDTO;
import greenfox.springadvanced.repository.TodoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  ModelMapper modelMapper = new ModelMapper();

  @Autowired
  TodoRepository repository;


  //maybe I should take todoDTO-s?
  @Override
  public void addTodo(Todo todo) {
    if (todo!= null)
    repository.save(todo);
  }

  @Override
  public List<Todo> getTodos() {
    return new ArrayList(repository.findAll());
  }

  @Override
  public List<Todo> findTodosContaining(String text) {
    return new ArrayList(repository.findTodosByTitleContaining(text));
  }

  //is this it? should there be more?
  public TodoDTO findTodo(long id) {
    return convertEntityToDTO(repository.findById(id));
  }

  public TodoDTO convertEntityToDTO(Todo source) {
    TodoDTO destination = new TodoDTO();
    modelMapper.map(source, destination);
    System.out.println(destination.getId());
    System.out.println(destination.getTitle());
    return destination;
  }

}
