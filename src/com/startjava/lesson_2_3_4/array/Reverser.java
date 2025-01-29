package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] array1 = {};
        System.out.println("   До реверса: " + Arrays.toString(array1));
        reverseArray(array1);
        System.out.println("После реверса: " + Arrays.toString(array1));

        int[] array2 = null;
        System.out.println("   До реверса: " + Arrays.toString(array2));
        reverseArray(array2);
        System.out.println("После реверса: " + Arrays.toString(array2));

        int[] array3 = {6, 8, 9, 1};
        System.out.println("   До реверса: " + Arrays.toString(array3));
        reverseArray(array3);
        System.out.println("После реверса: " + Arrays.toString(array3));

        int[] array4 = {13, 8, 5, 3, 2, 1, 1};
        System.out.println("   До реверса: " + Arrays.toString(array4));
        reverseArray(array4);
        System.out.println("После реверса: " + Arrays.toString(array4));
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
}
