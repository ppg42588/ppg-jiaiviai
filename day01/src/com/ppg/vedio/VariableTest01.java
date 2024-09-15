package com.ppg.vedio;

/*
    手机信息描述
 */
public class VariableTest01 {
    public static void main(String[] args) {
        //定义秒杀价变量
        double price = 3599.00;

        //定义颜色变量
        String color = "蓝色";

        //定义版本变量，纪录的是内存大小
        int size = 8;

//        System.out.println(price);
//        System.out.println(color);
//        System.out.println(size);

        //为了输出效果好看一些，我加上一些内容
        System.out.println("秒杀价是："+price);
        System.out.println("你选择的颜色是："+color);
        System.out.println("你选择的版本是："+size);

        //字符串字面值+任意的数据=字符串数据
    }
}
