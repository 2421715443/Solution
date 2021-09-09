package com.zanbo.dp.quan_pai_lie;

import java.util.LinkedList;
import java.util.List;

/**
 * 全排列遍历
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-08 下午 3:07
 */
public class Quan_pai_lie {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> book = new LinkedList<>();
        LinkedList<Integer> tr = new LinkedList<>();
        solution.backtrack(new int[]{1, 2, 3}, book, tr);
        for (List<Integer> integers : book) {
            System.out.println(integers);
        }
    }
}

class Solution {
    public void backtrack(int[] nums, List<List<Integer>> book, LinkedList<Integer> tr) {
        if (tr.size() == nums.length) {
            book.add(new LinkedList<>(tr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tr.contains(nums[i])) {
                continue;
            }
            tr.add(nums[i]);
            backtrack(nums, book, tr);
            tr.removeLast();
        }
    }
}