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
        //int M=(L+R)/2;
        //在 while 循环外部就把 M 计算好了，后面 L 和 R 在变，但 M 不变，导致死循环或错误。
        while (L<=R){
            //需要把 M 的计算 放到 while 循环里面，这样每次都能取最新的中间值。
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
//改进:int M=(L+R)/2;
//当L和R很大,相加可能会溢出
// 方法一:改进为: int M=L+(R-L)/2;
// (L + R) / 2
// = L/2 + R/2
// = L + (-L/2 + R/2)
// = L + (R - L)/2 建议记住
//记忆：“中间值 = 左端点 + 一半长度”

//方法二:用无符号右移运算,代替掉除法
//int M = (L + R) >>> 1;
// >>> 无符号右移运算符，它把 32 位整型数字中的
// 所有位向右移动指定的位数，移动得到的空位以 0 填充。

//TIPS:
//正整数里,>>>1等价于除以2





