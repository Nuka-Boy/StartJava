package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayReverser {
    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = null;
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};

        reverseArray(array1);
        reverseArray(array2);
        reverseArray(array3);
        reverseArray(array4);
    }

    public static void reverseArray(int[] array) {
        if (array == null) {
            System.out.println("  Массив: null");
            return;
        }

        System.out.print("До реверса: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int left = 0;
        int right = array.length - 1;
        while (left< right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.print("После реверса: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
