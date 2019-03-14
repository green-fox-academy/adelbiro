package greenfox.mysql_connect.service;

import greenfox.mysql_connect.model.Assignee;

import java.util.List;

public interface AssigneeService {
  List<Assignee> getAllAssignees();

  void addAssignee(Assignee assignee);

  void editAssignee(Assignee assignee);
}

