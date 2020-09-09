package com.jy.array;

/**
 * 数组算法
 */
public class ArrayTest01 {

    public static void main(String[] args) {
//        yangHui();
//        caiPiao();
//        huiXing(6);
        arrayOp();
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

    /**
     * 创建一个长度为6的int数组，要求取值为1-30之间，同时各元素不相同
     * 随机数生成公式：
     * 如取 [10, 99]
     * (int)(Math.random() * (99 - 10 + 1) + 10)
     * [A, B]
     * (int)(Math.random() * (B - A + 1) + A)
     */
    public static void caiPiao() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 输入一个数字n(1~20)，生成一个长度为n的正文形矩形数组，
     * 把1,2,3,...n*n的数字按照顺时针螺旋的形式填入其中。
     * 如 输入 2 得到 1 2
     *              4 3
     * 输入 4    得到 1  2  3  4
     *              12 13 14 5
     *              11 16 15 6
     *              10 9  8  7
     */
    public static void huiXing(int n) {
        int[][] arr = new int[n][n];
        int count = 0;
        int minX = 0;// X轴最小下标
        int minY = 0;// Y轴最小下标
        int maxX = n - 1;// X轴最大下标
        int maxY = n - 1;// Y轴最大下标
        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * 数组的复制、反转
     */
    public static void arrayOp() {
        String[] arr1 = new String[] {"JJ", "GG", "BB", "EE", "AA", "RR", "MM", "DD"};

        //复制
        String arr2[] = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        
        //反转
        for (int i = 0; i < arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

    }

}
