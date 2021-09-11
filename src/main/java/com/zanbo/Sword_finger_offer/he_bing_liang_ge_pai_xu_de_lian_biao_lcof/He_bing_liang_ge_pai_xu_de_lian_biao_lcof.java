package com.zanbo.Sword_finger_offer.he_bing_liang_ge_pai_xu_de_lian_biao_lcof;

import com.zanbo.structure.data.ListNode;
import com.zanbo.structure.utils.ListNodeUtil;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-11 下午 2:14
 */
public class He_bing_liang_ge_pai_xu_de_lian_biao_lcof {
    public static void main(String[] args) {
        ListNode l1 = ListNodeUtil.getListNode();
        ListNode l2 = ListNodeUtil.getListNode();
        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(Integer.MAX_VALUE);
        ListNode temp = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            temp.next = l2;
            return listNode.next;
        }
        if (l2 == null) {
            temp.next = l1;
            return listNode.next;
        }
        return listNode.next;
    }
}