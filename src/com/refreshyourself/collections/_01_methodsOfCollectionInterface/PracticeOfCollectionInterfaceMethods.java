package com.refreshyourself.collections._01_methodsOfCollectionInterface;

import java.util.*;

public class PracticeOfCollectionInterfaceMethods {
    public static void main(String[] args) {

        //Common Collection interface methods
        Collection<Integer> collection = new ArrayList<>();

        //adding items-add() method
        collection.add(3);
        collection.add(30);
        collection.add(13);

        System.out.println(collection);//[3, 30, 13]
        System.out.println("collection.add(34) = " + collection.add(34));//collection.add(34) = true
        System.out.println(collection);//[3, 30, 13, 34]

        //adding multiple items in one shot-addAll() method
        collection.addAll(Arrays.asList(3,4,5,6,7,8));
        System.out.println(collection);//[3, 30, 13, 34, 3, 4, 5, 6, 7, 8]

        //getting size-size() method
        System.out.println("collection.size() = " + collection.size());//collection.size() = 10

        //checking empty or not-isEmpty() method
        System.out.println("collection.isEmpty() = " + collection.isEmpty());//collection.isEmpty() = false

        //remove item-remove() method
        collection.remove(30);
        System.out.println(collection);//[3, 13, 34, 3, 4, 5, 6, 7, 8]

        //contains item-contains() method
        System.out.println("collection.contains(13) = " + collection.contains(13));//collection.contains(13) = true

        //contains All item-containsAll() method
        System.out.println("collection.containsAll(Arrays.asList(34,5,8)) = " + collection.containsAll(Arrays.asList(34, 5, 8)));//collection.containsAll(Arrays.asList(34,5,8)) = true

        //remove all-removeAll() method
        collection.removeAll(Arrays.asList(34,5,8));
        System.out.println(collection);//[3, 13, 3, 4, 6, 7]

//        collection.removeAll(collection);
//        System.out.println(collection);//[]

        //retains all-retainAll() method
//        collection.retainAll(Arrays.asList(13,4));
//        System.out.println(collection);//[13, 4]

        //removeIf() method
        collection.removeIf(each -> each>10);
        System.out.println(collection);//[3, 3, 4, 6, 7]

        //turning into array
        Integer[] inArray = collection.toArray(new Integer[7]);
        System.out.println(Arrays.toString(inArray));//[3, 3, 4, 6, 7, null, null]

        Integer[] inArray2 = collection.toArray(new Integer[2]);
        System.out.println(Arrays.toString(inArray2));//[3, 3, 4, 6, 7]

    }
}
/* Other methods
    clear()=It removes the total number of elements from the collection.
    iterator()=It returns an iterator.
    parallelStream()=It returns a possibly parallel Stream with the collection as its source.
    stream()=It returns a sequential Stream with the collection as its source.
    spliterator()=It generates a Spliterator over the specified elements in the collection.
    equals()=It matches two collections.
    hashCode()=It returns the hash code number of the collection.

 */