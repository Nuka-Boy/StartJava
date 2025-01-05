import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private Scanner scanner;
    private Player player1;
    private Player player2;
    
    public GuessNumber(int randomNumber, Player player1, Player player2) {
        this.scanner = new Scanner(System.in);
        this.randomNumber = randomNumber;
        this.player1 = player1;
        this.player2 = player2;
    }

    public GuessNumber() {
        this.scanner = new Scanner(System.in);
    }

    public int generateRandomNumber() {
        return randomNumber = (int) (Math.random() * 100) + 1;
    }

    public String startGame() {
        int number;
        String result;
        boolean firstPlayerTurn = true;

        while (true) {
            if (firstPlayerTurn) {
                System.out.println("\nИгрок " + player1.getName() + ", введите число от 1 до 100: "); 
                if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                    if (number >= 1 && number <= 100) {
                        result = checkGuess(number, randomNumber);
                        if (result.equals("Вы угадали!")) {
                            return "Игрок " + player1.getName() + " победил!";
                        } else {
                            System.out.println(result + " Ход следующего игрока");
                            firstPlayerTurn = false;
                        }
                    } else {
                        System.out.println("Некорректное число. Должно быть от 1 до 100");
                        scanner.next();
                    }
                } else {
                    System.out.println("Некорректный ввод. Введите целое число");
                    scanner.next();
                }
            } else {
                System.out.println("\nИгрок " + player2.getName() + ", введите число от 1 до 100");
                if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                    if (number >= 1 && number <= 100) {
                        result = checkGuess(number, randomNumber);
                        if (result.equals("Вы угадали!")) {
                            return "Игрок " + player2.getName() + " победил!";
                        } else {
                            System.out.println(result + " Ход следующего игрока");
                            firstPlayerTurn = true;
                        }
                    } else {
                        System.out.println("Некорректное число. Должно быть от 1 до 100");
                        scanner.next();
                    }
                } else {
                    System.out.println("Некорректный ввод. Введите целое число");
                    scanner.next();
                }
            }
        }
    }
 
    private String checkGuess(int number, int randomNumber) {
        if (number > randomNumber) {
            return "Введенное число больше загаданного";
        } else if (number < randomNumber) {
            return "Введенное число меньше загаданного";
        } else {
            return "Вы угадали!";
        }
    }

    public void closeScanner() {
        scanner.close();
    }   
}