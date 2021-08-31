package com.zanbo.leetcode.fan_zhuan_lian_biao_lcof;

/**
 * @program: Solution
 * @description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @author: zanbo
 * @create: 2021-08-30 21:15
 */
public class Fan_zhuan_lian_biao_lcof {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode h = listNode;
        for (int i = 2; i <= 10; i++) {
            h.next = new ListNode(i);
            h = h.next;
        }
        Solution solution = new Solution();
        ListNode listNode1 = solution.reverseList(listNode);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        
    }
}

//原地反转
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode q = head;
        ListNode swap;
        while (q != null) {
            swap = q.next;
            q.next = pre;
            pre = q;
            q = swap;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
    }
}
