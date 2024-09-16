package com.ppg.day08;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        // 打乱一维数组的元素'
        int[]arr={0,1,2,3,4,5,6,7,8,9};
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=random.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
