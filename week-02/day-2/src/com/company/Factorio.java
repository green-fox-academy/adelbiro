package com.company;

public class Factorio {
    public static int factorio(int input) {
        int factorial = 0;
        for (int i = 1; i < input; i++) {
           factorial = input * i;
        }
       return factorial;
    }
    public static void main(String[] args) {
        int number = 3;
        System.out.println(factorio(number));

    }
}
