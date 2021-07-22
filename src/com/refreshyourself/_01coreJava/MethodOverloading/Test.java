package com.refreshyourself._01coreJava.MethodOverloading;

public class Test {
    public static void main(String[] args) {


        //Calling overloaded methods
        Student s1 = new Student();
        s1.study();
        s1.study("Java");
        s1.study("Java", 4, "CyberTek");


        //Static method overloading Example calling
        DataArtist.draw(4);
        DataArtist.draw(3.4d);

    }
}
