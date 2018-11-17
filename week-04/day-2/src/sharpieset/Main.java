package sharpieset;

import sharpie.Sharpie;

public class Main {
  public static void main(String[] args) {
    SharpieSet mySharpieSet = new SharpieSet();
    Sharpie blueSharpie = new Sharpie("blue", 20);
    Sharpie pinkSharpie = new Sharpie("pink", 20);
    Sharpie orangeSharpie = new Sharpie("orange", 20);

    mySharpieSet.listOfSharpies.add(blueSharpie);
    mySharpieSet.listOfSharpies.add(pinkSharpie);
    mySharpieSet.listOfSharpies.add(orangeSharpie);

    System.out.println("You have " + mySharpieSet.countUsable()  + " usable sharpies at the moment");

    orangeSharpie.use(100);
    System.out.println("You have " + mySharpieSet.countUsable()  + " usable sharpies at the moment");

    blueSharpie.use(100);
    System.out.println("You have " + mySharpieSet.countUsable()  + " usable sharpies at the moment");

    System.out.println(mySharpieSet.listOfSharpies.size());
    mySharpieSet.removeTrash();
    System.out.println(mySharpieSet.listOfSharpies.size());
  }
}
