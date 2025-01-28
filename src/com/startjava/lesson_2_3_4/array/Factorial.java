package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        showFactorial();
        //  System.out.println(Arrays.toString(calculateFactorial(null)));
        showFactorial(8, 0, 9);
        showFactorial(-3, -1, 7, 13);
        showFactorial(-22, -0);
    }

    public static void showFactorial(int... args) {
        for (int number : args) {
            System.out.println((number < 0) ? "Ошибка: факториал " + number + "! не определен"
                    : calculateFactorial(number));
        }
    }

    public static String calculateFactorial(int number) {
        if (number == 0) {
            return "0! = 1";
        }
        long result = 1;
        String factorialString = number + "! = ";
        for (int i = 1; i <= number; i++) {
            result *= i;
            factorialString += i;
            if (i < number) {
                factorialString += "*";
            } else {
                factorialString += " = " + result;
            }
        }
        return factorialString;
    }
}


