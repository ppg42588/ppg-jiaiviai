package com.ppg.vedio.itheima_06;

/*
    学生 JavaBean

    成员变量使用 private 修饰
    提供每一个成员变量对应的 setXxx() / getXxx()
    提供一个无参构造方法
 */
public class Student {
    private String name;
    private int age;

    public Student(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
