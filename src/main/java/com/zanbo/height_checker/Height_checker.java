package com.zanbo.height_checker;

import java.util.Arrays;

/**
 * @program: Solution
 * @description: 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
 * <p>
 * 排序后的高度情况用整数数组 expected 表示，其中 expected[i] 是预计排在这一行中第 i 位的学生的高度（下标从 0 开始）。
 * <p>
 * 给你一个整数数组 heights ，表示 当前学生站位 的高度情况。heights[i] 是这一行中第 i 位学生的高度（下标从 0 开始）。
 * <p>
 * 返回满足 heights[i] != expected[i] 的 下标数量 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-08-31 下午 4:32
 */
public class Height_checker {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        System.out.println(solution.heightChecker(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}

class Solution {
    public int heightChecker(int[] heights) {
        int[] a = new int[heights.length];
        System.arraycopy(heights, 0, a, 0, heights.length);
        Arrays.sort(heights);
        int num = 0;
        for (int i = 0; i < heights.length; i++) {
            if (a[i] != heights[i]) {
                num++;
            }
        }
        return num;
    }
}