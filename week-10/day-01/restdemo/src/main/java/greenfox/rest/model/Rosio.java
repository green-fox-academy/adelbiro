package greenfox.rest.model;

public class Rosio {
  private String what;
  private int[] numbers;
  private Object result;

  public Rosio(){}

  public Rosio(String what, int[] numbers){
    this.what = what;
    this.numbers = numbers;
  }

  public void calculateSum() {
    int tempResult = 0;
    for (int i = 0; i < numbers.length; i++) {
      tempResult += numbers[i];
    }
    this.result = tempResult;
  }

  public void calculateMultiplication() {
    int tempResult = 0;
  }

  public void calculateDouble() {
    int[] tempResult = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {

    }
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
