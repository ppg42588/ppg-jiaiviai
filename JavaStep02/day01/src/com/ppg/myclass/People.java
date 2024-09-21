package com.ppg.myclass;

public class People extends Object {
    private String name;            // 姓名
    private int age;                    // 年龄
    private String id;                 // 证件编号
    private String sex;               // 性别
    private String className;   // 课程名称

    public People() {
    }

    public People(String name, int age, String id, String sex, String className) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // 查询课表
    public void scanClass(){
        System.out.println("查看课表");
    }
}
