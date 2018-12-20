package greenfox.mysql_connect.repository;

import greenfox.mysql_connect.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, String> {
}
