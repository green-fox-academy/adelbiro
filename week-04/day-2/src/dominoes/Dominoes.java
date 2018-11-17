package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);
    System.out.println(orderDominoes(dominoes));
  }

  public static List<Domino> orderDominoes(List<Domino> originalList) {
    List<Domino> orderedList = new ArrayList<>();
    orderedList.add(originalList.get(0));

    for (int i = 0; i < originalList.size(); i++) {
      for (int j = 0; j < originalList.size() - 1; j++) {
        if (orderedList.get(i).getRightSide() == originalList.get(j + 1).getLeftSide()) {
          orderedList.add(originalList.get(j + 1));
        }
      }
    }
    return orderedList;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
