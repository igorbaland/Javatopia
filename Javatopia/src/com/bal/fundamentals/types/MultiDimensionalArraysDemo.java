package com.bal.fundamentals.types;

import java.util.Arrays;

public class MultiDimensionalArraysDemo {

    public void demo() {
        //2 rows and 3 3 columns
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        System.out.println(Arrays.deepToString(numbers));

//        int[][][] numbers = new int [2][3][5];
//        numbers[0][0][0] = 1;
//        //deepToString printing for multiDimenArray
//        System.out.println(Arrays.deepToString(numbers));
    }
}
