package workshop;

public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEars(5));
  }
  public static int bunnyEars(int numberOfBunnies) {
    if (numberOfBunnies > 0) {
      return 2 + bunnyEars(numberOfBunnies - 1);
    }
    return 0;
  }
}
