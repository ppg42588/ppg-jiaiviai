package com.ppg.vedio.itheima_04;

public class Student {
    //成员变量
    private String name;
    private int age;

//    public void setName(String n) {
//        name = n;
//    }

    public void setName(String name) {
//        name = name;
        this.name = name;
    }

    public String getName() {
        return name;
//        return this.name;
    }

//    public void setAge(int a) {
//        age = a;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
