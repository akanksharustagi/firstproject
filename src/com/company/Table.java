package com.company;

public class EvenArray2 {
    public static void main(String[] args) {
        int[] even = {3, 2, 8, 1, 4, 7, 6};
        int count = 0;
        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 == 0) count++;
        }
        System.out.println(" there are " + count + "even numbers in array");
}}