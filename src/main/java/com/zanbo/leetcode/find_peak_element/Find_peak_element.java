package com.zanbo.leetcode.find_peak_element;

/**
 * 峰值元素是指其值严格大于左右相邻值的元素。
 * <p>
 * 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * <p>
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 * <p>
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-peak-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-15 下午 1:28
 */
public class Find_peak_element {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(new int[]{1,2}));
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int f = 0;
        int l = nums.length - 1;
        int md = 0;
        while (f < l) {
            md = f + ((l - f) / 2);
            if (md == 0) {
                return nums[f] > nums[l] ? f : l;
            }
            if (nums[md] > nums[md - 1] && nums[md] > nums[md + 1]) {
                return md;
            } else if (nums[md] > nums[md - 1] || nums[md] < nums[md + 1]) {
                f = md + 1;
            } else if (nums[md] > nums[md + 1] || nums[md] < nums[md - 1]) {
                l = md - 1;
            }
        }
        if (f == l) {
            return f;
        }
        return 0;
    }
}