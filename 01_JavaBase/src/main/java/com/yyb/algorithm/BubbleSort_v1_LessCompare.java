package com.yyb.algorithm;

import java.util.Arrays;

public class BubbleSort_v1_LessCompare {
    public static void main(String[] args) {
        int[] arr = {5,9,7,4,1,3,2,8};
        bubbleSort(arr);
    }
    //优化版:第二轮冒泡应该比第一轮冒泡少比较一次(最大的已经浮上去了),以此类推
    //因此比较次数可以逐层递减
    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            //每轮冒泡次数递减,递减的个数,就是上一层已经排过序的个数,所以arr.length - 1- j
            for (int i = 0; i < arr.length - 1- j; i++) {
                System.out.println("比较次数"+i);
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            System.out.println("第" + (j + 1) + "轮冒泡:" + Arrays.toString(arr));
        }
        System.out.println(arr.length - 1 + "轮之后最终结果:" + Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

