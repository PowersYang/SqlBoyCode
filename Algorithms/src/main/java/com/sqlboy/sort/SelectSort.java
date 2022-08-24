package com.sqlboy.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arrays = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int index = i;
            for (int j = arrays.length - 1; j > i; j--) {
                if (arrays[j] < arrays[index]) {
                    index = j;
                    int temp = 0;
                    temp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = temp;
                }
            }
        }
    }
}