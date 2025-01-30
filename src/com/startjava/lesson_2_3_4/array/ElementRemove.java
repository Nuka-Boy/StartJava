package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ElementRemove {
    public static void main(String[] args) {
        float[] randomArray = generateRandomArray();
        System.out.println("Исходный массив: ");
        printArray(randomArray);
        removeIndex(randomArray, 1);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray);
        countZeroElements(randomArray);

        float[] randomArray2 = generateRandomArray();
        System.out.println("Исходный массив: ");
        printArray(randomArray2);
        removeIndex(randomArray2, 15);

        float[] randomArray3 = generateRandomArray();
        System.out.println("Исходный массив: ");
        printArray(randomArray3);
        removeIndex(randomArray3, 0);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray3);
        countZeroElements(randomArray3);

        float[] randomArray4 = generateRandomArray();
        System.out.println("Исходный массив: ");
        printArray(randomArray4);
        removeIndex(randomArray4, 14);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray4);
        countZeroElements(randomArray4);
    }

    private static float[] generateRandomArray() {
        float[] array = new float[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }

    private static void printArray(float[] array) {
        int elementPerLine = 8;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f", array[i]);
            if ((i + 1) % elementPerLine == 0 || i == array.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }

    private static void removeIndex(float[] array, int index) {
        if (index >= 0 && index < array.length) {
            double compareNumber = array[index];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > compareNumber) {
                    array[i] = 0.0f;
                }
            }
            System.out.printf("В массиве под выбранным индексом " + index + " находится число %.3f ",
                    array[index]);
        } else {
            System.out.println("Индекс " + index + " выходит за пределы массива.\n");
        }
    }

    private static void countZeroElements(float[] array) {
        int count = 0;
        for (double value : array) {
            if (value == 0.0) {
                count++;
            }
        }
        System.out.println("Количество обнуленных ячеек в массиве = " + count + "\n");
    }
}
