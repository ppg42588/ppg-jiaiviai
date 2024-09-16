package com.ppg.day08;

import java.util.Random;

public class Demo6 {
    public static void main(String[] args) {
        // 二维数组打乱
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int indexX=random.nextInt(arr[i].length);
                int indexY= random.nextInt(arr.length);
                int temp=arr[i][j];
                arr[i][j]=arr[indexY][indexX];
                arr[indexY][indexX]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
