package com.company;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        System.out.println( "please enter the number1");
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        System.out.println( "please enter number2");
        int b = sc.nextInt();
        System.out.println( "please enter number3");
        int c = sc.nextInt();
        printEqualNumbers(a,b,c);
    }

    public static void printEqualNumbers( int a, int b, int c) {
        if( (a == b) && (b==c)){
            System.out.println( "all numbers are equal");
        }
        else {
            System.out.println("sorry");
} } }
