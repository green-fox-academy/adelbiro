package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Flower yellowFlower = new Flower("yellow");
    Flower blueFlower = new Flower("blue");
    Tree purpleTree = new Tree("purple");
    Tree orangeTree = new Tree("orange");

    List<Plant> myPlants = new ArrayList<>();
    myPlants.add(yellowFlower);
    myPlants.add(blueFlower);
    myPlants.add(purpleTree);
    myPlants.add(orangeTree);

    Garden myGarden = new Garden(myPlants);
    myGarden.gardenStatus();
    System.out.println();
    myGarden.water(40);
    System.out.println();
    myGarden.water(70);


  }
}
