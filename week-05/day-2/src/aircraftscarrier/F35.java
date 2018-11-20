package aircraftscarrier;

public class F35 extends Aircraft {
  boolean queuePriority;
  public F35() {
    maxAmmo = 12;
    queuePriority = true;
    baseDmg = 30;
    currentAmmo = 0;
  }
}
