package com.refreshyourself._01coreJava.ArrayListClassBasics;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        //Creating an ArrayList object
        ArrayList<String> lst = new ArrayList<>();
        //List<String> lst1 = new ArrayList<>();

        //adding element
        lst.add("Apple"); lst.add("Orange"); lst.add("Banana");
        System.out.println(lst);

        //getting elements get(index)
        System.out.println("lst.get(0) = " + lst.get(0));
        System.out.println("lst.get(1) = " + lst.get(1));

        //check if items exists in the list contains(item)
        System.out.println(lst.contains("Apple"));//true
        System.out.println(lst.contains("Pear"));//false

        //getting the index of item by value indexOf(item)
        System.out.println("lst.indexOf(\"Apple\") = " + lst.indexOf("Apple"));

        //checking how many item in the list size()
        System.out.println("lst.size() = " + lst.size());

        //checking if the list is empty isEmpty()
        System.out.println("lst.isEmpty() = " + lst.isEmpty());

        //setting the value for  certain index
        lst.set(1, "Pear");
        System.out.println("new list items = " + lst);

        //removing item by index
        lst.remove(0);
        System.out.println("new list items after removing = " + lst);

        //removing item by value
        lst.remove("Banana");
        System.out.println("new list items after removing = " + lst);

        //removing all the items int list
        lst.clear();
        System.out.println("new list after clearing " + lst);

        //checking if the list is empty or not
        System.out.println("list is empty " + lst.isEmpty());


    }
}
















