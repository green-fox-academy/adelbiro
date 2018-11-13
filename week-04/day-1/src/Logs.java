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
            getUniqueIP(listToArray(logsList));
        } catch (IOException e) {
        }
    }
    public static String[] listToArray(List<String> list) {
        String[] listAsArray = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listAsArray[i] = list.get(i);
        }
        return listAsArray;
    }
    public static void getUniqueIP(String[] arrayToCheck) {
        int ipIndex = (arrayToCheck[0].indexOf("   ")) + 3;
        int ipEnd = ipIndex + 11;
        String[] ip = new String[arrayToCheck.length];
        for (int i = 0; i < arrayToCheck.length; i++) {
            ip[i] = arrayToCheck[i].substring(ipIndex, ipEnd);
        }
            }
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
