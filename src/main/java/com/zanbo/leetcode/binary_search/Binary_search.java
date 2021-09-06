package com.zanbo.leetcode.binary_search;

/**
 * @program: Solution
 * @description: 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @author: zanbo
 * @date: 2021-09-06 上午 10:00
 */
public class Binary_search {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1, 2, 3, 4, 6, 7, 8, 9}, 4));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int md = 0;
        while (left <= right) {
            md = (left + right) / 2;
            if (nums[md] == target) {
                return md;
            } else if (nums[md] < target) {
                left = md + 1;
            } else if (nums[md] > target) {
                right = md - 1;
            }
        }
        return -1;
    }
}