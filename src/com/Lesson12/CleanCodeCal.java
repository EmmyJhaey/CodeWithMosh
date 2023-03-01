package com.Lesson12;

import java.text.NumberFormat;
import java.util.Scanner;

public class CleanCodeCal {
    public static void main(String[] args) {
        /**
         * @Final Variable for Months_In_A_Year
         * Principal
         * Period(Divided Multiply by the 12 => as the Months in a year) = N
         * Annual Interest ( Divided by the 12 => as the Months in a year) = R
         */

        System.out.println("Welcome to Our Mortgage Calculator");

        //     Principal Input
        int principal = (int) readValue("Enter Principal", 1000, 1_000_000);
        System.out.println("=======================");

//        monthlyInterest Input
        double monthlyInterest = readValue("Enter MonthlyInterest: ", 0 , 30);
        System.out.println("=======================");

//        period Inputs
        byte period = (byte)readValue("Enter Period(Years): ", 1, 30);
        System.out.println("=======================");


//        Mortgage Calculation
       double mortgage = calMortgage(principal, monthlyInterest, period);

//        Formatting Result
        String finalResult = formatResult(mortgage);

        //Printing Result
        System.out.println("Mortgage: " + finalResult);
    }

    public static double readValue(String prompt, int min, int max ){
        Scanner input = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            System.out.println("Enter a numbr between " + min + " and " + max);
             value = input.nextDouble();
            if (value >= min && value <= max)
                break;
        }
        return value;
    }

    public static double calMortgage(int principal, double monthlyInterest,  byte period){
        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENT = 100;

        //        Calculation for Annual Interest :
        double annualInterest = monthlyInterest / MONTHS_IN_A_YEAR / PERCENT;
        //  Calculation for Years
        int years = period * MONTHS_IN_A_YEAR;
        double mortgage = principal * ((annualInterest * Math.pow((1+annualInterest), years)) / (Math.pow((1 + annualInterest), years) - 1));
        return mortgage;
    }

    public static String formatResult(double mortgage){
        String formatedResult = NumberFormat.getCurrencyInstance().format(mortgage);
        return formatedResult;
    }
}
