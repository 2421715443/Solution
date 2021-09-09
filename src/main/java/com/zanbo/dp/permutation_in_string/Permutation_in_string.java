package com.zanbo.dp.permutation_in_string;

import java.util.Arrays;

/**
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。
 * <p>
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-09 下午 7:05
 */
public class Permutation_in_string {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "a";
        String s2 = "ab";
        System.out.println(solution.checkInclusion(s1, s2));
    }
}

class Solution {
    
    //经过优化4ms，思路是只更新滑动窗口左右端值的数量映射表
    public boolean checkInclusion(String s1, String s2) {
        int[] f = hashbook(s1);
        int len1 = s1.length();
        int len2 = s2.length();
        int[] hashbook = hashbook(s2.substring(0, len1));
        char[] chars = s2.toCharArray();
        if (Arrays.equals(f, hashbook)) {
            return true;
        }
        for (int i = 0; i < len2 - len1; i++) {
            hashbook[chars[i] - 97]--;
            hashbook[chars[i + len1] - 97]++;
            if (Arrays.equals(f, hashbook)) {
                return true;
            }
        }
        return false;
    }
    
    //未经过优化leetcode用例120ms左右
    public boolean checkInclusionNONONO(String s1, String s2) {
        int[] f = hashbook(s1);
        int len1 = s1.length();
        int len2 = s2.length();
        int low = 0, fast = len1 - 1;
        String w = "";
        for (int i = 0; i <= len2 - len1; i++) {
            String substring = s2.substring(i, i + len1);
            int[] hashbook = hashbook(substring);
            if (Arrays.equals(f, hashbook)) {
                return true;
            }
        }
        return false;
    }
    
    public int[] hashbook(String s) {
        int[] book = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            book[chars[i] - 97]++;
        }
        return book;
    }
}