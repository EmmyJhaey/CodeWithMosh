package com.Lesson6;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = stdin.nextLine().trim();
        System.out.println("Your name is " +  name);
    }
}
