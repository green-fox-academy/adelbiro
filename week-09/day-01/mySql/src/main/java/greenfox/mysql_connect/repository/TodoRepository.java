package greenfox.mysql_connect.repository;

import greenfox.mysql_connect.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  Iterable<Todo> findByDone(boolean isDone);
  Iterable<Todo> findAllByTitleContaining (String searchString);
  //Iterable<Todo> findByAssignee(String assignee);
  //Iterable<Todo> findByTitleOrAssignee(String title, String assignee);
}
