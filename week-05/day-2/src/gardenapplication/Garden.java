package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plantsInMyGarden;

  public Garden(List<Plant> plantsInMyGarden) {
    this.plantsInMyGarden = plantsInMyGarden;
  }
  public Garden() {
    plantsInMyGarden = new ArrayList<>();
  }

  public void gardenStatus() {
    for (Plant plants:plantsInMyGarden) {
      if (plants.isNeedWater() == false) {
        System.out.println("The " + plants.color + " doesn't need water");
      } else {
        System.out.println("The " + plants.color + " needs water");
      }
    }
  }
  public void water(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    double counter = 0;
    for (Plant plant : plantsInMyGarden) {
      if (plant.isNeedWater()) {
        counter++;
      }
    }
    double waterForAPlant = 1;
    if (counter > 1){
        waterForAPlant = waterAmount/counter;
    }

    for (Plant plant : plantsInMyGarden) {
      if (plant.isNeedWater() == true) {
        plant.hydrationLevel += plant.absorbCapacity * waterForAPlant;
      }
    }
    for (Plant plant : plantsInMyGarden) {
      if (plant.isNeedWater() == false) {
        System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() +" doesn't need water");
      } else {
        System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " needs water");
      }
    }
  }

}
