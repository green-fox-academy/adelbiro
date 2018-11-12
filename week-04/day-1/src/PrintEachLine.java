import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintEachLine {
    public static void main(String[] args) {
        Path pathToMyFile = Paths.get("src/my-file.txt");
        try {
            System.out.println(Files.readAllLines(pathToMyFile));
        } catch (Exception e) {
            System.out.println("Unable to read file: " + pathToMyFile);
        }
    }
}
