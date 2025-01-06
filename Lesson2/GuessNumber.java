import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private Scanner scanner;
    private Player player1;
    private Player player2;
    
    public GuessNumber(Player player1, Player player2) {
        this.scanner = new Scanner(System.in);
        this.player1 = player1;
        this.player2 = player2;
    }

    public GuessNumber() {
        this.scanner = new Scanner(System.in);
    }

    public String start() {
        int number;
        String result;
        Player currentPlayer;
        randomNumber = (int) (Math.random() * 100) + 1;

        while (true) {
            for (int i = 0; i < 2; i++) {
                currentPlayer = (i == 0) ? player1 : player2;
                System.out.println("\nИгрок " + currentPlayer.getName() + ", введите число от 1 до 100: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Некорректный ввод. Введите целое число");
                    scanner.next();
                    continue;
                }
                number = scanner.nextInt();

                if (number < 1 || number > 100) {
                    System.out.println("Некорректное число. Должно быть от 1 до 100");
                    scanner.next();
                    continue;
                }

                result = checkGuess(number, randomNumber);
                if (result.equals("Вы угадали!")) {
                    return "Игрок " + currentPlayer.getName() + " победил!";
                } else {
                    System.out.println(result + " Ход следующего игрока");
                }
            }
        }
    }
 
    public void closeScanner() {
        scanner.close();
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
}