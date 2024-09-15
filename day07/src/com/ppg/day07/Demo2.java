package com.ppg.day07;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLen = scanner.nextInt();
        int[] array = getArray(arrayLen);

        for (int i = 0; i < arrayLen; i++) {
            System.out.println(array[i]);
        }

    }

    static int[] getArray(int arrayLen) {
        int[] array = new int[arrayLen];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayLen; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
