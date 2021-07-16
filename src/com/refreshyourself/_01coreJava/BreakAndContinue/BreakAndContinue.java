package com.refreshyourself._01coreJava.BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {


        //break Statement
        for(int i=0;i<10;i++){

            if(i==5){
                break;
            }
            System.out.println("Numbers " + i);
        }

        //continue Statement
        for(int i=0;i<10;i++){

            if(i%2 != 0){
                continue;
            }
            System.out.println("Numbers " + i);
        }
    }
}
