package greenfox.h2project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean urgent;
  boolean done;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
