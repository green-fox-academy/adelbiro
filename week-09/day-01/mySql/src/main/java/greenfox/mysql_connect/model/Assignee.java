package greenfox.mysql_connect.model;

import javax.persistence.*;

@Entity
public class Assignee {

  @Id
  @GeneratedValue
  int assignee_id;
  String name;
  String email;

  Assignee () {}

  Assignee (String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
