package com.company;

import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me a number:");
        int input = scanner.nextInt();
        for (int i=0; i < input; i++) {
            System.out.print("%");
  //          for

        }

    //}
    
    

    }
}
