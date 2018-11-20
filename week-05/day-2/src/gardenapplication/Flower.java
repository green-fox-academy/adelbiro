package gardenapplication;

public class Flower extends Plant{
  public Flower(String color) {
    this.color = color;
    hydrationLevel = 0;
    absorbCapacity = 0.75;
  }

  public boolean isNeedWater() {
    if (hydrationLevel < 5) {
      return true;
    } else {
      return false;
    }
  }
}
