package com.xinwei.java.leetcode.hashTable;

import java.util.HashSet;

/**
 * Created by xinweiwang on 7/11/17.
 */
/*
Given a string, determine if a permutation of the string could form a palindrome.

For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */
public class Palindrome_Permutation {

    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        return set.size()<=1;
    }

}
