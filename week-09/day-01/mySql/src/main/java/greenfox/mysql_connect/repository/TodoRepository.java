package greenfox.mysql_connect.repository;

import greenfox.mysql_connect.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  Todo findById(long id);
  List<Todo> findByDone(boolean isDone);
  List<Todo> findAllByTitleContaining (String searchString);
  List<Todo> findByAssignee(String assignee);
  List<Todo> findByTitleOrAssignee(String title, String assignee);
}
