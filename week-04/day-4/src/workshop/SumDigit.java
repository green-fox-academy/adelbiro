package workshop;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigits(11111));
  }

  public static int sumDigits(int number) {
    int sum = 0;
    int mod = number%10;
    if (mod > 0) {
      sum = sum + mod + sumDigits(number/10);
    }
  return sum;
  }
}
