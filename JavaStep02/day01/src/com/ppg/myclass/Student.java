package com.ppg.myclass;

public class Student extends People{
    public Student(){
        super();
    }
    @Override
    public void scanClass() {
        super.scanClass();
        System.out.println("查看课表st");
    }
}
