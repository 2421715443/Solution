package com.zanbo.dp.shares.best_time_to_buy_and_sell_stock_ii;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 上午 10:01
 */
public class Best_time_to_buy_and_sell_stock_ii {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("利润为：" + i);

    }
}

/**
 * [7, 1, 5, 6] 第二天买入，第四天卖出，收益最大（6-1），所以一般人可能会想，怎么判断不是第三天就卖出了呢?
 * 这里就把问题复杂化了，根据题目的意思，当天卖出以后，当天还可以买入，所以其实可以第三天卖出，
 * 第三天买入，第四天又卖出（（5-1）+ （6-5） === 6 - 1）。所以算法可以直接简化为只要今天比昨天大，就卖出。
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int sum = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                sum = sum + (prices[i] - prices[i - 1]);
            }
        }
        return sum;
    }
}