package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner converter = new Scanner(System.in);
        System.out.println("Enter the distance in KM:");
        int inKm = converter.nextInt();
        double inMile = (inKm * 0.621371192);
        System.out.println(inMile + " in miles");

    }
}
