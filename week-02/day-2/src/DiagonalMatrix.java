package com.company;
import java.util.Arrays;
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {
    public static void main(String[] args) {

        //ezt kéne looppal eklészíteni
       int[][] twoDimArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
       for(int[] rows : twoDimArray) {
           for(int column: rows) {
               System.out.print(column + " ");
           }
           System.out.println(" ");
       }

/*
        System.out.println(twoDimArray[0][0]);
        System.out.println(twoDimArray[0][0]);
        System.out.println(twoDimArray[0][0]);
        System.out.println(twoDimArray[0][0]);
        // az elso szam az y, a masodik az x tengelyen levo poziciot adja meg.*/


    }
}
