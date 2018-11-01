package com.company;

import java.util.Scanner;

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
public class AverageOfInput {
    public static void main(String[] args) {

        int sum = 0;
        double  avg = 0;
        //getting the 5 numbers
        for (int i = 1; i <6 ; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your numbers");
            int temp = scan.nextInt();
            sum =sum + temp;
            avg = (sum / (i));
        }
        System.out.println("Sum is: " + sum + " Average is: " + avg);
    }


}
