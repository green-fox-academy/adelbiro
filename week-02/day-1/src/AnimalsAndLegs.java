package com.company;
import java.util.Scanner;
// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner chickensNumber = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have?");
        int chickenNr = chickensNumber.nextInt();
        Scanner pigsNumber = new Scanner (System.in);
        System.out.println("How many pigs does the farmer have?");
        int pigNr = pigsNumber.nextInt();

        int allLegs = chickenNr * 2 + pigNr *4;
        System.out.println(allLegs);
    }
}
