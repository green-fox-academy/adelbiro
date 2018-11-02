package com.company;
import java.util.Arrays;
import java.util.Scanner;

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
public class Colors {
    public static void main(String[] args) {
        String[] colors1 = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] colors2 = {"orange red", "red", "tomato"};
        String[] colors3 = {"orchid", "violet", "pink", "hot pink"};
        String[][] colors = {{Arrays.toString(colors1)}, {Arrays.toString(colors2)},  {Arrays.toString(colors3)}};
        System.out.println(Arrays.deepToString(colors));

    }
}

