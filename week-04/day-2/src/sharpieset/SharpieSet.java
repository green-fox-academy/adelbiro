package sharpieset;

import sharpie.Sharpie;

import java.lang.reflect.Array;
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
    ArrayList<Sharpie> sharpiesToRemove = new ArrayList<>();
    for (Sharpie sharpie: listOfSharpies) {
      if (sharpie.inkAmount == 0) {
        sharpiesToRemove.add(sharpie);
      }
    }
    listOfSharpies.removeAll(sharpiesToRemove);
  }
}
