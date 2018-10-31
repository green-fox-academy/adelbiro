package com.company;

import java.util.Arrays;

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
public class SumAllElements {
    public static int sumElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] ai = {3,4,5,6,7};
        System.out.println(sumElements(ai));



    }
}
/*
public static void sumElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int[] ai = {3,4,5,6,7};
        sumElements(ai);
 */