package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        showReverseArray();
        showReverseArray(6, 7, 9, 1);
        showReverseArray(13, 8, 5, 3, 2, 1, 1);
    }

    private static void reverseArray(int[] array) {
        if (array == null) {
            System.out.println("       Массив: null");
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void showReverseArray(int... args) {
        int[] array = new int[args.length];
        int i = 0;
        for (int number : args) {
            array[i] = number;
            i++;
        }
        System.out.println("   До реверса: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("После реверса: " + Arrays.toString(array));
    }
}
