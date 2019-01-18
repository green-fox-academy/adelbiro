package greenfox.springadvanced.service;

import greenfox.springadvanced.model.Todo;
import greenfox.springadvanced.repository.TodoRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TodoServiceImplTest {

  @InjectMocks
  TodoServiceImpl service;

  @Mock
  TodoRepository repository;

  List<Todo> test;
  Todo demoTodo;


  @Before
  public void setupTestCases() {
    test = new ArrayList<>();
    test.add(new Todo("test1"));
    test.add(new Todo("test2"));

    demoTodo = new Todo("test");
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testGetTodos() {
    when(repository.findAll()).thenReturn(test);
    assertEquals(test, service.getTodos());
    verify(repository);
  }


  @Test
  public void testFindTodo() {
    when(repository.findById(anyLong())).thenReturn(demoTodo);
    assertEquals(demoTodo, demoTodo);
  }
}
