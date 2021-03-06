package comparable;

public class Domino implements Comparable<Domino> {

  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public int compareTo(Domino o) {
    if (this.getLeftSide() != o.getLeftSide()) {
      if (this.getLeftSide() > o.getLeftSide()) {
        return 1;
      } else {
        return -1;
      }
    } else {
      if (this.getRightSide() > o.getRightSide()) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";

  }
}
