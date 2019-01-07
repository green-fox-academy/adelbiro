package greenfox.rest.model;

public class Doubled {
  private Integer received;
  private Integer result;


  public Doubled(Integer numberToDouble) {
    this.received = numberToDouble;
    this.result = numberToDouble * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public Integer getResult() {
    return result;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }
}
