package com.refreshyourself.TernaryConditionalStatement;

public class Test {
    public static void main(String[] args) {

        int max;
        int n1 = 9;
        int n2 = 7;
        
        max = (n1 > n2) ? ++n1: n2-(--n1);

        System.out.println(max);
        System.out.println(n1);

    }
    
    public static int calc(int n1, int n2){

        return n1*n2;
    }
}

