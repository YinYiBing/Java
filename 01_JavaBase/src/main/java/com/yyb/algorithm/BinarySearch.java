package com.yyb.algorithm;

//import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,48,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77};
        int T=48;
        int index = binarySearch(arr,T);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr,int T){
        int L=0;
        int R=arr.length-1;
        while (L<=R){
            int M=(L+R)/2;
            if (arr[M]==T){
                return M;
            }else if (arr[M]>T){
                R=M-1;
            }
            else {
                L=M+1;
            }
        }
        return -1;
    }
}
