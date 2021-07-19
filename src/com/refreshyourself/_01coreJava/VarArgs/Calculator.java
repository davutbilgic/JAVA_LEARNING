package com.refreshyourself._01coreJava.VarArgs;

import java.util.Arrays;

public class Calculator {

    public void printAllArrayNumbers(int[] numbers){

        for(int number:numbers){
            System.out.print(number + " ");
        }
        System.out.println();

    }

    public void printAllNumbers(int... numbers){

        for(int number:numbers){
            System.out.print(number + " ");
        }
        System.out.println();

    }

    public void printAll(Object... objects){

        for(int i=0;i<objects.length;i++){

            System.out.print(objects[i]);
            if(i!=(objects.length-1)){
                System.out.print(" - ");
            }

        }
        System.out.println();

    }

}
