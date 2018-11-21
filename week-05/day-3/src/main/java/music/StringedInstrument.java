package main.java.music;

public class StringedInstrument extends Instrument {
  int numberOfStrings;
  String sound;

  public String sound() {
    return sound;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings
        + "-stringed instrument that goes " + sound());
  }
}
