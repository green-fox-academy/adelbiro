package com.company;
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`
public class PrintElements {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,7};
        for (int element : numbers) {
            System.out.println(element);
        }

    }
}
