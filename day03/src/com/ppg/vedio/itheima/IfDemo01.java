package com.ppg.vedio.itheima;

/*
    if语句格式1
 */
public class IfDemo01 {
    public static void main(String[] args) {
        //定义一个变量，用来表示绿灯的状态
        boolean isGreen = true;
        isGreen = false;

        if(isGreen) {
            System.out.println("绿灯行");
        }
    }
}
