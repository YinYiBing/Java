package com.yyb.algorithm;

import java.util.Arrays;

public class BubbleSort_v2_LessBubble {
    public static void main(String[] args) {
        int[] arr = {5,9,7,4,1,3,2,8};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        int round = 0; // 实际执行轮次
        for(int j=0;j<arr.length-1;j++){
            boolean swapped=false;//判断是否发生了交换
            for(int i=0;i<arr.length-1-j;i++){
                System.out.println("第"+(j+1)+"轮比较次数:"+(i+1));
                //每一轮都要重新标记,意味着判断这一遍循环,有没有出现两两全不交换的情况
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    //如果发生交换,标记为true
                    swapped=true;
                }
            }
            //这一遍有交换,轮次+1
            round++;
            System.out.println("第"+(j+1)+"轮排序:"+Arrays.toString(arr));
            //如果没交换,则说明以后的冒泡都没必要了,终止循环
            if(!swapped){
                break;
            }
        }
        System.out.println("经过"+round+"轮排序最终:"+Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
