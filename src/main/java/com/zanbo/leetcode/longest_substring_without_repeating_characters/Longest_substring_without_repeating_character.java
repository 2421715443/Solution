package com.zanbo.leetcode.longest_substring_without_repeating_characters;

import java.util.HashSet;

/**
 * 无重复最长子串
 *
 * @author zanbo
 * @program Solution
 * @since 2021-12-16 下午 3:24
 */
public class Longest_substring_without_repeating_character {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring("1136");
        System.out.println(i);
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] book = new int[128];
        int n = s.length();

        int r = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);
            start = Math.max(start, book[c]);
            r = Math.max(r, i - start + 1);
            book[c] = i + 1;
        }
        return r;
    }
}