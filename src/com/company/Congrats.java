package com.company;

import java.util.Scanner;

public class Congrats {
    public static void main(String[] args) {

        System.out.println( "Enter number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printCongratulations(number);
    }

    public static void printCongratulations( int num) {
       if ( num >1 && num <100){
            System.out.println( "Congratulations");
        }
       else {
            System.out.println("Sorry");
        }
} }
