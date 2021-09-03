package com.zanbo.leetcode.smallest_k_lcci;

import java.util.Arrays;

/**
 * @program: Solution
 * @description: 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 * @author: zanbo
 * @date: 2021-09-03 上午 10:53
 */
public class Smallest_k_lcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.smallestK(new int[]{4, 5, 32, 36, 12, 6, 2, 5}, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ints = new int[k];
        System.arraycopy(arr, 0, ints, 0, k);
        return ints;
    }
}