package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = "";
    for (int i = string.length() - 1; i > 0 ; i--) {
      this.string += string.charAt(i);
    }
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }


}
