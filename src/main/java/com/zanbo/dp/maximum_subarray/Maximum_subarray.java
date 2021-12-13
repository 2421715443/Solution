package com.zanbo.dp.maximum_subarray;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-30 下午 6:39
 */
public class Maximum_subarray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }

}

/**
 * 连续字串的最大和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int num : nums) {
            pre = Math.max(num, pre + num);
            res = Math.max(pre, res);
        }
        return res;
    }
}