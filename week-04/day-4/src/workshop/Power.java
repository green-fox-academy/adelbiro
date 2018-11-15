package workshop;

public class Power {
  public static void main(String[] args) {
    System.out.println(powerUp(2,2));
  }
  public static int powerUp(int base, int power) {
    if (power > 0) {
        return base * powerUp(base, power-1);
    }
    return 1;
  }
}

