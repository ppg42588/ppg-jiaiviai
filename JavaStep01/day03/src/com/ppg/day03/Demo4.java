package com.ppg.day03;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1, 2, 3 -> System.out.println("春");
            case 4, 5, 6 -> System.out.println("夏");
            case 7, 8, 9 -> System.out.println("秋");
            case 10, 11, 12 -> System.out.println("冬");
            default -> System.out.println("滚你丫的");
        }
    }
}