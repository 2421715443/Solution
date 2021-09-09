package com.zanbo.Sword_finger_offer.que_shi_de_shu_zi_lcof;

/**
 * @program: Solution
 * @description: 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @date: 2021-09-03 下午 2:41
 */
public class Que_shi_de_shu_zi_lcof {
    public static void main(String[] args) {
        return;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        String s = null;
        int length = s.length();
        int flag = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'R') {
                flag++;
            }
            if (s.charAt(i) == 'L') {
                flag--;
            }
            if (flag == 0) {
                sum++;
            }
        }
        return 0;
    }
}