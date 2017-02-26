package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/22/17.
 */
/*
Given a 2D binary matrix filled with 0's and 1's,
find the largest rectangle containing only 1's and return its area.
*/
/*
思路: dp
 */
public class Maximal_Rectangle {

    public int maximalRectangle(char[][] matrix) {

        if(matrix.length==0){
            return 0;
        }

        int max = 0;

        int m = matrix.length;

        int n = matrix[0].length;

        int[][][] args = new int[m][n][2];

        if(matrix[0][0]=='1'){
            args[0][0][0] = 1;
            args[0][0][1] = 1;
            max=1;
        }
        for(int i =1;i<m;i++){
            if(matrix[i][0]=='1'){
                args[i][0][0] =1;
                args[i][0][1] = args[i-1][0][1]+1;
                max = Math.max(max,args[i][0][1]);
            }
        }

        for(int i=1;i<n;i++){
            if(matrix[0][i]=='1'){
                args[0][i][0] = args[0][i-1][0]+1;
                args[0][i][1] =1;
                max = Math.max(max,args[0][i][0]);
            }
        }

        for(int i =1;i<m;i++){
            for(int j =1;j<n;j++){
                if(matrix[i][j]=='1'){
                    args[i][j][0] = args[i][j-1][0]+1;
                    args[i][j][1] = args[i-1][j][1]+1;
                    int min = args[i][j][0];
                    for(int k =1; k<=args[i][j][1];k++){
                        min = Math.min(min,args[i-k+1][j][0]);
                        max = Math.max(min*k,max);
                    }
                }
            }
        }


        return max;
    }

}
