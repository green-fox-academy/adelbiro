import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

public class WriteSingleLine {
    public static void main(String[] args) {
        Path pathToFile = Paths.get("src/my-file.txt");
        try {
            List<String> myName = new ArrayList();
            myName.add("Adel Biro");
            Files.readAllLines(pathToFile);
            Files.write(pathToFile, myName);
        } catch(Exception e) {
            System.out.println("Unable to write file: "+ pathToFile);
        }
    }
}
