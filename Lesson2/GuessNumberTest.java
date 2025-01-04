import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String inputName = "";

        System.out.println("Введите имя первого игрока: ");
        inputName = scanner.nextLine();
        Player firstPlayer = new Player(inputName);
        System.out.println("Введите имя второго игрока: ");
        inputName = scanner.nextLine();
        Player secondPlayer = new Player(inputName);
        String exitInput = "";
        GuessNumber game = new GuessNumber(0);

        while (!exitInput.equals("no")) {
            int randomNumber = game.generateRandomNumber();
            GuessNumber firstPlayerGuess = new GuessNumber(randomNumber);
            GuessNumber secondPlayerGuess = new GuessNumber(randomNumber);
            String result;

            while (true) {
                result = firstPlayerGuess.makeGuess(firstPlayer.getName());
                if (result.equals("Вы угадали!")) {
                    System.out.println("Игрок " + firstPlayer.getName() + " победил!");
                    break;
                }
                result = secondPlayerGuess.makeGuess(secondPlayer.getName());
                if (result.equals("Вы угадали!")) {
                    System.out.println("Игрок " + secondPlayer.getName() + " победил!");
                    break;
                }
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
                exitInput = scanner.nextLine();
            } while (!exitInput.equals("yes") && !exitInput.equals("no"));     
        }
        game.closeScanner();
        scanner.close();
    }
}