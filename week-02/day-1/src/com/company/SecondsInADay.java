package com.company;

public class SecondsInADay {
        public static void main(String[] args) {
        int currentHours = 21;
        int currentMinutes = 49;
        int currentSeconds = 00;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int allSecs = (60 * 60 * 24);
        int currentSecsPassed = ((currentHours * 60 * 60) + (currentMinutes * 60) + (currentSeconds * 60));
        int remainingSecs = (allSecs - currentSecsPassed);
        System.out.println(remainingSecs);

    }
}
