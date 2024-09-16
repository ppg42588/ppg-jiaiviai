package com.ppg.day08;

public class Demo2 {
    public static void main(String[] args) {
        // 获取最值
        int[]arr={3,5,2,7,5,9,2,0,1,5,23,5,-10};
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
        System.out.println("最大值为:"+max+"\n最小值为:"+min);
    }
}
