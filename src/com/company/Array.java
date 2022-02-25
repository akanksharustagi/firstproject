package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        char ch[] = {'a', 'k', 'k', 'i'};
        printCharArr(ch);
        }
        public static void printCharArr(char[]ch)
        {
            System.out.println("print name stored in array:");
            for( int i =0; i<4; i++){

            System.out.println(ch[i]);
        }
    }}
//        int arr [][]=  new int [][]{
//            {5, 4, 3},
//            {4, 3, 5},
//            {1, 2, 3},
//            {2, 1, 3},
//            {1, 1, 1}
//        };
//        for (int j=0 ; j<3; j++){
//         float s =0;
//        float avg;
//         for (int i = 0;i<5 ; i++){
//             s = s + arr[i][j];
//
//         }
//         avg =s / arr.length;
//            System.out.println( "sum of column " +(j+1)+ " is " +s);
//            System.out.println( "average of column " +(j +1) + " is " +  avg);
//        }

    // }}