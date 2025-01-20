package com.startjava.lesson_1.final_;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int randomNumber = random.nextInt(1, 100);
        int guessNumber = scanner.nextInt();
        while (guessNumber != randomNumber) {  
            if (guessNumber > randomNumber) {
                System.out.print(guessNumber + " больше того, что загадал компьютер" + 
                        "\nПопробуйте ещё: ");    
            } else {
                System.out.print(guessNumber + " меньше того, что загадал компьютер" + 
                        "\nПопробуйте ещё: "); 
            }
            guessNumber = scanner.nextInt();   
        }
        System.out.println("Вы победили!");
    }
}