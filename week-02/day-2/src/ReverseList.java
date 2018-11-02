package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
public class ReverseList {
    public static void reverseOrder(int[] inputArray){

        int reversed[] = new int[inputArray.length];
       // inputArray[inputArray.length-1] = reversed[0];
        for (int i = inputArray.length -1; i >=  0; i--) {
            reversed[i] = inputArray[inputArray.length -1 -i] ;

            //    System.out.println((inputArray[i]));
        }
        System.out.println(Arrays.toString(reversed));

    }
    //public static void printMyList(int[] inputList){
      //  System.out.println(inputList);
    //}
    public static void main(String[] args) {
        int[] aj = {3,4,5,6,7};
        reverseOrder(aj);
      //  printMyList(reverseOrder(aj);
    }
}


// le kéne tisztázni?