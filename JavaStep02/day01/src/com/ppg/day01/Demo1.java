package com.ppg.day01;

import com.ppg.myclass.People;
import com.ppg.myclass.Student;
import com.ppg.myclass.Teacher;

public class Demo1 {
    public static void main(String[] args) {
        People student = new Student();
        People teacher = new Teacher();
        student.scanClass();
        System.out.println(student.getName()+teacher.getName());
    }
}
