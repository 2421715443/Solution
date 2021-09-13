package com.zanbo.Sword_finger_offer.ju_zhen_zhong_de_lu_jing_lcof;

/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-13 下午 2:46
 */
public class Ju_zhen_zhong_de_lu_jing_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.exist(new char[][]{{'A', 'B', 'C', 'E' }, {'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' }}, "ABCCED"));
        System.out.println(solution.exist(new char[][]{{'A' }}, "AB"));
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        char[] chars = word.toCharArray();
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chars, vis, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, char[] chars, boolean[][] vis, int x, int y, int start) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || chars[start] != board[x][y] || vis[x][y]) {
            return false;
        }
        if (start == chars.length - 1) {
            return true;
        }
        vis[x][y] = true;
        boolean ans = false;
        ans = dfs(board, chars, vis, x + 1, y, start + 1)
                || dfs(board, chars, vis, x - 1, y, start + 1)
                || dfs(board, chars, vis, x, y + 1, start + 1)
                || dfs(board, chars, vis, x, y - 1, start + 1);
        
        vis[x][y] = false;
        return ans;
    }
    
}