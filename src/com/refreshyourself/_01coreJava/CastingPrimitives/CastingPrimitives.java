package com.refreshyourself._01coreJava.CastingPrimitives;

public class CastingPrimitives {
    public static void main(String[] args) {

        int i = (int) 3.9;
        System.out.println(i);

        //IMPLICIT CASTING
        //byte > short > int > long > float > double
        double d1 = 200;
        long l =i;
        System.out.println(i);
        System.out.println(d1);//200.0

        //EXPLICIT CASTING
        byte b1 = 5;
        short sh1 = 4;
        b1 = (byte) sh1;

        double price = 200.55;
        int iPrice = (int) price;
        System.out.println(iPrice);

        int int1 = (int) (5/2.0);

        System.out.println(int1);
        String str = "10";
        //int n1 = str; //error

    }
}
