package aircraftscarrier;

public class F16 extends Aircraft {
  public boolean queuePriority;
  public F16() {
    maxAmmo = 8;
    queuePriority = true;
    baseDmg = 50;
    currentAmmo = 0;
  }
}
