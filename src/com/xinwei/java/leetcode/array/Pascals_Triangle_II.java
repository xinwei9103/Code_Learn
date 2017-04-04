package com.xinwei.java.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinweiwang on 3/28/17.
 */

/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */

public class Pascals_Triangle_II {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>();
        res.add(1);
        if(rowIndex==0){
            return res;
        }
        res.add(1);
        if(rowIndex==1){
            return res;
        }

        int temp, current;

        for(int i=2;i<=rowIndex;i++){
            temp = 1;
            //int temp2 = res.get(1);
            for(int j=1;j<i;j++){
                current = temp+ res.get(j);
                temp = res.get(j);
                res.set(j,current);
            }
            res.add(i,1);
        }
        return res;
    }

}
