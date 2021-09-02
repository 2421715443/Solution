package com.zanbo.leetcode.lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof;

/**
 * @program: Solution
 * @description: 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @date: 2021-09-02 下午 3:08
 */
public class Lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode h = listNode;
        for (int i = 2; i <= 10; i++) {
            h.next = new ListNode(i);
            h = h.next;
        }
        Solution solution = new Solution();
        ListNode kthFromEnd = solution.getKthFromEnd(listNode, 2);
        while (kthFromEnd != null) {
            System.out.println(kthFromEnd.val);
            kthFromEnd = kthFromEnd.next;
        }
    }
}

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode low = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
    }
}
