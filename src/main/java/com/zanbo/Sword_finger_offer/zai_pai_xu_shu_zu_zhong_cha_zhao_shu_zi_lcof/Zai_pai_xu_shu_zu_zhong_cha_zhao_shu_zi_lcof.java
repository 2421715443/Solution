package com.zanbo.Sword_finger_offer.zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof;

/**
 * @program: Solution
 * @description: 统计一个数字在排序数组中出现的次数。
 * @author: zanbo
 * @date: 2021-09-03 下午 1:16
 */
public class Zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{2, 2}, 4));
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
                return lift(md - 1, nums, target) + right(md + 1, nums, target) + 1;
            } else if (nums[md] < target) {
                left = md + 1;
            } else if (nums[md] > target) {
                right = md - 1;
            }
        }
        return 0;
    }
    
    private int right(int md, int[] nums, int target) {
        int count = 0;
        while (md <= nums.length - 1 && nums[md++] == target) {
            ++count;
        }
        return count;
    }
    
    private int lift(int md, int[] nums, int target) {
        int count = 0;
        while (md >= 0 && nums[md--] == target) {
            ++count;
        }
        return count;
    }
}