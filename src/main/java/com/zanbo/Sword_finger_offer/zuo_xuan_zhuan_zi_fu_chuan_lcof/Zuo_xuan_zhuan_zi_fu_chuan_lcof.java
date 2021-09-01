package com.zanbo.Sword_finger_offer.zuo_xuan_zhuan_zi_fu_chuan_lcof;

import java.util.Arrays;

/**
 * @program: Solution
 * @description: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zanbo
 * @create: 2021-09-01 下午 1:58
 */
public class Zuo_xuan_zhuan_zi_fu_chuan_lcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseLeftWords("asdfgh", 2));
    }
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        //StringBuffer stringBuffer = new StringBuffer(s);
        //int length = s.length();
        //re2(stringBuffer, 0, n - 1);
        //re2(stringBuffer, n, length - 1);
        //
        //String s1 = re1(s, 0, length - 1);
        //String s2 = re1(s1, 0, length - n - 1);
        //String s3 = re1(s2, length - n, length - 1);
        //return stringBuffer.reverse().toString();
        return s.substring(n) + s.substring(0, n);
    }
    
    private String re1(String s, int start, int end) {
        char[] chars = s.toCharArray();
        char temp;
        while (start < end) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
    
    private void re2(StringBuffer sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    
}