package com.zanbo.dp.n_th_tribonacci_number;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 上午 11:18
 */
public class N_th_tribonacci_number {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int tribonacci = solution.tribonacci(4);
        System.out.println(tribonacci);
    }

}

class Solution {
    public int tribonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = a + b + c;
            a = b;
            b = c;
            c = res;
        }
        return res;
    }
}