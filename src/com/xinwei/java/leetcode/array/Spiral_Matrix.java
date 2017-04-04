package com.xinwei.java.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 2/28/17.
 */

/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 */

/*
    思路 回字形走
 */
public class Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new LinkedList<>();
        if(matrix.length==0){
            return res;
        }
        int istart = 0;
        int iend = matrix.length-1;
        int jstart = 0;
        int jend = matrix[0].length-1;
        int count =0;

        while(istart<=iend&&jstart<=jend){
            int type = count%4;
            if(type==0){
                for(int i =jstart;i<=jend;i++){
                    res.add(matrix[istart][i]);
                }
                istart++;
            }else if(type==1){
                for(int i = istart;i<=iend;i++){
                    res.add(matrix[i][jend]);
                }
                jend--;
            }else if(type ==2 ){
                for(int i = jend;i>=jstart;i--){
                    res.add(matrix[iend][i]);
                }
                iend--;
            }else{
                for(int i = iend;i>=istart;i--){
                    res.add(matrix[i][jstart]);
                }
                jstart++;
            }
            count++;
        }

        return res;
    }

}
