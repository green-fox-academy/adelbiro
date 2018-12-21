package greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Post {

  @Id
  @GeneratedValue
  private int id;
  private String title;
  private String postBody;
  private LocalDateTime dateOfPost;

  public Post() {}

  public Post(String title) {
    this.title = title;
  }

  public Post(String title, String postBody) {
    this.title = title;
    this.postBody = postBody;
  }

  public Post(String title, String postBody, LocalDateTime dateOfPost) {
    this.title = title;
    this.postBody = postBody;
    this.dateOfPost = dateOfPost;
  }
}
