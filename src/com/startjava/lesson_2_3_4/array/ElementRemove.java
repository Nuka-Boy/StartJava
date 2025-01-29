package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ElementRemove {
    public static void main(String[] args) {
        double[] randomArray = generateRandomArray();
        System.out.println("Исходный массив: ");
        printArray(randomArray, 8);
        removeIndex(randomArray, 1);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray, 8);
        countZeroElements(randomArray);

        double[] randomArray2 = generateRandomArray();
        printArray(randomArray2, 8);
        removeIndex(randomArray2, 15);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray2, 8);
        countZeroElements(randomArray2);

        double[] randomArray3 = generateRandomArray();
        printArray(randomArray3, 8);
        removeIndex(randomArray3, 0);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray3, 8);
        countZeroElements(randomArray3);

        double[] randomArray4 = generateRandomArray();
        printArray(randomArray4, 8);
        removeIndex(randomArray4, 14);
        System.out.println("\nИзмененный массив: ");
        printArray(randomArray4, 8);
        countZeroElements(randomArray4);
    }

    public static void removeIndex(double[] array, int index) {
        if (index >= 0 && index < array.length) {
            double compareNumber = array[index];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > compareNumber) {
                    array[i] = 0.0;
                }
            }
            System.out.printf("В массиве под выбранным индексом " + index + " находится число %.3f ",
                    array[index]);
        } else {
            System.out.println("Индекс " + index + " выходит за пределы массива.");
        }
    }

    public static double[] generateRandomArray() {
        double[] array = new double[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    public static void printArray(double[] array, int elementPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f", array[i]);
            if ((i + 1) % elementPerLine == 0 || i == array.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void countZeroElements(double[] array) {
        int count = 0;
        for (double value : array) {
            if (value == 0.0) {
                count++;
            }
        }
        System.out.println("Количество обнуленных ячеек в массиве = " + count);
    }
}
