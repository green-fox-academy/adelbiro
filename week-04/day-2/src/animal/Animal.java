package animal;

public class Animal {
    public int hunger = 50;
    int thirst = 50;

    public Animal() {
        this(50, 50);
    }
    public Animal(int hunger, int thirst) {
      this.hunger = hunger;
      this.thirst = thirst;
    }
    public void eat() {
        hunger--;
    }
    public void drink() {
        thirst--;
    }
    public void play() {
        hunger++;
        thirst++;
    }

}
