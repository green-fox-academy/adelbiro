package com.company;
// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public class DoubleItems {
    public static void doubleValues(int[] input) {
        int tempo[] = new int[input.length];
        for (int i = 0; i < input.length ; i++ ) {
            tempo[i] = input[i] * 2;
            System.out.println(tempo[i]);
        }

    }
    public static void main(String[] args) {
        int[] numList = {3,4,5,6,7,6,4,9};
        doubleValues(numList);

 //       System.out.println(doubleValues(numList));
    }
}
