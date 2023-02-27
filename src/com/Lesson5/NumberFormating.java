package com.Lesson5;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public class NumberFormating {

    public static void main(String[] args) {
        //factory Method ... Abstract class
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.68);

        String result = NumberFormat.getPercentInstance().format(0.89);
        System.out.println(result);
    }

}
