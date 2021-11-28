package com.zanbo.dp.fibonacci_number;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 上午 11:06
 */
public class Fibonacci_number {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int fib = solution.fib(5);
        System.out.println("和为：" + fib);
    }

}

class Solution {
    public int fib(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}