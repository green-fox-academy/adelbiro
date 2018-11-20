package gardenapplication;

public class Tree extends Plant{
  public Tree(String color) {
    this.color = color;
    hydrationLevel = 0;
    absorbCapacity = 0.4;
  }

  public boolean isNeedWater() {
    if (hydrationLevel < 10) {
      return true;
    } else {
      return false;
    }
  }
}
