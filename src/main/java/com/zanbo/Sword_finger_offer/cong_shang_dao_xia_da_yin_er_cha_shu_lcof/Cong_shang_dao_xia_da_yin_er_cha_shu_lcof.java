package com.zanbo.Sword_finger_offer.cong_shang_dao_xia_da_yin_er_cha_shu_lcof;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Solution
 * @description: 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * @author: zanbo
 * @create: 2021-09-01 下午 4:55
 */
public class Cong_shang_dao_xia_da_yin_er_cha_shu_lcof {
    public static void main(String[] args) {
    
    }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode poll = deque.poll();
            list.add(poll.val);
            if (poll.left != null) {
                deque.offer(poll.left);
            }
            if (poll.right != null) {
                deque.offer(poll.right);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}
