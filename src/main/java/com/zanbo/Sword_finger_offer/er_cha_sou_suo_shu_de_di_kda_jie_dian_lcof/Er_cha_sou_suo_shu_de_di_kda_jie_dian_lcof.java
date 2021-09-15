package com.zanbo.Sword_finger_offer.er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-14 下午 8:49
 */
public class Er_cha_sou_suo_shu_de_di_kda_jie_dian_lcof {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.right = new TreeNode(6);
        treeNode.left = new TreeNode(3);
        Solution solution = new Solution();
        solution.kthLargest(treeNode, 2);
    }
}

class Solution {
    int dd = 0;
    TreeNode res = null;
    public int kthLargest(TreeNode root, int k) {
        dd = k;
        zrl(root);
        return res.val;
    }
    
    private void zrl(TreeNode node) {
        if (node == null || dd <= 0) {
            return;
        }
        zrl(node.right);
        dd--;
        if (dd == 0) {
            res = node;
        }
        zrl(node.left);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}
