package com.zanbo.dp.min_cost_climbing_stairs;

/**
 * @author zanbo
 * @program Solution
 * @date 2021-11-26 下午 2:07
 */
public class Min_cost_climbing_stairs {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minCostClimbingStairs(new int[]{1,2,2,1});
        System.out.println("最低消费为：" + i);
    }

}

/**
 * dp表记录到第i台阶最小花费
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int dp[] = new int[cost.length + 1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[cost.length];
    }
}

///**
// * 测试用例不能全过********
// * 可优化特殊情况后过用例，暂不考虑，优先dp
// */
//class Solution {
//    public int minCostClimbingStairs(int[] cost) {
//        int f = 0;
//        if (cost[0] == 0) {
//            for (int i = 0; i < cost.length; i++) {
//                if (cost[i] == 0) {
//                    f++;
//                }
//            }
//
//        }
//        if (cost.length <= 1) {
//            return 0;
//        }
//        int res = 0;
//        for (int i = cost.length - 1; i > 0;) {
//            if (cost[i] >= cost[i - 1]) {
//                res += cost[i - 1];
//                i -= 2;
//            } else {
//                res += cost[i];
//                i -= 1;
//            }
//            if (i < f + 1) {
//                return res;
//            }
//        }
//        return 0;
//    }
//}