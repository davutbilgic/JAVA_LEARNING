package com.refreshyourself.studyBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(33, 44, 55, 66, 77, 88, 99));

        Iterator<Integer> myCollectionIterator = collection.iterator();

        System.out.println(myCollectionIterator.hasNext());

        System.out.println("======================");

        try {
            while (myCollectionIterator.hasNext()) {
                Integer each = myCollectionIterator.next();
                if (each < 50) {
                    myCollectionIterator.remove();
                    System.out.println("Number " + each + " is removed from collection.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Remaining numbers of collection: " + collection);

        System.out.println("======================");

    }
}
