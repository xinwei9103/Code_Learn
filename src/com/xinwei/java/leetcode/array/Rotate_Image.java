package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/21/17.
 */

/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 */

/*
    思路: 先上下翻转 在对称翻转
 */
public class Rotate_Image {

    public void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            for (int j =0;j<matrix[i].length;j++){
                swap(i,j,matrix.length-1-i,j,matrix);
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                swap(i,j,j,i,matrix);
            }
        }

    }

    private void swap(int i,int j,int x,int y,int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }

}
