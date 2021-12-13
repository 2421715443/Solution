package com.zanbo.leetcode.find_first_and_last_position_of_element_in_sorted_array;

import java.util.Arrays;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author zanbo
 * @program Solution
 * @date 2021-12-01 上午 9:28
 */
public class Find_first_and_last_position_of_element_in_sorted_array {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        Arrays.stream(ints).forEach(System.out::println);
    }

}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = getL(nums, target) + 1;
        int r = getR(nums, target) - 1;
        if (l <= r && r < nums.length && nums[l] == target && nums[r] == target) {
            return new int[]{l, r};
        }
        return new int[]{-1, -1};
    }

    public int getR(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while (left <= right) {
            int md = (left + right) / 2;
            if (nums[md] > target) {
                right = md - 1;
            } else {
                left = md + 1;
                res = left;
            }
        }
        return res;
    }

    public int getL(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while (left <= right) {
            int md = left + (right - left) / 2;
            if (nums[md] < target) {
                left = md + 1;
            } else {
                right = md - 1;
                res = right;
            }
        }
        return res;
    }

}