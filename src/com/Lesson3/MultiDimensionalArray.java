package com.Lesson3;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        String place  [] [] = new String[4] [2];
        place[0][0] = "State";
        place[0][1] = "Capital";
        place[1][0] = "Lagos";
        place[1][1] = "Ikeja";
        place[2][0] = "Kogi";
        place[2][1] = "Lokoja";
        place[3][0] = "Kwara";
        place[3][1] = "Ilorin";

        System.out.println(Arrays.deepToString(place));

//        printTabularForm(place);
    }

//    public static void printTabularForm(String[][] places){
//        for (int i = 0; i < places.length; i++) {
//            System.out.println(Arrays.deepToString(places.));
//        }
//    }



}
