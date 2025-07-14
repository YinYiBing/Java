package com.yyb.algorithm;

import java.util.Arrays;

public class BubbleSort_v3_SmarterCompare {
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,1,3,8,9};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        int n= arr.length-1;//n表示需要循环的次数,为了配合lastSwapIndex工作
        while(true){//优化3覆盖j层
            int lastSwapIndex=0;//优化3,减少比较次数,表示最后一次交换索引位置
            for(int i=0;i<n;i++){//优化3覆盖优化1:循环的次数改成n
                System.out.println("这是第X轮交换的比较次数:"+(i+1));
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    //如果发生了交换,将前一个数字的下标索引放到index里
                    lastSwapIndex=i;
                }
            }
            //每次循环完之后,将lastSwapIndex给到n(变相减少arr长度)
            n=lastSwapIndex;
            if(n==0){
                System.out.println("没有发生交换，提前终止排序");
                break;
            }
            System.out.println("第X轮排序:"+ Arrays.toString(arr));
        }
        System.out.println("最终结果:"+ Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
