package com.zanbo.leetcode.longest_word_in_dictionary_through_deleting;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 * <p>
 * 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-14 上午 9:31
 */
public class Longest_word_in_dictionary_through_deleting {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("aaa");
        dictionary.add("aa");
        dictionary.add("a");
        System.out.println(solution.findLongestWord("aaa", dictionary));
    }
}

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String re = "";
        if (dictionary == null || dictionary.size() == 0) {
            return re;
        }
        int lenS = s.length();
        for (String dis : dictionary) {
            int i = 0, j = 0;
            int lenD = dis.length();
            while (i < lenS && j < lenD) {
                if (s.charAt(i) == dis.charAt(j)) {
                    j++;
                }
                i++;
            }
            if (j == dis.length()) {
                if (dis.length() > re.length() || (dis.length() == re.length() && dis.compareTo(re) < 0)) {
                    re = dis;
                }
            }
        }
        return re;
    }
}