package com.company;

public class Student {
    public static final String SCHOOLNAME="SCHOOL";
    private int id;
    private String name;
    private int grade;
    private String teacherName;

    public Student(){
        System.out.println("constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public Student (int id, String name, int grade, String teacherName){
        this.id= id;
        this.name= name;
        this.grade= grade;
        this.teacherName= teacherName;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTeacherName() {
        return teacherName;
    }
// Static
    public static void printSchool(){
        System.out.println(SCHOOLNAME);

    }

    public int getGrade() {
        return grade;
    }
    // instance
    public void Greet(){
        System.out.println( "GoodMorning");

    }
    public String getName(){
        return name;
    }
}
