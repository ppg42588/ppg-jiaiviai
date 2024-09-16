package com.ppg.day04;

public class Demo2 {
    public static void main(String[] args) {
        int num1 = 0;
        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sum1 += i;
                num1++;
            }
        }
        System.out.println(sum1 + " " + num1);

        int num2 = 0;
        int sum2 = 0;
        int j = 0;
        while (j <= 100) {
            if (j % 2 == 1) {
                sum2 += j;
                num2++;
            }
            j++;
        }
        System.out.println(sum2 + " " + num2);
    }
}
