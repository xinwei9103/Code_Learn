package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/15/17.
 */
/*
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:

[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */

public class Spiral_Matrix_II {

    public int[][] generateMatrix(int n) {
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int[][] res =new int[n][n];

        int step =1;
        int action = 0;
        while(colStart<=colEnd&&rowStart<=rowEnd) {
            if(action%4==0) {
                for (int i = colStart; i <= colEnd; i++, step++) {
                    res[rowStart][i] = step;
                }
                rowStart++;
            }else if(action%4==1) {
                for (int i = rowStart; i <= rowEnd; i++, step++) {
                    res[i][colEnd] = step;
                }
                colEnd--;
            }else if(action%4==2) {
                for (int i = colEnd; i >= colStart; i--, step++) {
                    res[rowEnd][i] = step;
                }
                rowEnd--;
            }else {
                for (int i = rowEnd; i >= rowStart; i--, step++) {
                    res[i][colStart] = step;
                }
                colStart++;
            }
            action++;
        }
        return res;
    }

}
