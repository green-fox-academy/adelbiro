package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
  }

  public Violin(int strings) {
    this();
    numberOfStrings = strings;
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
