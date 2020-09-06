package com.jy.array;

/**
 * 数组算法
 */
public class ArrayTest01 {

    public static void main(String[] args) {
        yangHui();
    }

    /**
     * 打印一个10行的杨辉三角
     * 每行的第一个数和最后一个数为1
     * 从第三行第二个数字开始为 arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
     */
    public static void yangHui() {
        // 定义二维数组
        int[][] yangHui = new int[10][];
        // 组装数据
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = yangHui[i][i] = 1;
            if(i > 1) {
                for (int j = 1; j < yangHui[i].length - 1; j++) {
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
            }
        }

        //打印数据
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
