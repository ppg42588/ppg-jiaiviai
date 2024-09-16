package com.ppg.vedio.itheima;

/*
    需求：交通信号灯由红灯、绿灯、黄灯组成，请通过程序实现不同的信号灯给出不同的提示。
    提示信息：红灯停、绿灯行、黄灯亮了等一等
 */
public class IfTest01 {
    public static void main(String[] args) {
        //1:定义一个int类型的变量用来表示信号灯的状态(1表示红灯，2表示绿灯，3表示黄灯)
        int light = 1;
        light = 2;
        light = 3;
        light = 4;

        //2:用if语句格式3进行多种情况的判断
        //3:根据不同的情况给出不同的提示信息
        if (light == 1) {
            System.out.println("红灯停");
        } else if (light == 2) {
            System.out.println("绿灯行");
        } else if (light == 3) {
            System.out.println("黄灯亮了等一等");
        } else {
            System.out.println("交通信号灯故障，请在保证安全的情况下通行");
        }


    }
}
