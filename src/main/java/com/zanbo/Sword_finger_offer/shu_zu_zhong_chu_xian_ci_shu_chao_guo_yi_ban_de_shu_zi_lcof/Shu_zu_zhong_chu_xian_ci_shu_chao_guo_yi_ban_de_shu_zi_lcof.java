package com.zanbo.Sword_finger_offer.shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-23 下午 5:02
 */
public class Shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.majorityElement(new int[]{1,1,1,3,3,3,3,5,6,6,7});
        System.out.println(i);
    }
}

/**
 * 可以过leetcode的用例找超过一半的数，非找众数，摩尔投票法
 */
class Solution {
    public int majorityElement(int[] nums) {
        int sss = 0;
        int nb = 0;
        for (int num : nums) {
            if (nb == 0) {
                sss = num;
                nb++;
            } else {
                nb = num == sss ? nb + 1 : nb - 1;
            }
        }
        nb = 0;
        for (int num : nums) {
            if (sss == num) {
                nb++;
            }
        }
        if (nb <= (nums.length / 2)) {
            return -1;
        }
        return sss;
    }
}