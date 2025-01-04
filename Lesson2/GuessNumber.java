import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private int number;
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