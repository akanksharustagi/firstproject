package com.company;

import java.util.Scanner;

public class OopsJava {


    public static void main(String[] args) {


        Employee emp1 = new Employee();
        System.out.println(emp1.getId());
        System.out.println(emp1.getAddress());

        // parameterized cons
        Employee emp2 = new Employee(222, "abd", "delhi");
        Employee emp3 = new Employee(333, "cat", "kota");
        System.out.println(emp2.getId());
        System.out.println( emp3.getName());
        // multiple objects in same employee blueprint

    }


        }


