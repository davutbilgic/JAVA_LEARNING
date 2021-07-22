package com.refreshyourself._01coreJava.MethodOverloading;

public class Student {
    String name;
    String school;
    int age;

    //Constructors
    public Student(){

    }

    public Student(String name, String school){

    }

    public Student(String name, String school, int age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }


    //methods
    public void study(){

    }

    public void study(String topic){

    }

    public void study(String topic, int hour, String school){

    }
}
