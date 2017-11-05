package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 4/17/17.
 */

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 */

/*
    思路: 将走过的1都变0 dfs
 */
public class Number_of_Islands {

    public int numIslands(char[][] grid) {

        if(grid.length==0){
            return 0;
        }
        int count =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(i,j,grid);
                }
            }
        }
        return count;
    }

    private void helper(int i, int j, char[][] grid){
        if(i>=grid.length||j>=grid[0].length||i<0||j<0) return;

        if(grid[i][j]=='1'){
            grid[i][j]='0';
            helper(i,j+1,grid);
            helper(i+1,j,grid);
            helper(i-1,j,grid);
            helper(i,j-1,grid);
        }
    }

}
