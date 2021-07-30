package com.refreshyourself._01coreJava.EXERCISES.PrintNumbersInWord;

import java.lang.reflect.Array;

public class NumberInWord {

    public static void printNumberInWordWithArray(Long number) {

        String numberString = Long.toString(number);

        for (int i = 0; i < numberString.length(); i++) {

            switch (numberString.charAt(i)) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Others");
            }
        }


    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Others");
        }
    }
}
