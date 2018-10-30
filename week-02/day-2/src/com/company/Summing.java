package com.company;

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
public class Summing {
    public static int sum(int parameter){
        int result = 0;
        for (int i = 0; i < parameter; i++ ){
            result = result + i;
        }
        return result;
    }
    public static void main(String[] args){
        int number =8;
        System.out.println(sum(number));
    }
}
