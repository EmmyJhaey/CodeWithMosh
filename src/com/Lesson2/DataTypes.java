package com.Lesson2;

import java.util.Date;

public class DataTypes {

    public static void main(String[] args) {

//        Example of primitive data type
        byte age = 30;
        long viewsCount = 23_8892_38928_93829L;
        float price = 10.34F;
        char letter = 'A'; //note that char is surrounding with a single quote
        boolean isEligible = false; //or can be true


        //Reference Types
        Date now = new Date();
        System.out.println(now);

    }

}
