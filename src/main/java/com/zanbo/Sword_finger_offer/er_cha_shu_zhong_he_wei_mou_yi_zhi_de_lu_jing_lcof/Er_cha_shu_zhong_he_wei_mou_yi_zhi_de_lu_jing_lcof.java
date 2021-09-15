package com.zanbo.Sword_finger_offer.er_cha_shu_zhong_he_wei_mou_yi_zhi_de_lu_jing_lcof;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 * <p>
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-14 下午 7:52
 */
public class Er_cha_shu_zhong_he_wei_mou_yi_zhi_de_lu_jing_lcof {
}

class Solution {
    
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> add = new LinkedList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;
    }
    
    private void dfs(TreeNode node, int target) {
        if (node == null) {
            return;
        }
        target -= node.val;
        add.offer(node.val);
        if (node.left == null && node.right == null && target == 0) {
            res.add(new LinkedList<>(add));
        }
        dfs(node.left, target);
        dfs(node.right, target);
        add.pollLast();
    }
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }
    
    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
