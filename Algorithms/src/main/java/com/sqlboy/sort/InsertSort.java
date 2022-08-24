package com.sqlboy.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] arrays) {
        int[] arr = arrays;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}