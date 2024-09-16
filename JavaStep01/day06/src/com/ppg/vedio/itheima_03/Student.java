package com.ppg.vedio.itheima_03;

public class Student {
    //成员变量
//    String name;
//    int age;
    private int age;
    private String name;

//    public void setAge(int a) {
////        age = a;
//        if(a<0 || a>120) {
//            System.out.println("你给的年龄有误");
//        } else {
//            age = a;
//        }
//    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
