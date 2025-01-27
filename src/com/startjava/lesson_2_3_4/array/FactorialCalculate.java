package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class FactorialCalculate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateFactorial()));
        //System.out.println(Arrays.toString(calculateFactorial(null)));
        System.out.println(Arrays.toString(calculateFactorial(8, 0, 9)));
        System.out.println(Arrays.toString(calculateFactorial(-3, -1, 7, 13)));
        System.out.println(Arrays.toString(calculateFactorial(-22, -0)));
    }

    public static String[] calculateFactorial(int... args) {
        String[] resultArray = new String[args.length];
        int n = 0;
        for (int number : args) {
                resultArray[n] = (number < 0) ? "Ошибка: факториал " + number + "! не определен" : formatFactorial(number);
                n++;
        }
        return resultArray;
    }

    public static String formatFactorial(int number) {
        long result = 1;
        String expression = number + "! = ";
        for (int i = 1; i <= number; i++) {
            result *= i;
            expression += i;
            if (i < number) {
                expression += "*";
            }
        }
        expression += " = " + result;
        return expression;
    }
}


