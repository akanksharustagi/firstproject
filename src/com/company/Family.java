package com.company;
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    public Person(){
        System.out.println( "non parameterized constructor");
    }
    public Person(String firstName, String lastName, String address , int age){
        System.out.println("parametereized constructor");
        this.firstName= firstName;
        this.lastName= lastName;
        this.address= address;
        this.age= age;
    }
    public String getfullName() {
        return firstName + " " + lastName;
    }
    public void changeAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}