import java.util.ArrayList;
import java.util.*;

public class QuoteSwap{
    public static ArrayList<String> quoteSwap(ArrayList<String> input) {
        int firstReplacement = input.indexOf("do");
        int secondReplacement = input.indexOf("cannot");
        String  placeholder = input.get(firstReplacement);
        input.set(firstReplacement, input.get(secondReplacement));
        input.set(secondReplacement, placeholder);
        return input;
    }
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().
        System.out.println(Arrays.asList(quoteSwap(list)));
        // Also, print the sentence to the output with spaces in between.
        for (String elements: quoteSwap(list)) {
            System.out.print(elements + " ");
        }
        // Expected output: "What I cannot create I do not understand."

    }
}