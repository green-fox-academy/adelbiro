package com.company;
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 42;
        double heightInM = 1.62;

        // Print the Body mass index (BMI) based on these values
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println(bmi);
    }
}