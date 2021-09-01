package com.zanbo.Sword_finger_offer.fu_za_lian_biao_de_fu_zhi_lcof;

/**
 * @program: Solution
 * @description: 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-08-31 下午 8:19
 */
public class Fu_za_lian_biao_de_fu_zhi_lcof {
    public static void main(String[] args) {
        Node node = new Node(7);
        node.next = new Node(13);
        node.next.random = node;
        node.next.next = new Node(10);
        node.next.next.random = node;
        Solution solution = new Solution();
        Node node1 = solution.copyRandomList(node);
        while (node1 != null) {
            System.out.println(node1.val);
            System.out.println(node.random);
            node1 = node1.next;
        }
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node re = head.next;
        Node copy = re;
        temp = head;
        while (temp != null) {
            temp.next = re.next;
            temp = re.next;
            if (temp != null) {
                re.next = temp.next;
                re = temp.next;
                
            }
        }
        return copy;
    }
}

class Node {
    int val;
    Node next;
    Node random;
    
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}