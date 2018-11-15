package workshop;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(10));
  }
  public static int numberAdder(int addTillThis) {
    if (addTillThis > 0) {
      return addTillThis + (numberAdder(addTillThis-1));
    }
    return 0;
  }
}
