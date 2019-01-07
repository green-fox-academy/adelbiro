package greenfox.rest.model;

public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "Please provide an input!";
  }

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
