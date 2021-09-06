package com.zanbo.structure.utils;

import com.zanbo.structure.data.ListNode;

/**
 * @program: Solution
 * @description: 工具类：构建ListNode
 * @author: zanbo
 * @date: 2021-09-06 下午 1:40
 */
public class ListNodeUtil {
    
    public static ListNode getListNode() {
        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 10; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
        return head;
    }
}