package com.company;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println( " please enter Marks m1");
        int m1 = sc.nextInt();
        System.out.println( "please enter Marks m2");
        int m2 = sc.nextInt();
        System.out.println( "please enter Marks m3");
        int m3 = sc.nextInt();
        System.out.println( "please enter Marks m4");
        int m4 = sc.nextInt();
        System.out.println( "please print Marks m5");
        int m5 = sc.nextInt();
        printGrades(m1,m2,m3,m4,m5);
    }

    public static void printGrades( int m1, int m2 , int m3, int m4, int m5) {
       int total = m1+m2+m3+m4+m5;
       float percentage = (total *100)/500;
        System.out.println( "your marks" + percentage + "%");
        if ( percentage > 80){
            System.out.println( "Grade A");
        }
        else if ( percentage >70 && percentage <80){
            System.out.println( "Grade B");
        }
        else if ( percentage > 60 && percentage <70){
            System.out.println( "Grade C");
        }
        else if (percentage < 60){
            System.out.println( "Grade D");
        }
    }
}
