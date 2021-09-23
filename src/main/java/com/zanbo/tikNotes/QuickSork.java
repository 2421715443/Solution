package com.zanbo.tikNotes;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author zanbo
 * @program Solution
 * @date 2021-09-22 下午 7:29
 */
public class QuickSork {
    
    public static void main(String[] args) {
        int[] ints = {3, 2, 5, 6, 7, 4, 3, 7, 8};
        sort(ints, 0, ints.length - 1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        
    }
    
    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }
    
}
