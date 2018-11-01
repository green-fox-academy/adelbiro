package com.company;

import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

public class GuessTheNumber {
    public static void main(String[] args) {
        int numberToFigureOut = 3;

        Scanner guessTheNumber = new Scanner(System.in);
        System.out.println("Guess the number!");
        int guessedNum = guessTheNumber.nextInt();
        boolean succes;
        String foundIt = "You found the number: " + numberToFigureOut;

        if (guessedNum == numberToFigureOut) {
            succes = true;
            System.out.println(foundIt);
        } else {
            succes = false;
        }
        while (succes == false) {
            if (guessedNum == numberToFigureOut) {
                succes = true;
                System.out.println(foundIt);
                break;
            }
            else if (guessedNum < numberToFigureOut) {
                System.out.println("The stored number is higher.");
            }
            else if (guessedNum > numberToFigureOut){
                System.out.println("The stored number is lower.");
            }
            guessTheNumber = new Scanner(System.in);
            System.out.println("Guess again!");
            guessedNum = guessTheNumber.nextInt();


        }
        }

    }


