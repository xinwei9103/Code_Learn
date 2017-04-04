package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/14/17.
 */

/*
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */

/*

思路: 先判断第一行 和 第一列 之后如果 [i][j]==0 则[i][0]=0 [0][j]=0 最后用循环置0
 */
public class Set_Matrix_Zeroes {

    public void setZeroes(int[][] matrix) {

        if(matrix.length==0){
            return;
        }

        boolean firstRow = false;
        boolean firstCol = false;

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstRow = true;
                break;
            }
        }

        for (int[] aMatrix : matrix) {
            if (aMatrix[0] == 0) {
                firstCol = true;
                break;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        if(firstCol) {
            for (int i = 0; i < matrix.length; i++) {
               matrix[i][0]=0;
            }
        }


    }

}
