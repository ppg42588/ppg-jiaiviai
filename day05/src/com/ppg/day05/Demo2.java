package com.ppg.day05;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

    public static int getSum(int num) {
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum+=i;
        }
        return sum;
    }
}
