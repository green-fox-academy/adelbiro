public class Anagram {
  String word1;
  String word2;
  public Anagram(String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
  }

  public boolean isAnagram(String word1, String word2) {

    boolean isAnagram = false;
    if (word1 != null && word2 != null && word1.length() == word2.length()) {
      char[] arr = word1.toCharArray();
      StringBuilder temp = new StringBuilder(word2);
      for (char ch : arr) {
        int index = temp.indexOf("" + ch);
        if (index != -1) {
          temp.deleteCharAt(index);
        }
      }
      isAnagram = temp.toString().isEmpty();
    }
    return isAnagram;
  }
}
