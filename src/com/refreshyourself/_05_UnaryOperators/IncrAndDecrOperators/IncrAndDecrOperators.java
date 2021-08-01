package com.refreshyourself._05_UnaryOperators.IncrAndDecrOperators;

public class IncrAndDecrOperators {
    public static void main(String[] args) {

        int apples = 0;
        System.out.println(apples);//0
        System.out.println(++apples);//1
        System.out.println(apples);//1
        System.out.println(apples++);//1
        System.out.println(apples);//2
        apples--;
        System.out.println(apples);//1
        System.out.println(--apples);//0

        int pears = 3;
            //          4  *   5 /  4      +       2 => 7
        int basket = ++pears * 5 / pears-- + --pears;//7
        System.out.println(basket);//7
        System.out.println(pears);//2


    }
}
