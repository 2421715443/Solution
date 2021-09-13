package com.zanbo.Sword_finger_offer.ji_qi_ren_de_yun_dong_fan_wei_lcof;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-13 下午 4:55
 */
public class Ji_qi_ren_de_yun_dong_fan_wei_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(1, 2, 1));
    }
}

class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] vis = new boolean[m][n];
        return dfs(0, 0, m, n, k, vis);
    }
    
    private int dfs(int x, int y, int m, int n, int k, boolean[][] vis) {
        
        if (x < 0 || y < 0 || x >= m || y >= n || vis[x][y] || (x / 10 + x % 10 + y / 10 + y % 10 > k)) {
            return 0;
        }
        vis[x][y] = true;
        return dfs(x + 1, y, m, n, k, vis)
                + dfs(x - 1, y, m, n, k, vis)
                + dfs(x, y + 1, m, n, k, vis)
                + dfs(x, y - 1, m, n, k, vis) + 1;
    }
    
}