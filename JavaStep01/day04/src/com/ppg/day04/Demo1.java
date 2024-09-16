package com.ppg.day04;

public class Demo1 {
    public static void main(String[] args) {
        int sum1=0;
        for (int i = 0; i <= 10; i++) {
            if(i%3!=0){
                sum1+=i;
            }
        }
        System.out.println(sum1);

        int sum2=0;
        int num=1;
        while(num<=10){
            if(num%3!=0){
                sum2+=num;
            }
            num++;
        }
        System.out.println(sum2);
    }
}
