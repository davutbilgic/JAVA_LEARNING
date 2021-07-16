package com.refreshyourself.collections._02_iteratorInterface;

import java.util.*;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 66, 544, 31));

        System.out.println(collection);//[3, 4, 5, 2, 66, 544, 31]

        Iterator<Integer> myIter = collection.iterator();

        //hasNext() --> if the collection has item, it return true otherwise return false.
        System.out.println(myIter.hasNext());

        //next()
//        System.out.println(myIter.next());//3
//        System.out.println(myIter.next());//4
//        System.out.println(myIter.next());//5
//        System.out.println(myIter.next());//2

        //remove()
//        myIter.remove();// it will be remove 2 Because the cursor is there.
//        //myIter.remove();// if you type that again you get IllegalStateException exception. Because the cursor can not know which item removed.
//        System.out.println(collection);//[3, 4, 5, 66, 544, 31]
        while (myIter.hasNext()) {
            Integer each = myIter.next();
            System.out.print(each);

            //ben ekledim
            if (myIter.hasNext() == true) {
                System.out.print("-");
            }
            //

            if (each > 10) {
                myIter.remove();
            }
        }
        System.out.println("\n"+collection);//[3, 4, 5, 2]

//eger biz bunu foreach loop ile denersek
//        for (Integer integer : collection) {
//            System.out.println(integer);
////            if(integer>10){//here is give ConcurrentModificationException error. we can not use it in foreach loop.
////                collection.remove(integer);
////            }
//        }
    }
}
