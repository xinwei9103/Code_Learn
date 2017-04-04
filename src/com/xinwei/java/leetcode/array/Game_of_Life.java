package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/5/17.
 */
/*

According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state.

Follow up:
Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */

/*
    思路:
 */

public class Game_of_Life {

    public void gameOfLife(int[][] board) {

        if(board.length==0){
            return;
        }
        boolean[][] changed = new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int num = getLiveNum(board,changed,i,j);
                if(board[i][j]==1){
                    if(num<2||num>3){
                        board[i][j]=0;
                        changed[i][j]=true;
                    }
                }else{
                    if(num==3){
                        board[i][j]=1;
                        changed[i][j]=true;
                    }
                }
            }
        }


    }

    private int getLiveNum(int[][] board, boolean[][] changed, int i, int j){
        int sum=0;
        for(int r = i-1;r<=i+1;r++) {
            for (int k = j - 1; k <= j + 1; k++) {
                if(r==i&&k==j){
                    continue;
                }
                sum+=getOrDefault(board,r,k,getOrDefault(changed,r,k));
            }
        }
        return sum;
    }

    private int getOrDefault(int[][] board,int i, int j,boolean changed){
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return 0;
        }
        if(changed){
            if(board[i][j]==0){
                return 1;
            }
            return 0;
        }
        return board[i][j];
    }

    private boolean getOrDefault(boolean[][] changed, int i, int j){
        if(i<0||j<0||i>=changed.length||j>=changed[0].length){
            return false;
        }
        return changed[i][j];
    }

    public static void main(String[] args) {

        int[][] test = new int[][]{{1,1},{1,0}};

        new Game_of_Life().gameOfLife(test);

    }

}
