package com.Lesson7;

import com.Lesson5.NumberFormating;
import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCal {

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
        System.out.print("Enter Principal: ");
        principal = stdin.nextInt();
        System.out.println("=======================");

//        monthlyInterest Input
        System.out.print("Enter Annual Interest Rate: ");
        monthInterest = stdin.nextDouble();
        System.out.println("=======================");

//        period Inputs
        System.out.print("Enter Period(Years): ");
        period = stdin.nextInt();
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
