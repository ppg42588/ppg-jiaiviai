package com.ppg.vedio.itheima;

/*
    if语句格式3
 */
public class IfDemo03 {
    public static void main(String[] args) {
        //定义三个变量，表示交通信号灯的三种状态
        boolean isRed = true;
        boolean isGreen = true;
        boolean isYellow = true;

        //红灯
//        isGreen = false;
//        isYellow = false;

        //绿灯
//        isRed = false;
//        isYellow = false;

        //黄灯
//        isRed = false;
//        isGreen = false;

        //出现了故障，信号灯都不亮了
        isRed = false;
        isGreen = false;
        isYellow = false;

//        if (isRed) {
//            System.out.println("红灯停");
//        }
//
//        if (isGreen) {
//            System.out.println("绿灯行");
//        }
//
//        if (isYellow) {
//            System.out.println("黄灯亮了等一等");
//        }

        if(isRed) {
            System.out.println("红灯停");
        }else if(isGreen) {
            System.out.println("绿灯行");
        }else if(isYellow) {
            System.out.println("黄灯亮了等一等");
        } else  {
            System.out.println("交通信号灯故障，请在保证安全的情况下通行");
        }
    }
}
