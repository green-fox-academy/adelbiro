package com.company;

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class PrintArguments {
    public static void  printParams (String ...strings) {
        for (int i = 0; i < strings.length; i++ ) {
            System.out.print(strings[i] + " ");
        }
    }
    public static void main(String[] args) {

        printParams("write out this", "and this,", "and also this,", "thanks");

    }
}
