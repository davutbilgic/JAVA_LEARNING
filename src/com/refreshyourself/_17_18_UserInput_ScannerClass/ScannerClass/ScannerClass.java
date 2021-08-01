package com.refreshyourself._17_18_UserInput_ScannerClass.ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Hoe oud ben je? ");
        int age = input.nextInt();

        System.out.println(age + "... That's quite old!");
    }
}
