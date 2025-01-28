package com.startjava.lesson_2_3_4.array;

public class Reverser {
    public static void main(String[] args) {
        int[] array1 = {};
        System.out.print("   До реверса: ");
        printArray(array1);
        reverseArray(array1);
        System.out.print("После реверса: ");
        printArray(array1);
        int[] array2 = null;
        System.out.print("   До реверса: ");
        printArray(array2);
        reverseArray(array2);
        System.out.print("После реверса: ");
        printArray(array2);
        int[] array3 = {6, 8, 9, 1};
        System.out.print("   До реверса: ");
        printArray(array3);
        reverseArray(array3);
        System.out.print("После реверса: ");
        printArray(array3);
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};
        System.out.print("   До реверса: ");
        printArray(array4);
        reverseArray(array4);
        System.out.print("После реверса: ");
        printArray(array4);
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

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
