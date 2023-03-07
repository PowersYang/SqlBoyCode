package com.sqlboy.sort;

import java.util.Arrays;

public class BubblingSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] arrays){
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[ j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrays));
    }
}