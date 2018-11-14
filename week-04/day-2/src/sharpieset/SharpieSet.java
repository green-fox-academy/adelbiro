package sharpieset;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> listOfSharpies = new ArrayList<>();

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie: listOfSharpies){
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }
  public void removeTrash() {
    for (Sharpie sharpie: listOfSharpies) {
      if (sharpie.inkAmount == 0) {
        listOfSharpies.remove(sharpie);
      } break;
    }
  }
}
