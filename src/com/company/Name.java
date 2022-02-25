package com.company;

public class Name {
    public static void main(String[] args) {

        String Fname = "Akanksha";
        String Lname = "Rustagi";
        String name = (Fname + " " + Lname + " is full name");
        System.out.println(name);

        printFullName("Akanksha", "Rustagi");
    }
    public static void printFullName( String firstname, String lastname){
        System.out.println (firstname + " "+ lastname);


    }
}
