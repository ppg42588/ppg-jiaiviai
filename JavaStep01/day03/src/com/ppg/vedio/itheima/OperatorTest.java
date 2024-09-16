package com.ppg.vedio.itheima;

/*
    三元运算符和if语句格式2的区别
 */
public class OperatorTest {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 10;
        int b = 20;

        //需求：获取两个数中的较大值
        //if语句实现
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println("较大的值是：" + max);

        if(a > b) {
            System.out.println("较大的值是：" + a);
        }else {
            System.out.println("较大的值是：" + b);
        }

        //三元运算符实现
        int max = a > b? a: b;
        System.out.println("较大的值是：" + max);
    }
}
