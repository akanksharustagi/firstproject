package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AssignString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter String");
        String s = sc.next();
        System.out.println( "index i");
        int i = sc.nextInt();
        System.out.println( "index j");
        int j = sc.nextInt();
        swapIndex(s, i,j);

    }
    public static void swapIndex(String s, int i, int j) {
        char[] swap = s.toCharArray();
        System.out.println("String before swap " + Arrays.toString(swap));

        char x;
        x = swap [i];
        swap [i]= swap [j];
        swap [j] = x;

        System.out.println( " String after swap " + Arrays.toString(swap));
    }
}
