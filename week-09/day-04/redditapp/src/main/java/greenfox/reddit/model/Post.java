package greenfox.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private int id;
  private String title;
  private String postBody;
  private LocalDateTime dateOfPost;
  private int scores;

  public Post() {
  }

  public Post(String title) {
    this.title = title;
    this.scores = 0;
  }

  public Post(String title, String postBody) {
    this.title = title;
    this.postBody = postBody;
    this.scores = 0;
  }

  public Post(String title, String postBody, LocalDateTime dateOfPost) {
    this.title = title;
    this.postBody = postBody;
    this.dateOfPost = dateOfPost;
    this.scores = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPostBody() {
    return postBody;
  }

  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }

  public LocalDateTime getDateOfPost() {
    return dateOfPost;
  }

  public void setDateOfPost(LocalDateTime dateOfPost) {
    this.dateOfPost = dateOfPost;
  }

  public int getScores() {
    return scores;
  }

  public void setScores(int scores) {
    this.scores = scores;
  }
}
