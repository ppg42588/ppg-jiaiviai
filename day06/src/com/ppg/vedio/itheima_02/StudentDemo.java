package com.ppg.vedio.itheima_02;
/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //给成员变量赋值
        s.name = "林青霞";
        s.age = 30;

        System.out.println(s.name+","+s.age);

        //调用成员方法
        s.study();
        s.doHomework();
    }
}
