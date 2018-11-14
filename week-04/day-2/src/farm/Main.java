package farm;

import animal.Animal;

public class Main {
  public static void main(String[] args) {
    Farm myFarm = new Farm(3);
    Animal cow = new Animal();
    Animal ducky = new Animal(100, 0);
    myFarm.breed(cow);
    myFarm.animalsList.add(ducky);

    System.out.println(myFarm.animalsList.size());
    myFarm.slaughter();
    System.out.println(myFarm.animalsList.size());
  }
}

