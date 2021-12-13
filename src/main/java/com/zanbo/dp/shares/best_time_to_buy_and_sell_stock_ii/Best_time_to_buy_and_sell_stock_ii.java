package com.zanbo.dp.shares.best_time_to_buy_and_sell_stock_ii;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 上午 10:01
 */
public class Best_time_to_buy_and_sell_stock_ii {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}, 2);
        System.out.println("利润为：" + i);

    }
}

/**
 * [7, 1, 5, 6] 第二天买入，第四天卖出，收益最大（6-1），所以一般人可能会想，怎么判断不是第三天就卖出了呢?
 * 这里就把问题复杂化了，根据题目的意思，当天卖出以后，当天还可以买入，所以其实可以第三天卖出，
 * 第三天买入，第四天又卖出（（5-1）+ （6-5） === 6 - 1）。所以算法可以直接简化为只要今天比昨天大，就卖出。
 */
class SolutionBack1 {
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

/**
 * dp解法
 */
class SolutionBack2 {
    public int maxProfit(int[] prices) {
        int dp_0 = 0;
        int dp_1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_0;
            dp_0 = Math.max(dp_0, dp_1 + prices[i]);
            dp_1 = Math.max(dp_1, temp - prices[i]);
        }
        return dp_0;
    }
}

/**
 * 股票交易带有k(交易次数的dp解法)
 */
class Solution {
    public int maxProfit(int[] prices, int k) {
        if (k > prices.length / 2) {
            return maxProfit_int(prices);
        }
        int[][][] dp = new int[prices.length][k + 1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j >= 1; j--) {
                if (i == 0) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -(prices[i]);
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][k][0];
    }

    public int maxProfit_int(int[] prices) {
        int dp_0 = 0;
        int dp_1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_0;
            dp_0 = Math.max(dp_0, dp_1 + prices[i]);
            dp_1 = Math.max(dp_1, temp - prices[i]);
        }
        return dp_0;
    }

}