package com.xinwei.java.leetcode.string;

/**
 * Created by xinweiwang on 7/11/17.
 */

/*
Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Longest_Common_Prefix {


    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String common = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<common.length()&&j<strs[i].length()&&common.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            if(j==0){
                return "";
            }else{
                common = common.substring(0,j);
            }
        }
        return common;
    }
}
