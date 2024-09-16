package com.ppg.vedio.itheima_06;

/*
    测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("林青霞");
        s.setAge(30);

        System.out.println(s.getName() + "," + s.getAge());
    }
}
