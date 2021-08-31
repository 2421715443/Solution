package com.zanbo.Sword_finger_offer.yong_liang_ge_zhan_shi_xian_dui_lie_lcof;

import java.util.Stack;

/**
 * @program: Solution
 * @description: 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-08-31 下午 6:59
 */
public class Yong_liang_ge_zhan_shi_xian_dui_lie_lcof {
    
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(4);
        cQueue.appendTail(2);
        cQueue.appendTail(5);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
    
}

class CQueue {
    
    private Stack<Integer> red;
    private Stack<Integer> blue;
    
    public CQueue() {
        red = new Stack<Integer>();
        blue = new Stack<Integer>();
    }
    
    public void appendTail(int value) {
        red.push(value);
    }
    
    public int deleteHead() {
        if (red.isEmpty() && blue.isEmpty()) {
            return -1;
        }
        if (blue.isEmpty()) {
            while (!red.isEmpty()) {
                blue.push(red.pop());
            }
        }
        return blue.pop();
    }
}