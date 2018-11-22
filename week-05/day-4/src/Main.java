import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Sum osszead = new Sum();

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);

    // this is overly complicated without a reason, should check Anagram class
    Anagram anagram = new Anagram("apple", "pplae");
    System.out.println(anagram.isAnagram("apple", "pplae"));
  }
}
