package com.ppg.day04;

public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1970; i <2024 ; i++) {
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i);
            }
        }
    }
}
