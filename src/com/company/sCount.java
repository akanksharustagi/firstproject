package com.company;

public class sCount {
    public static void main(String[] args) {
        String s1= "Java programming is better than Python";
        String s2= "CPP is almost similar";
// Length
        int s1L = s1.length();
        System.out.println( "num of characters in s1 is " + s1L);

        int s2L = s2.length();
        System.out.println( " num of characters in s2 is " + s2L);
// Replace
        String sR = s1.replace("Java", "C++");
        System.out.println( " String before replacement  is - " + s1);
        System.out.println(" new string is " + sR);

        //Concat
        String sC = s2.concat(" and fun");
        System.out.println( s2);
        System.out.println( sC);


    }

}
