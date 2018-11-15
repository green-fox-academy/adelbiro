package workshop;

public class BunniesAgain {

  public static void main(String[] args) {
    System.out.println("All ears in the line till this one: " + countTheEars( 6));
  }

  public static int countTheEars(int indexOfLastBunny) {
    int numberOfEars = 0;
    if (indexOfLastBunny > 0) {
      if (indexOfLastBunny % 2 == 0) {
        numberOfEars += 3;
        System.out.println("Ears of this bunny: " + numberOfEars);
      } else {
        numberOfEars += 2;
        System.out.println("Ears of this bunny: " + numberOfEars);
      }
      return numberOfEars+countTheEars(indexOfLastBunny-1);
    }
    return numberOfEars;
  }

}
