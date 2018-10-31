package com.company;

import java.util.Arrays;

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class SwapElements {
    public static void swapFunction(String[] input) {
        String temp = input[0];
        input[0] = input[2];
        input[2] = temp;
        System.out.println(Arrays.toString(input));

    }
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        swapFunction(abc);

    }
}

// ezt jó lenne valami kevésbé favágó modszerrel is megcsinálni
