package greenfox.thymeleaf_practice;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.isGood = true;
  }

  BankAccount(String name, int balance, String animalType, boolean isKing) {
    this(name, balance, animalType);
    this.isKing = isKing;
    this.isGood = true;
  }

  BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood) {
    this(name, balance, animalType);
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    if (name != null)
    return name;
    else return null;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    if (animalType!=null)
    return animalType;
    else return null;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String isKing() {
    if (isKing) return "He is the king";
    else return "not king";
  }

  public boolean isKingBoolean() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public String goodOrBad() {
    if (isGood) {
      return "Good guy";
    } else {
      return "Bad guy";
    }
  }
}

