package workshop;

public class Counter {
  public static void main(String[] args) {
    counter(10);
  }

  public static void counter(int limit) {
    if (limit > 0) {
      System.out.println(limit);
      counter(limit - 1);
    }
  }
}
