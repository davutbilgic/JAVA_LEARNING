package com.refreshyourself._01coreJava.Loops;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        int[] ints = {1,43,34,34,52,76,67,83,96};
        for(int item:ints){
            if(item%2 == 0)
                System.out.println("even number : " + item);
        }

        String[] strs = {"aaa", "bb", "cafd"};
        for(String letters:strs){
            if(letters.contains("b")){
                System.out.println("found b getting out");
                break;
            }
            System.out.print(letters + " ");
        }

        for(int i=0; i < strs.length;i++){
            String letters = strs[i];
            System.out.println(letters);
        }

        for(int i=0;i<strs.length;i++){
            strs[i] = "item" + i;
            System.out.println("new value " + i + " " + strs[i]);
        }

        for(String item:strs){//You can not change actual value of strs with foreach loop!!!!!!!!
            item ="aaa";
            System.out.println(item);//aaa
        }
        System.out.println(Arrays.toString(strs));//[item0, item1, item2]
    }
}
