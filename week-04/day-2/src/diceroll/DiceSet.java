package diceroll;
import java.util.Arrays;

public class DiceSet {
// You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        System.out.println("This is the first set of results: ");
        for (int items : diceSet.getCurrent()) {
            System.out.print(items);
        }
        int counter = 0;
        for (int i = 0; i < diceSet.dices.length; i++) {
            while (diceSet.dices[i] != 6) {
                diceSet.reroll(i);
                counter++;
            }
        }
        System.out.println( "\n" + "And this is 6 roll 6 times: ");
        for (int items : diceSet.getCurrent()) {
            System.out.print(items);
        }
        System.out.println("\n" + counter);
        /*
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();*/
    }
}
