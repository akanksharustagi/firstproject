  package com.company;

  import java.awt.*;
  import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {



        int a =10;
        // default constructor
        Employee emp1 = new Employee();
        System.out.println(emp1.getId());
        System.out.println(emp1.getAddress());

        // parameterized cons
     Employee emp2 = new Employee(222,"abd", "delhi");
        Employee emp3 = new Employee(333, "cat", "kota");
        System.out.println(emp2);
        System.out.println( emp3);
        System.out.println( "result");
        // multiple objects in same employee blueprint



        Scanner sc = new Scanner (System.in);
    }
}