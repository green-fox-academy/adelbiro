import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
public class Logs {
    public static void main(String[] args) {
        Path path = Paths.get("logs.txt");
        try {
            List<String> logsList = Files.readAllLines(path);
            //    System.out.println(logsList);
            requestTypeRatio(logsList);
        } catch (IOException e) {

        }
    //    getIP(path);
    }
    //public static Array[] getIP(Path path) {
    //}
    public static void requestTypeRatio(List<String> inputArray) {
        int get = 0;
        int post = 0;
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i).contains("GET")) {
                get++;
            } else {
                post++;
            }
        }
        System.out.print("GET/POST request ratio is: " + get +":");
        System.out.print(post);
    }
}
