package com.sqlboy.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * <p>
 *
 * @author will.yang 2023/2/19
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }

        int mid = L + ((R - L) >> 1);
        // 先让左边有序
        sort(arr, L, mid);
        // 然后让右边有序
        sort(arr, mid + 1, R);
        // 合并左右两部分，让整体有序
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;

        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        // 上面的while结束之后，左右两部分总有一个还剩了一部分没有添加到help中
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }

        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        // 至此 arr[L, R]已经有序，将其拷贝到arr中
        for (int j = L; j <= R; j++) {
            arr[j] = help[j - L];
        }
    }
}

