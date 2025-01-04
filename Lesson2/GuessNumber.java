import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private int number;
    private Scanner scanner;
    private Random random;

    public GuessNumber(int randomNumber) {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.randomNumber = randomNumber;
    }

    public int generateRandomNumber() {
        return randomNumber = random.nextInt(100) + 1;
    }

    public String makeGuess(String playerName) {
        while (true) {
            System.out.println("\nИгрок " + playerName + ", введите число от 1 до 100: ");
            int inputNumber = scanner.nextInt();
            this.number = inputNumber;
            String result = checkGuess();
            if (result.equals("Вы угадали!")) {
                return result;
            } else {
                System.out.println(result + " Ход следующего игрока");
                return result;
            }
        }
    }
 
    private String checkGuess() {
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