package com.ppg.day07;

import java.util.Random;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getRandomArray(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(array[i] + " ");
        }

    }

    static int[] getRandomArray(int start, int end, int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(end - start) + start;
        }
        return array;
    }

}
