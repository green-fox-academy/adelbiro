package com.company;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int semesterLength = 17;
        int dailyHours = 6;
        int workdays = 5;
        int allHoursSpentCoding = (semesterLength * dailyHours * workdays) ;
        System.out.println(allHoursSpentCoding);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double weeklyCodingHour = 52.00;
        double week = (24.00 * 7.00);
        double allSemester = 17.00;
        double codingPercentage = ((allSemester * weeklyCodingHour) / (allSemester * week )* 100);
        System.out.println(codingPercentage);

    }
}
