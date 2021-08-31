package com.zanbo.leetcode.corporate_flight_bookings;

/**
 * @program: Solution
 * @description:这里有 n 个航班，它们分别从 1 到 n 进行编号。
 * <p>
 * 有一份航班预订表 bookings ，表中第 i 条预订记录 bookings[i] = [firsti, lasti, seatsi] 意味着在从 firsti 到 lasti （包含 firsti 和 lasti ）的 每个航班 上预订了 seatsi 个座位。
 * <p>
 * 请你返回一个长度为 n 的数组 answer，其中 answer[i] 是航班 i 上预订的座位总数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/corporate-flight-bookings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-08-31 09:41
 */
public class Corporate_flight_bookings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        int[] prefixAnd = solution.corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
        for (int i = 0; i < prefixAnd.length; i++) {
            System.out.println(prefixAnd[i]);
        }
    }
}

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] differenceArray = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            differenceArray[bookings[i][0] - 1] += bookings[i][2];
            if (bookings[i][1] < n) {
                differenceArray[bookings[i][1]] -= bookings[i][2];
            }
        }
        for (int i = 1; i < differenceArray.length; i++) {
            differenceArray[i] += differenceArray[i - 1];
        }
        return differenceArray;
    }
}