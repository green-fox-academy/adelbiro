package farm;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  int freeSlots;
  List<Animal> animalsList = new ArrayList<>();

  public Farm() {
    this(0);
  }
  public Farm(int freeSlots) {
    this.freeSlots = freeSlots;
  }

  public void breed(Animal animal) {
    if (freeSlots > 0) {
      animalsList.add(animal = new Animal());
      freeSlots --;
    }
  }

  public void slaughter() {
    animalsList.remove(fullestAnimal());
    freeSlots ++;
  }

  public Animal fullestAnimal() {
    int lowestHunger = 100;
    Animal animalToSlaughter = new Animal();
    for (Animal animal: animalsList) {
      if (animal.hunger < lowestHunger) {
        lowestHunger = animal.hunger;
        animalToSlaughter = animal;
      }
    }
    return animalToSlaughter;
  }
}
