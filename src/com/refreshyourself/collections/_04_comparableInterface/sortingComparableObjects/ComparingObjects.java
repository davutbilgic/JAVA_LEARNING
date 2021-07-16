package com.refreshyourself.collections._04_comparableInterface.sortingComparableObjects;

import java.util.*;

public class ComparingObjects {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("John");
        list.add("Mary");
        list.add("Diana");

        System.out.println(list);//[Adam, John, Mary, Diana]
        Collections.sort(list);//[Adam, Diana, John, Mary]
        //Collections.sort(list,Comparator.reverseOrder());//[Mary, John, Diana, Adam]
        //Collections.sort(list, Comparator.naturalOrder());//[Adam, Diana, John, Mary]
        System.out.println(list);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John",20));
        //personList.add(new Person("John",10));
        personList.add(new Person("Adam",32));
        personList.add(new Person("Mary",10));

        System.out.println("personList = " + personList);//personList = [Person{name='John', age=20}, Person{name='Adam', age=32}, Person{name='Mary', age=10}]

        Collections.sort(personList);//if you want to compare Persons you have to implement Comparable interface in Person Class
        System.out.println(personList);//[Person{name='Adam', age=32}, Person{name='John', age=20}, Person{name='Mary', age=10}]


    }
}
