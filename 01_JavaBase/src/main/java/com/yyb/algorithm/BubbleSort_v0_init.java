package com.yyb.algorithm;

import java.util.Arrays;

public class BubbleSort_v0_init {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2, 5, 4};
        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr) {
        //循环数组长度-1次
        for (int j = 0; j < arr.length - 1; j++) {
            //一轮冒泡
            for (int i = 0; i < arr.length - 1; i++) {
                //比较相邻元素,左大于右就swap
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            System.out.println("第"+(j+1)+"轮冒泡:"+Arrays.toString(arr));
        }
        System.out.println(arr.length-1+"轮之后最终结果:"+Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
