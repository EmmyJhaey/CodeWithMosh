package com.Lesson10;

import java.util.Scanner;

public class ContinueAndBreak {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        String input;
        while(true){
                System.out.print("Input: ");
                input = stdin.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit")) {
                stdin.close();
                break;
            }
            //default
            System.out.println(input);
        }

    }

}
