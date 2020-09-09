package com.jy.array;

/**
 * 数据查找算法
 * 二分查找
 */
public class ArraySearchTest {

    public static void main(String[] args) {
        binarySearch(11);
    }

    /**
     * 查找：顺序查找
     * @param dest
     */
    public static void search01(String dest) {
        String[] arr1 = new String[] {"JJ", "GG", "BB", "EE", "AA", "RR", "MM", "DD"};
        boolean isFind = false;
        for (int i = 0; i < arr1.length; i++) {
            if(dest.equals(arr1[i])) {
                System.out.println("找到了，位置为：" + i);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("没找到");
        }
    }

    /**
     * 查找：二分查找
     * @param dest
     */
    public static void binarySearch(int dest) {
        int[] arr1 = new int[]{3, 4, 8, 11, 14, 19, 34, 45, 75, 84, 96};
        boolean isFind = false;
        int head = 0;
        int end = arr1.length - 1;
        while (head < end) {
            int middle = (head + end) >>> 1;
            if (dest == arr1[middle]) {
                System.out.println("找到了，位置为：" + middle);
                isFind = true;
                break;
            } else if (dest < arr1[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (!isFind) {
            System.out.println("没找到");
        }
    }
}
