package com.ppg.vedio.itheima;

/*
    关系运算符
 */
public class OperatorDemo01 {
    public static void main(String[] args) {
        //定义三个int类型的变量
        int i = 10;
        int j = 20;
        int k = 10;

        //等于：==
        System.out.println(i == j);//false
        System.out.println(i == k);//true
        System.out.println("--------");

        //不等于：!=
        System.out.println(i != j);//true
        System.out.println(i != k);//false
        System.out.println("--------");

        //大于：>
        System.out.println(i > j);//false
        System.out.println(i > k);//false
        System.out.println("--------");

        //大于等于：>=
        System.out.println(i >= j);//false
        System.out.println(i >= k);//true
        System.out.println("--------");

        //千万不要把==写成了=
        System.out.println(i = j); //20
    }
}
