package com.ppg.vedio.itheima;

/*
    逻辑运算符
 */
public class OperatorDemo02 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //逻辑与：&&
        System.out.println((i>j) && (i>k));//false && false
        System.out.println((i<j) && (i>k));//true && false
        System.out.println((i>j) && (i<k));//false && true
        System.out.println((i<j) && (i<k));//true && true
        System.out.println("-----------------------");

        //逻辑或：||
        System.out.println((i>j) || (i>k));//false || false
        System.out.println((i<j) || (i>k));//true || false
        System.out.println((i>j) || (i<k));//false || true
        System.out.println((i<j) || (i<k));//true || true
        System.out.println("-----------------------");

        //逻辑非：!
        System.out.println(!(i>j));//!false
        System.out.println(!!(i>j));//!!false
        System.out.println(!!!(i>j));//!!!false
        System.out.println(!!!!(i>j));//!!!!false

    }
}
