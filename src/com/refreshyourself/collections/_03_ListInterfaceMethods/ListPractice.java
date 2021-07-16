package com.refreshyourself.collections._03_ListInterfaceMethods;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        //Common List methods / on top of methods from Collection interface

        List<Double> list = new LinkedList<>(Arrays.asList(3d, 4d, 27d, 66d, 3d, 44d));
        System.out.println(list);//[3.0, 4.0, 27.0, 66.0, 3.0, 44.0]

        //accessing items using index
        System.out.println("list.get(0) = " + list.get(0));//list.get(0) = 3.0

        //adding items in certain index
        list.add(66d);
        System.out.println(list);//[3.0, 4.0, 27.0, 66.0, 3.0, 44.0, 66.0]
        list.add(6, 67d);
        System.out.println(list);//[3.0, 4.0, 27.0, 66.0, 3.0, 44.0, 67.0, 66.0]

        //updating items in certain index
        //list.set(0,99.0);
        //System.out.println(list);//[99.0, 4.0, 27.0, 66.0, 3.0, 44.0, 67.0, 66.0]

        //getting indexes of certain items
        System.out.println("list.indexOf(27.0) = " + list.indexOf(27.0));//list.indexOf(27.0) = 2

        System.out.println("list.lastIndexOf(3.0) = " + list.lastIndexOf(3.0));//list.lastIndexOf(3.0) = 4
        System.out.println("list.lastIndexOf(100) = " + list.lastIndexOf(100));//list.lastIndexOf(100) = -1

        //remove(Object)
        //remove(index)
        list.remove(1);
        System.out.println(list);//[3.0, 27.0, 66.0, 3.0, 44.0, 67.0, 66.0]

        //addAll at certain index
        list.addAll(2, Arrays.asList(89d, 99d));
        System.out.println(list);//[3.0, 27.0, 89.0, 99.0, 66.0, 3.0, 44.0, 67.0, 66.0]

        //replaceAll(Function)
        System.out.println("Replace each item with new value increased by 5 : ");
        list.replaceAll(each -> each + 5);
        System.out.println(list);//[8.0, 32.0, 94.0, 104.0, 71.0, 8.0, 49.0, 72.0, 71.0]

        //sort
        list.sort(null);//[8.0, 8.0, 32.0, 49.0, 71.0, 71.0, 72.0, 94.0, 104.0]
        //list.sort(Comparator.naturalOrder());//[8.0, 8.0, 32.0, 49.0, 71.0, 71.0, 72.0, 94.0, 104.0]
        //list.sort(Comparator.reverseOrder());//[104.0, 94.0, 72.0, 71.0, 71.0, 49.0, 32.0, 8.0, 8.0]
        System.out.println("sorted with list.sort(null) = " + list);

        //getting view out of list object
        //view is part of your original list object
        //subList(from,to)
        System.out.println("List view from index 3 till before 7 \n" + "lst.subList(3,7) : " + list.subList(3, 7));//lst.subList(3,7) : [49.0, 71.0, 71.0, 72.0]

        List<Double> partOfListView = list.subList(2, 5);
        System.out.println(partOfListView);//[32.0, 49.0, 71.0]
        partOfListView.set(0,199.99);
        System.out.println(partOfListView);//[199.99, 49.0, 71.0]
        System.out.println(list);//[8.0, 8.0, 199.99, 49.0, 71.0, 71.0, 72.0, 94.0, 104.0] it's chanced also from list because linked with each other

        System.out.println("---------------");

        //list iterator
        ListIterator<Double> lstIter = list.listIterator();

        System.out.println("lstIter.hasNext() = " + lstIter.hasNext());//lstIter.hasNext() = true
        //System.out.println("lstIter.nextIndex() = " + lstIter.nextIndex());//lstIter.nextIndex() = 0

        while (lstIter.hasNext()){
            System.out.print("lstIter.nextIndex() = " + lstIter.nextIndex());
            Double item = lstIter.next();
            System.out.println("| item = " + item);

            if(item<10){
                lstIter.remove();
            }
        }
        System.out.println(list);//[199.99, 49.0, 71.0, 71.0, 72.0, 94.0, 104.0]
        System.out.println("lstIter.hasNext() = " + lstIter.hasNext());//lstIter.hasNext() = false
        System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());//lstIter.previousIndex() = 6
        //System.out.println("lstIter.previous() = " + lstIter.previous());//lstIter.previous() = 104.0

        while (lstIter.hasPrevious()){

            System.out.print("lstIter.previousIndex() = " + lstIter.previousIndex());
            Double item = lstIter.previous();
            System.out.println("| item = " + item);
            
            if(item<60){
//                lstIter.remove();
//                lstIter.set(200d);
                lstIter.add(10000d);
            }
        }
        System.out.println(list);

    }
}
