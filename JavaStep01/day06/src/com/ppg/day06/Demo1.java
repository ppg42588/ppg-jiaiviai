package com.ppg.day06;

import com.ppg.day06.myclass.Water;

public class Demo1 {
    public static void main(String[] args) {
        Water water = new Water("Media", 3, "手动", "red", 5);
        System.out.println(water.printWater());
    }
}
