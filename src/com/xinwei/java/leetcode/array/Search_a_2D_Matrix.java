package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 4/3/17.
 */
/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */
public class Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0||matrix[0].length==0){
            return false;
        }

        int[] firstRow = new int[matrix.length];
        int[] lastRow = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            firstRow[i] = matrix[i][0];
        }
        for(int i=0;i<matrix.length;i++){
            lastRow[i] = matrix[i][matrix[i].length-1];
        }
        int start = binarySearch(firstRow,target);
        int end = binarySearch(lastRow,target);
        if(end==-1||lastRow[end]<target){
            end++;
        }
        //System.out.println(start);
        //System.out.println(end);
        if(start!=end){
            return false;
        }else{
            return target==(matrix[start][binarySearch(matrix[start],target)]);
        }

    }

    /*
        总会返回和target相等或者比target小的值 如果都比target大 则返回 -1
     */
    public int binarySearch(int[] nums, int target){
        return binarySearch(nums,0,nums.length-1,target);
    }

    private int binarySearch(int[] nums, int left, int right, int target){
        //System.out.println(left+" "+ right);

        if(left>right){
            //System.out.println(left);
            return right;
        }
        int mid = left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return binarySearch(nums,left,mid-1,target);
        }else{
            return binarySearch(nums,mid+1,right,target);
        }
    }


    public static void main(String[] args) {

        System.out.println(new Search_a_2D_Matrix().binarySearch(new int[]{0,3,6,8,10},10));

    }

}
