package com.jy.array;

import java.util.Arrays;

/**
 * java.utils.Arrays工具类的使用测试
 */
public class ArraysTest02 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4, 3};
        // 判断两数组是否一样
        System.out.println(Arrays.equals(arr1, arr2));

        // 输出数组信息
        System.out.println(Arrays.toString(arr1));

        // 数组填充
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        // 数组排序，快速排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // 数组二分查找，前提是这个数组必须是有序的
        // 小于0就是没找到
        int index = Arrays.binarySearch(arr2, 3);
        System.out.println(index);
    }

}
