package com.Lesson9;

public class Ternary {
    public static void main(String[] args) {
        double income = 120_000.998;
        String className = income > 100_000 ? "First Class" :  "Economy Class";

        System.out.println(className);
    }
}
