package com.refreshyourself._10_11_Loops.NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        //a nested for loop
        for (int r = 0; r < 2; r++) {

            for (int k = 0; k < 3; k++) {

                System.out.print("|Row" + r + "-Column" + k + "| ");
            }

            System.out.println();
        }

        //Nested for each loop
        int[] rows = {1, 2, 3, 4};
        int[] cols = {1, 2, 3};
        for (int row : rows) {

            for (int col : cols) {
                System.out.print(" |Row" + row + "-Column" + col);
            }
            System.out.println();
        }

        // a nested while loop
        int i = 0;
        while (i < 5) {
            i++;
            int j = 0;
            while (j < 3) {
                j++;
                System.out.print(" |Row" + i + "-Column" + j);
            }
            System.out.println();
        }

        // a nested do while loop
        int i1 = 0;
        do {
            i1++;
            int j = 0;
            do {
                j++;
                System.out.print(" |Row" + i1 + "-Column" + j);
            } while (j < 3);
            System.out.println();
        } while (i1 < 5);

    }
}
//  a nested for loop
/*  |Row0-Column0||Row0-Column1||Row0-Column2|
    |Row1-Column0||Row1-Column1||Row1-Column2|
 */

// Nested for each loop
/*
 |Row1-Column1 |Row1-Column2 |Row1-Column3
 |Row2-Column1 |Row2-Column2 |Row2-Column3
 |Row3-Column1 |Row3-Column2 |Row3-Column3
 |Row4-Column1 |Row4-Column2 |Row4-Column3
 */

//a nested while loop
/*
 |Row1-Column1 |Row1-Column2 |Row1-Column3
 |Row2-Column1 |Row2-Column2 |Row2-Column3
 |Row3-Column1 |Row3-Column2 |Row3-Column3
 |Row4-Column1 |Row4-Column2 |Row4-Column3
 |Row5-Column1 |Row5-Column2 |Row5-Column3
 */

// a nested do while loop
/*
 |Row1-Column1 |Row1-Column2 |Row1-Column3
 |Row2-Column1 |Row2-Column2 |Row2-Column3
 |Row3-Column1 |Row3-Column2 |Row3-Column3
 |Row4-Column1 |Row4-Column2 |Row4-Column3
 |Row5-Column1 |Row5-Column2 |Row5-Column3
 */