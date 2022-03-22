package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println(" enter number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int term =10;

        for ( int i =10 ; i>=1; i--) {
            int result = n * i;
            System.out.println(n + "*" + i + "=" + result);
        }

}}