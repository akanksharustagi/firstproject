package com.company;

import java.util.Arrays;

public class Family {
    private String fathername;
    private String motherName;
    private String daughterName;
    private String sonName;
    private int fatherSalary;
    private int motherSalary;
    private int sonFee;
    private int daugherFee;
    private int Grocery = 500;
    public Family() {
        System.out.println("non parameterized constructor");
    }
    public Family(String fathername, String motherName, String daughterName, String sonName, int fatherSalary, int motherSalary, int sonFee, int daugherFee) {
        System.out.println("parametereized constructor");
        this.fathername = fathername;
        this.motherName = motherName;
        this.daughterName = daughterName;
        this.sonName = sonName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.daugherFee = daugherFee;
        this.sonFee = sonFee;
    }



    public void getfamilyNames() {

        System.out.println(" father's name is " + this.fathername);
        System.out.println(" mother's name is " + this.motherName);
        System.out.println(" daughter's name is " + this.daughterName);
        System.out.println("son's name is " + this.sonName);
    }
    public int gettotalFee() {
        return daugherFee + sonFee;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setFatherSalary(int fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public void setMotherSalary(int motherSalary) {
        this.motherSalary = motherSalary;
    }

    public void setSonFee(int sonFee) {
        this.sonFee = sonFee;
    }

    public void setDaugherFee(int daugherFee) {
        this.daugherFee = daugherFee;
    }

    public void setGrocery(int grocery) {
        Grocery = grocery;
    }

    public int gettotalSalary() {
        return fatherSalary + motherSalary;
    }
    public int Savings() {
        return (gettotalSalary()- gettotalFee() - Grocery);
    }
    public void checkSavings() {
         int netSaving = Savings();
        if (netSaving > 1000) {
            System.out.println("Congrats! " + fathername + " you saved this much " + Savings());
        }
        else {
            System.out.println(  " Dear " + fathername + "!!" + " Please save more" );
        }
    }
}