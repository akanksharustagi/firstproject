package com.company;

public class sumMultiples {
    public static void main(String[] args) {
      int a =3;
        int l = 10;
        int b = 5;
        int sum = 0;
        for(int i=0;i<=l;i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
            System.out.println( sum);
        }}}
