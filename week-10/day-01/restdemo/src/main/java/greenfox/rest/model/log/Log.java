package greenfox.rest.model.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue
  long id;

  Date createdAt;
  String endpoint;
  String data;

  public Log() {
    this.createdAt = new Date();
  }

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
    this.createdAt = new Date();
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
