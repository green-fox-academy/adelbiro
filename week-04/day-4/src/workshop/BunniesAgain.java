package workshop;

public class BunniesAgain {

  public static void main(String[] args) {
    countTheEars(6);
  }

  public static int countTheEars(int indexOfLastBunny) {
    int numberOfEars = 0;
    if (indexOfLastBunny > 0) {
      if (indexOfLastBunny % 2 == 0) {
        numberOfEars += 3;
        numberOfEars =  numberOfEars + countTheEars(indexOfLastBunny - 1);
      } else {
        numberOfEars += 2;
        numberOfEars =  numberOfEars + countTheEars(indexOfLastBunny - 1);
      }
      System.out.println("Ears in the line till this bunny: " + numberOfEars);
    }
    return numberOfEars;
  }

}
