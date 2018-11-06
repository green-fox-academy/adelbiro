import java.util.ArrayList;
import java.util.Arrays;
public class Matchmaking {
    public static ArrayList makingMatches(ArrayList<String> list1, ArrayList<String> list2) {
        int smallerList = list1.size();
        if (list2.size() < list1.size()) {
            smallerList = list2.size();
        }
        ArrayList<String> mergedList = new ArrayList<>();
        for (int i = 0; i < smallerList; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }
        return mergedList;
    }
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
}
