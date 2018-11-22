import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum;
  ArrayList<Integer> list;
  ArrayList<Integer> emptyList;
  ArrayList<Integer> oneElementList;
  ArrayList<Integer> nullList;

  @Before
  public void somethingHappensHere() {
    sum = new Sum();
    list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    emptyList = new ArrayList<>();
    oneElementList = new ArrayList<>();
    oneElementList.add(1);
    nullList = new ArrayList<>();
    nullList = null;
  }

  @Test
  public void sumTest() {
    assertEquals(9, sum.sumElements(list));
  }

  @Test
  public void emptyListTest() {
    assertEquals(0, sum.sumElements(emptyList));
  }

  @Test
  public void oneElementTest() {
    assertEquals(1, sum.sumElements(oneElementList));
  }

  @Test
  public void nullTest() {
  }
}
