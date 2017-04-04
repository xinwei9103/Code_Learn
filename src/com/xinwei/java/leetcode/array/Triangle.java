package com.xinwei.java.leetcode.array;

import java.util.List;

/**
 * Created by xinweiwang on 3/14/17.
 */

/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/

/*
    思路: 从下往上dp 当前值等于下一行临值得最小值+当前值 可以使用一个一维数组来存储
 */

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        if(triangle.isEmpty()){
            return 0;
        }

        for(int i =triangle.size()-2;i>=0;i--){
            List<Integer> current = triangle.get(i);
            List<Integer> next = triangle.get(i+1);
            for(int j=0;j<current.size();j++){
                int c = current.remove(j);
                current.add(j,Math.min(next.get(j),next.get(j+1))+c);
            }
        }

        return triangle.get(0).get(0);
    }

}
