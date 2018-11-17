import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogsTwoPointZero {

  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses.
  // Write a function that returns the GET / POST request ratio.

  public static void main(String[] args) {
    Path path = Paths.get("logs.txt");
    List<String> logsList = new ArrayList<>();

    try {
      logsList = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("some error happened, couldn't read file");
    }

    List<String> uniqueIPList = uniqueIPs(logsList);
    System.out.println("Items in the original log list: " + logsList.size());
    System.out.println("Items in the IP list: " + uniqueIPList.size());

    requestTypeRatio(logsList);

  }

  public static List<String> uniqueIPs(List<String> list) {
    List<String> ipList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      String[] ip = list.get(i).split("   ");
      if (!ipList.contains(ip[1])) {
        ipList.add(ip[1]);
      }
    }
    return ipList;
  }

  public static void requestTypeRatio(List<String> list ) {
    List<String> requestType = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      String[] getPosts = list.get(i).split("   ");
      requestType.add(getPosts[2]);
    }

    int getCounter = 0;
    int postCounter = 0;
    for (String lines: requestType) {
      if (lines.contains("GET")) {
        getCounter++;
      } else {
        postCounter++;
      }
    }

    System.out.println("GET/POST request type ratio is: " + getCounter + ":" + postCounter);
  }

}
