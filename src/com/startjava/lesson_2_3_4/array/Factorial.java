package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        showFactorial();
        //  System.out.println(Arrays.toString(calculateFactorial(null)));
        showFactorial(8, 0, 9);
        showFactorial(-3, -1, 7, 13);
        showFactorial(-22, -0);
    }

    public static void showFactorial(int... args) {
        int[] result = calculateFactorial(args);
        for (int i = 0; i < args.length; i++) {
            if (result[i] != -1) {
                System.out.println(args[i] + "!= " + result[i]);
            }
        }
    }

    public static int[] calculateFactorial(int... args) {
        int[] results = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int number = args[i];
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен");
                results[i] = -1;
            } else {
                results[i] = factorial(number);
            }
        }
        return results;
    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}


