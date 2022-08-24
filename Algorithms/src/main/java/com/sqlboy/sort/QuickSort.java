package com.sqlboy.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arrays = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] a, int l, int r) {
        if (l < r) {
            int i, j, x;

            i = l;
            j = r;
            x = a[i];
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && a[j] > x) j--;
                if (i < j) a[i++] = a[j];

                // 从左向右找第一个大于x的数
                while (i < j && a[i] < x) i++;
                if (i < j) a[j--] = a[i];
            }
            a[i] = x;

            // 递归
            sort(a, l, i - 1);
            sort(a, i + 1, r);
        }
    }
}