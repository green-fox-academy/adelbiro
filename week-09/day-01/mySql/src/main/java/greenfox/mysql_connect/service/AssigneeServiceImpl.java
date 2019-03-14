package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Assignee;
import greenfox.mysql_connect.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  private AssigneeRepository repository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository repo) {
    this.repository = repo;
  }

  public List<Assignee> getAllAssignees() {
    List<Assignee> listOf = new ArrayList<>();
    repository.findAll().forEach(listOf::add);
    return listOf;
  }

  public void addAssignee(Assignee assignee) {
    repository.save(assignee);
  }

  @Override
  public void editAssignee(Assignee assignee) {
    if (repository.existsById(assignee.getAssigneeId()))
    repository.save(assignee);
  }

  @Override
  public Assignee findAssignee(long id) {
    return repository.findById(id).get();
  }

  @Override
  public void delete(long id) {
    repository.delete(findAssignee(id));
  }
}
