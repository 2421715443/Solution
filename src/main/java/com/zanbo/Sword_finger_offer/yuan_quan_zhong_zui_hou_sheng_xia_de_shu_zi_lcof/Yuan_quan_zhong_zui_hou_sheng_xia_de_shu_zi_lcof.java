package com.zanbo.Sword_finger_offer.yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof;

/**
 * 约瑟夫环——公式法（递推公式）
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-23 下午 3:35
 */
public class Yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof {

}

class Solution {
    public int lastRemaining(int n, int m) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + m) % i;
        }
        return p;
    }
}