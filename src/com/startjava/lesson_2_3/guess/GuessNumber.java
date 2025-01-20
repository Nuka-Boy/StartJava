package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private Scanner scanner;
    private Player player1;
    private Player player2;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    public void start() {
        scanner = new Scanner(System.in);
        Player currentPlayer = player1;
      
        while (true) {
            int number;
            String resultGuess;
            number = getInputPlayer(currentPlayer.getName());
            resultGuess = checkGuess(number);
            if (resultGuess.equals("Вы угадали!")) {
                System.out.println("Игрок " + currentPlayer.getName() + " победил!");
                return;
            } 
            System.out.println(resultGuess + " Ход следующего игрока"); 
            currentPlayer = (currentPlayer == player1) ? player2 : player1;  
        }
    }

    private int getInputPlayer(String playerName) {           
        while (true) {
            System.out.println("\nИгрок " + playerName + ", введите число от 1 до 100: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите целое число");
                scanner.next();
                continue;
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number < 1 || number > 100) {
                System.out.println("Некорректное число. Должно быть от 1 до 100");
                continue;
            }    
            return number;             
        }
    }
    
    private String checkGuess(int number) {
        if (number > randomNumber) {
            return "Введенное число больше загаданного";
        } 
        if (number < randomNumber) {
            return "Введенное число меньше загаданного";
        }
        return "Вы угадали!";
    }  
}