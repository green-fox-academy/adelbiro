package main.java.music;

public class BassGuitar extends StringedInstrument{
  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
    sound = "Duum-duum-duum";
  }
  public BassGuitar(int strings) {
    name = "Bass Guitar";
    this.numberOfStrings = strings;
    sound = "Duum-duum-duum";
  }

}
