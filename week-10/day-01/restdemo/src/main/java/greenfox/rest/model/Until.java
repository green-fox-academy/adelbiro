package greenfox.rest.model;

public class Until {
  private Integer until;
  private Integer result;

  public Until(Integer until) {
    this.until = until;
  }

  public Until(Integer until, Integer result) {
    this.until = until;
    this.result = result;
  }

  public Until() {
  }

  public Integer getUntil() {
    return until;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

}
