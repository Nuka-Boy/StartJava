import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";

        System.out.println("Введите имя первого игрока: ");
        inputName = scanner.nextLine();
        Player firstPlayer = new Player(inputName);
        System.out.println("Введите имя второго игрока: ");
        inputName = scanner.nextLine();
        Player secondPlayer = new Player(inputName);
        String exitInput = "";
        GuessNumber game = new GuessNumber();

        while (!exitInput.equals("no")) {
            int randomNumber = game.generateRandomNumber();
            GuessNumber guessNumber = new GuessNumber(randomNumber, firstPlayer, secondPlayer);
            System.out.println(guessNumber.startGame());

            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
                exitInput = scanner.nextLine();
            } while (!exitInput.equals("yes") && !exitInput.equals("no"));     
        }
        game.closeScanner();
        scanner.close();
    }
}