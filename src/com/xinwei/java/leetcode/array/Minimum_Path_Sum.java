package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/15/17.
 */

/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 */

/*
思路: 和Unique_Paths 一样 dp
 */
public class Minimum_Path_Sum {

    public int minPathSum(int[][] grid) {

        if(grid.length==0) return 0;

        for(int i=1;i<grid[0].length;i++){
            grid[0][i]+=grid[0][i-1];
        }

        for(int i=1;i<grid.length;i++){
            grid[i][0]+=grid[i-1][0];
        }

        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[i].length;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

}
