package com.zanbo.tikNotes;

/**
 * 不用加号实现加法（位运算）
 *
 * @program  Solution
 * @author  zanbo
 * @date  2021-09-23 上午 9:39
 */
public class NoAddAdd {
    public static void main(String[] args) {
        System.out.println(add(44, 22));
    }
    
    public static int add(int a, int b) {
        int m = a ^ b;
        int n = (a & b) << 1;
        if (n == 0) {
            return m;
        }
        return add(m, n);
    }
}
