import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter{
    public static List<String> appendA(List<String> inputList ) {

        for (int i = 0; i < inputList.size(); i++) {
            inputList.set(i, inputList.get(i) + 'a' );
        }
        return inputList;
    }

    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"