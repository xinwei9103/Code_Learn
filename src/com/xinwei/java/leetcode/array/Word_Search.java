package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/1/17.
 */

/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */

/*
    思路:递归 可以不需要boolean[][] check 可以将board[][]设为'1'
 */
public class Word_Search {

    public boolean exist(char[][] board, String word) {
        if(board.length==0){
            return false;
        }

        boolean[][] check = new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board,check,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board,boolean[][] check, int i, int j, String word, int index){
        if(index>=word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return false;
        }
        if(board[i][j]==word.charAt(index)&&!check[i][j]){
            check[i][j]=true;
            boolean result = helper(board,check,i-1,j,word,index+1)||
                    helper(board,check,i+1,j,word,index+1)||
                    helper(board,check,i,j-1,word,index+1)||
                    helper(board,check,i,j+1,word,index+1);
            check[i][j]=false;
            return result;
        }
        return false;
    }



}
