package com.Lesson9;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
       
//        int temp = 0;
//        Scanner stdin = new Scanner(System.in);
//        System.out.print("Enter a digit: ");
//        temp = (int)stdin.nextInt();
//
//        if (temp > 30) {
//            System.out.println("it's a hot day \nDrink plenty of water");
//        }
//        else if (temp > 20)
//            System.out.println("it's a nice day");
//        else{
//            System.out.println("It's cold");
//        }

        // Code reformation for clean coding
        //From:
//        double income = 12_000.45;
//        boolean isHighIncome;
//
//        if (income > 100_000)
//            isHighIncome = true;
//        else
//            isHighIncome = false;
//
//        System.out.println(isHighIncome);


        double income = 120_000;
        boolean isHighIncome = income > 100_000;
        System.out.println(isHighIncome);

    }

}
