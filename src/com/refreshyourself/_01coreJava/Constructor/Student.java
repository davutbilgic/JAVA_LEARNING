package com.refreshyourself._01coreJava.Constructor;

public class Student {
    String name;
    String school;
    int age;

    public Student(){
        System.out.println("no arg Constructor");

    }

    //constructor chaining
    public Student(String name, int age){
        this();
        System.out.println("2 arg Constructor");
    }

    //constructor chaining
    public Student(String name, int age, String school){
        this(name,age);
        System.out.println("3 arg Constructor");
    }
}
