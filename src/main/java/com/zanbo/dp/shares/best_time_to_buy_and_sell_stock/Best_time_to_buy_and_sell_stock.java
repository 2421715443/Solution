package com.zanbo.dp.shares.best_time_to_buy_and_sell_stock;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 上午 9:45
 */
public class Best_time_to_buy_and_sell_stock {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("利润为：" + i);
    }



}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max,prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

}