package com.company;

import java.util.Scanner;

public class evenArray {
    public static void main(String[] args) {
        int [] arr = {3,2,8,1,4,7,6};
        int count =0;
        for ( int i=0; i< arr.length; i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        System.out.println("even numbers in array are " + count);
    }
    }
