package com.refreshyourself._35_Encapsulation.EncapsulationAndAccessModifiers;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Jhon",25);

        p1.setAge(27);
        p1.setName("Adam");
        System.out.println(p1.getName() +" " + p1.getAge());
    }
}
