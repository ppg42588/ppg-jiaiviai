package com.ppg.vedio;

/*
    需求：世界最高峰珠穆朗玛峰(8848.86m)，我现在有一张足够大的纸张，厚度为：0.001m。
         请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
 */
public class WhileTest02 {
    public static void main(String[] args) {
        //1:定义统计变量，初始化值为0
        int count = 0;

        //2:定义纸张厚度变量和珠峰高度变量
        double paper = 0.001;
        double zf = 8848.86;

        //3:用while循环实现反复折叠，判断条件是纸张厚度小于珠峰高度
        while (paper < zf) {
            //4:循环体中要做两件事情：一是纸张厚度加倍，二是统计变量+1
            paper *= 2;

            count++;
        }

        //5:当循环结束，输出统计变量的值
        System.out.println("要折叠" + count + "次");
    }
}
