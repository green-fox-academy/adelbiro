import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void testAnagram() {
    String word1 = "apple";
    String word2 = "pplae";
    Anagram a = new Anagram(word1, word2);
    assertTrue(a.isAnagram(word1, word2));
    assertEquals(true, a.isAnagram(word1, word2));
  }


}
