package aircraftscarrier;

public class Aircraft {
  int maxAmmo;
  int baseDmg;
  int currentAmmo;
  boolean queuePriority;

  public Aircraft() {
  }

  public int fight(Aircraft aircraft) {
    int damage = currentAmmo * baseDmg;
    currentAmmo = 0;
    return damage;
  }

  public int refill(int refillAmount) {
    int remainingAmmo = refillAmount + currentAmmo - maxAmmo;
    currentAmmo = maxAmmo;
    return remainingAmmo;
  }

  public String getType(Aircraft aircraft) {
    return getClass().getSimpleName();
  }

  public String getStatus(Aircraft aircraft) {
    String statusAsString = " Type " + getClass().getSimpleName() + ", Ammo: " + currentAmmo + ", Base Damage " + baseDmg + ",  All Damage: ";
    return statusAsString;
  }

  public boolean isPriority(Aircraft aircraft) {
//    if (aircraft.getType(aircraft) == "F35") {
//      return true;
//    } else {
//      return false;
//    }
    return aircraft.queuePriority;

  }

}

