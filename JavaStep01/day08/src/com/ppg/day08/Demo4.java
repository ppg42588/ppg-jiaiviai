package com.ppg.day08;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // 键盘录入数组元素
        int[]arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第"+(i+1)+"个数字:");
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
