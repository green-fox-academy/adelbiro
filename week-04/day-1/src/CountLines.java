import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CountLines {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void countTheLines(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            System.out.println(Files.lines(filePath).count());
        } catch (Exception e){
            System.out.println("0");
        }
    }
    public static void main(String[] args) {
        countTheLines("src/my-file.txt");
    }
}
