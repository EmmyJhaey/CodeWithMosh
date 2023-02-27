package com.Lesson4;
import java.lang.Math;
public class SamplingMathClass {

    public static void main(String[] args) {
        //ceil, random(default 0 to 1), floor, max.... ...
        double result = Math.random() * 100;
        System.out.println((int)result);

        int digit = 2;
        System.out.println((int)Math.pow(digit, 2));
    }

}
