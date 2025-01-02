import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
        final GuessNumber firstPlayerGuess = new GuessNumber();
        final GuessNumber secondPlayerGuess = new GuessNumber();

        System.out.println("Введите имя первого игрока: ");
        inputName = scanner.nextLine();
        Player firstPlayer = new Player(inputName);
        System.out.println("Введите имя второго игрока: ");
        inputName = scanner.nextLine();
        Player secondPlayer = new Player(inputName);
        String exitInput = "";

        while (!exitInput.equals("no")) {
            int randomNumber = firstPlayerGuess.generateRandomNumber();
            firstPlayerGuess.setNumber(0);
            secondPlayerGuess.setNumber(0);
            while (true) {
                System.out.println("\nигрок " + firstPlayer.getName() + ", введите число от 1 до 100: ");
                int inputNumber = scanner.nextInt();
                firstPlayerGuess.setNumber(inputNumber);
                String result = firstPlayerGuess.checkGuess(inputNumber);
                if (result.equals("Вы угадали!")) {
                    System.out.println("Игрок " + firstPlayer.getName() + " победил!");
                    break;
                } else {
                    System.out.println(result + " Ход следующего игрока");
                }
                System.out.println("\nигрок " + secondPlayer.getName() + ", введите число от 1 до 100: ");
                inputNumber = scanner.nextInt();
                secondPlayerGuess.setNumber(inputNumber);
                result = secondPlayerGuess.checkGuess(inputNumber);
                if (result.equals("Вы угадали!")) {
                    System.out.println("Игрок " + secondPlayer.getName() + " победил!");
                    break;
                } else {
                    System.out.println(result + " Ход следующего игрока");
                }
            }
            do {
                scanner.nextLine();
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
                exitInput = scanner.nextLine();
            } while (!exitInput.equals("yes") && !exitInput.equals("no"));
        }
        scanner.close();
    }
}