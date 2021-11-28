package com.zanbo.dp.climbing_stairs;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 下午 1:37
 */
public class Climbing_stairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.climbStairs(4);
        System.out.println(i);
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}