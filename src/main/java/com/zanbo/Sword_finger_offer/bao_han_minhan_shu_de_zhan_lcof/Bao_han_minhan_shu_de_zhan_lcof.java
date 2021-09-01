package com.zanbo.Sword_finger_offer.bao_han_minhan_shu_de_zhan_lcof;

/**
 * @program: Solution
 * @description: 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @author: zanbo
 * @create: 2021-08-31 下午 7:28
 */
public class Bao_han_minhan_shu_de_zhan_lcof {
    public static void main(String[] args) {
    
    }
}

class MinStack {
    
    private Node head;
    
    /**
     * initialize your data structure here.
     */
    public MinStack() {
    }
    
    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            head = new Node(x, Math.min(x, head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int min() {
        return head.min;
    }
}

class Node {
    int val;
    int min;
    Node next;
    
    public Node(int val, int min, Node next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}