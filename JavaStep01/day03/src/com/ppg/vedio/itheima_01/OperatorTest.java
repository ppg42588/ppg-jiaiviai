package com.ppg.vedio.itheima_01;

/*
    需求：定义一个三位数，将其拆分为个位、十位、百位后，输出在控制台
 */
public class OperatorTest {
    public static void main(String[] args) {
        //定义一个三位数
        int number = 123;

        //获取个，十，百位数据
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        //输出结果
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}
