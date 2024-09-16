package com.ppg.vedio.itheima_02;

/*
    数字相加
 */
public class OperatorDemo01 {
    public static void main(String[] args) {
        int a = 10;
        double b = 13.14;
        System.out.println(a + b);

        int c = (int)(a + b);
        System.out.println(c);
//        double d = a + b;

        short s = 10;
        int i = 20;
        int j = s + i;
//        short ss = s + i;

        short ss = (short) (s + i);
    }
}
