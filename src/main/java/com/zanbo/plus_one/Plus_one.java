package com.zanbo.plus_one;

/**
 * @program: Solution
 * @description:给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-08-30 19:00
 */
public class Plus_one {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ints = new int[digits.length + 1];
        ints[0]=1;
        return ints;
    }
}