import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number,
  // than it should write to a file.
  // The path parameter should be a string, that describes the location of the file.
  // The word parameter should be a string, that will be written to the file as lines
  // The number paramter should describe how many lines the file should have.
  // So if the word is "apple" and the number is 5, than it should write 5 lines
  // to the file and each line should be "apple"
  // The function should not raise any error if it could not write the file.
  public static void main(String[] args) {
    writeApple("src/apples.txt", "apple", 5);
  }

  public static void writeApple(String path, String word, int line) {
    Path filePath = Paths.get(path);
    List<String> arrayToCopy = new ArrayList<>();
    for (int i = 0; i < line; i++) {
      arrayToCopy.add(i, word);
    }
    try {
      Files.write(filePath, arrayToCopy);
    } catch (Exception e) {
    }
  }
}
