package com.ppg.day04;

public class Demo3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                num1++;
                System.out.print(i+" ");
            }
        }
        System.out.println(num1);

        int init = 1;
        while (init <= 100) {
            if (init % 2 == 0 && init % 3 == 0 && init % 5 == 0) {
                num2++;
                System.out.print(init+" ");
            }
            init++;
        }
        System.out.println(num2);
    }
}
