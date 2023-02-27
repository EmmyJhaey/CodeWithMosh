package com.Lesson8;

import java.text.NumberFormat;
import java.util.Scanner;

public class AdvanceMortgageCal {
    public static void main(String[] args) {
        /**
         * @Final Variable for Months_In_A_Year
         * Principal
         * Period(Divided Multiply by the 12 => as the Months in a year) = N
         * Annual Interest ( Divided by the 12 => as the Months in a year) = R
         */

        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENT = 100;
        int principal;
        double monthInterest;
        int period;

        //initializing a Scanner for inputs
        Scanner stdin = new Scanner(System.in);
//     Principal Input
        System.out.println("Welcome to Our Mortgage Calculator");
        while (true){
            System.out.print("Enter Principal: ");
            System.out.println("Enter a numbr between 1,000 - 1,000,000");
            principal = stdin.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
        }
        //divider
        System.out.println("=======================");

//        monthlyInterest Input
        while(true){
            System.out.print("Enter Annual Interest Rate: ");
            System.out.println("Enter a number greater than  0 or equal to 30");
            monthInterest = stdin.nextDouble();
            if (monthInterest > 0 && monthInterest <=30)
                break;
        }
        //divider
        System.out.println("=======================");

//        period Inputs
        while(true){
            System.out.print("Enter Period(Years): ");
            System.out.println("Enter Value between 1 to 30");
            period = stdin.nextInt();
            if(period >= 1 && period <= 30)
                break;
        }
        //break
        System.out.println("=======================");

//        Calculation space :
//        Calculation for Annual Interest :
        double annualInterest = monthInterest / MONTHS_IN_A_YEAR / PERCENT;
        int years = period * MONTHS_IN_A_YEAR;

//        Mortgage Calculation
        double mortgage = principal * ((annualInterest * Math.pow((1+annualInterest), years)) / (Math.pow((1 + annualInterest), years) - 1));

//        Declaring result
        String formatedResult = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formatedResult);
    }
}
