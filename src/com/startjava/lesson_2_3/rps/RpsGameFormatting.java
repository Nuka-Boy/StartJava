package com.startjava.lesson_2_3.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        String name1 = inputName(console);
        String name2 = inputName(console);
        int position = generatePosition(name1, r);
        String sign1 = determineSign(position);
        showSigns(sign1);
        position = generatePosition(name2, r);
        String sign2 = determineSign(position);
        showSigns(sign2);
        determineWinner(name1, sign1, name2, sign2);
        console.close();          
    }

    private static final String Rock = "R";
    private static final String Scissors = "S";
    private static final String Paper = "P";

    private static String inputName(Scanner console) {
        System.out.println("Введите имя игрока: ");
        return console.nextLine();
    }

    private static int generatePosition(String name1, Random r) {
        System.out.println("Ход " + name1 + ": ");
        return r.nextInt(1, 101);
    }

    private static String determineSign(int position) {
        String sign = Rock;
        if (position > 66) {
            sign = Scissors;
        }
        else if (position > 33) {
            sign = Paper;
        }
        return sign;
    }

    private static void showSigns(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(Rock + "\r");
            Thread.sleep(100);
            System.out.print(Scissors + "\r");
            Thread.sleep(100);
            System.out.print(Paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign);
    }

    private static void determineWinner(String name1, String sign1, String name2, String sign2) {
        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }
        boolean isEqualName1 = sign1.equals(Rock) && sign2.equals(Scissors) || 
                sign1.equals(Scissors) && sign2.equals(Paper) ||
                sign1.equals(Paper) && sign2.equals(Rock);

        if (isEqualName1) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }
}