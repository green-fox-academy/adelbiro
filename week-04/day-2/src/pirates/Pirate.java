package pirates;

public class Pirate {
  int intoxicationLevel;
  boolean isAlive = true;
  boolean isPassedOut = false;
  int drinkRumCounter;
  Parrot parrot;

  public Pirate() {
    this(0,0);
  }
  public Pirate(int intoxicationLevel, int drinkRumCounter) {
    this.intoxicationLevel = intoxicationLevel;
    this.drinkRumCounter = drinkRumCounter;
  }
  public void drinkSomeRum() {
    if (isAlive) {
      intoxicationLevel = intoxicationLevel+10;
      drinkRumCounter++;
    } else {
      deathReport();
    }
  }
  public void howsItGoingMate() {
    if(isAlive) {
      if (drinkRumCounter <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        isPassedOut = true;
      }
    } else {
      deathReport();
    }
  }
  public void die() {
    isAlive = false;
  }
  public void deathReport() {
    System.out.println("he's dead");
  }
  public void brawl(Pirate pirate1, Pirate pirate2) {
    if (pirate2.isAlive = true) {
      brawlResult();
      if (brawlResult() == 0) {
        pirate1.isAlive = false;
      } else if (brawlResult() == 1) {
        pirate2.isAlive = false;
      } else {
        pirate1.isPassedOut = true;
        pirate2.isPassedOut = true;
      }
    } else {
      deathReport();
    }
  }

  public int brawlResult () {
    int i = (int)(Math.random() * 3);
    return i;
  }
}
