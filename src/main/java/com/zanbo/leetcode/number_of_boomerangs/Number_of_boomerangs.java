package com.zanbo.leetcode.number_of_boomerangs;

import java.util.HashMap;

/**
 * 给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。回旋镖 是由点 (i, j, k) 表示的元组 ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * <p>
 * 返回平面上所有回旋镖的数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-boomerangs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-13 上午 10:43
 */
public class Number_of_boomerangs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfBoomerangs(new int[][]{{1, 0}, {2, 0}, {1, 1}}));
    }
}

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>(8);
        int sum = 0;
        Integer n = null;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = (points[j][1] - points[i][1]) * (points[j][1] - points[i][1])
                            + (points[j][0] - points[i][0]) * (points[j][0] - points[i][0]);
                    if ((n = map.get(dis)) != null) {
                        sum += n * 2;
                        map.put(dis, n + 1);
                    } else {
                        map.put(dis, 1);
                    }
                }
            }
            map.clear();
        }
        return sum;
    }
}