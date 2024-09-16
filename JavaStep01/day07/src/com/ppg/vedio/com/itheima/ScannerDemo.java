package com.ppg.vedio.com.itheima;

import java.util.Scanner;

/*
    Scanner的基本使用
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //Scanner(InputStream source)：创建 Scanner 对象
        Scanner sc = new Scanner(System.in);

        //int nextInt()：获取一个int类型的数据
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();

        //输出获取到的数据
        System.out.println("你输入的数据是：" + i);
    }
}