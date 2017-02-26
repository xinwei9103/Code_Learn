package com.xinwei.java.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinweiwang on 2/19/17.
 */

/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

 */

/*
    思路: 除第一位和末尾 等于前一个数组 当前位和前一位的和
 */
public class Pascals_Triangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1;i<=numRows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                if(j==1||j==i){
                    row.add(1);
                }else{
                    row.add(res.get(i-2).get(j-1)+res.get(i-2).get(j-2));
                }
            }
            res.add(row);
        }
        return res;
    }


}
