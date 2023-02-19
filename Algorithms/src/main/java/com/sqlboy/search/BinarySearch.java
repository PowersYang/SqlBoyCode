package com.sqlboy.search;

/**
 * Title
 *
 * <p>
 *
 * @author will.yang 2023/2/19
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arrays = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arrays, 2));
        System.out.println(binarySearch.search(arrays, 0, arrays.length - 1, 2));
    }


    /**
     * 循环实现
     *
     * @param a     数组
     * @param value 目标值
     * @return 目标下标
     */
    public int search(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            // int mid = (low + high) / 2;
            // 避免溢出的写法
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 递归实现
     *
     * @param a     数组
     * @param low   左下标
     * @param high  右下标
     * @param value 目标值
     * @return 目标下标
     */
    public int search(int[] a, int low, int high, int value) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return search(a, mid + 1, high, value);
        } else {
            return search(a, low, mid - 1, value);
        }
    }
}
