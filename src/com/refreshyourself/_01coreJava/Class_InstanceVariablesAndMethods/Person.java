package com.refreshyourself._01coreJava.Class_InstanceVariablesAndMethods;

public class Person {
    //instance variables
    String name;
    int age;
    char gender;
    String job;

    //Constructor
    public Person(String name, int age, char gender, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    //methods without arguments and return types
    public void run(){
        System.out.println(name + " is running.");
    }

    public void swim(){
        System.out.println(name + " is biking.");
    }

    public void bike(){
        System.out.println(name + " is swimming.");
    }

    //method with arguments
    public void runMiles(int mileCount){
        System.out.println(name + " is running " + mileCount + " mile.");
    }

    //method with return value
    public int burnCalorie(){
        return 10;
    }

    //method with argument and return type
    public int burnCalorieWithMile(int mileCount){
        System.out.println(name + " is running " + mileCount + " mile.");
        return mileCount*10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                '}';
    }
}
