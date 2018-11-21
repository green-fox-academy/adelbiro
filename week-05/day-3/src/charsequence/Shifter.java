package charsequence;

public class Shifter implements CharSequence {
  String shifted;
  int num;

  public Shifter(String string, int num) {
    shifted = string;
    this.num = num;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return shifted.charAt(index + num);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
