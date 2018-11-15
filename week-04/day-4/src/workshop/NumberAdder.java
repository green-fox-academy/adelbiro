package workshop;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(3));
  }
  public static int numberAdder(int addTillThis) {
    int sum = 0;
    if (addTillThis > 0) {
      sum = addTillThis + (numberAdder(addTillThis-1));
    }
    return sum;
  }
}
