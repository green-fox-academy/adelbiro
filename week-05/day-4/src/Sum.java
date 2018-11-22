import java.util.ArrayList;
import java.util.List;

public class Sum {

  public int sumElements(ArrayList<Integer> listToSum) {
    int sum = 0;
    for (int i = 0; i < listToSum.size(); i++) {
      sum += listToSum.get(i);
    }
    return sum;
  }
}
