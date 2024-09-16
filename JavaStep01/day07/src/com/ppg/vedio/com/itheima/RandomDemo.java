package com.ppg.vedio.com.itheima;

import java.util.Random;

/*
    Random的基本使用
 */
public class RandomDemo {
    public static void main(String[] args) {
        //Random()：创建一个新的随机数生成器
        Random r = new Random();

        //int nextInt(int bound)：获取一个int类型的随机数，参数bound表示获取到的随机数在[0,bound)之间
//        int i = r.nextInt(10);
//        System.out.println(i);

//        for (int i=1; i<=10; i++) {
//            int j = r.nextInt(10);
//            System.out.println(j);
//        }

        //需求：如何获取1-100之间的随机数呢？
//        int number = r.nextInt(100);//0-99
//        int number = r.nextInt(101);//0-100
        int number = r.nextInt(100) + 1;
        System.out.println(number);
    }
}
