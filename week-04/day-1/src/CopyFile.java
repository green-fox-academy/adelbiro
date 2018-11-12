import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {
        copyFiles("list1.txt", "list2.txt");
    }
    public static void copyFiles(String copyThisFile, String toThisFile) {
        Path pathToCopyThis = Paths.get(copyThisFile);
        Path pathToThisFile = Paths.get(toThisFile);
        boolean success;
        try {
            List<String> tempList = Files.readAllLines(pathToCopyThis);
            Files.readAllLines(pathToThisFile);
            Files.write(pathToThisFile, tempList);
            success = true;
        } catch (Exception e) {
            success = false;
        }
        System.out.println(success);
    }
}
