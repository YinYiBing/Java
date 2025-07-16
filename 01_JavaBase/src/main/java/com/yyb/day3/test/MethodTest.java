package com.yyb.day3.test;

public class MethodTest {
    public static void main(String[] args) {

        int result = getMax(10,20);

        // check(result);
        // print(result);

        System.out.println(result);

    }

    // void : 当前方法, 没有返回值
    public static void print(){
        System.out.println("HelloWorld");
    }

    public static int getMax(int num1, int num2){

        int max = num1 > num2 ? num1 : num2;

        return max;
    }
}
