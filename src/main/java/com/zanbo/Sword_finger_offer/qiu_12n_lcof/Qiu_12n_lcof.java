package com.zanbo.Sword_finger_offer.qiu_12n_lcof;

/**
 * 
 *
 * @program  Solution
 * @author  zanbo
 * @date  2021-09-22 下午 3:21
 */
public class Qiu_12n_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumNums(2));
    }
}

class Solution {
    public int sumNums(int n) {
        int sum = n;
        boolean f = (n > 0) && (sum += sumNums(n - 1)) > 0;
        return sum;
    }
}