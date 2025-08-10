package com.yyb;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i));

        }
    }
}


