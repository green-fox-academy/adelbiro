package greenfox.mysql_connect.model;

import javax.persistence.*;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  boolean urgent;
  boolean done;
  String description;
  String content;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "assignee_id")
  public Assignee assignee;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
    this.assignee =  new Assignee("undefined", "email@ex");
  }

  public Todo(String title, boolean isUrgent) {
    this.title = title;
    this.urgent = isUrgent;
    this.done = false;


  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.urgent = isUrgent;
    this.done = isDone;
  }

  public Todo() {}

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}
