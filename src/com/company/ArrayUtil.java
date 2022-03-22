package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil{
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        System.out.println( "array of num is " + Arrays.toString(num));


    }
 public static int findElementatIndex(int index, int[]num){
    if (index >=num.length) {return -1;}
    return num[index];
    }
}
