import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String inputName = scanner.nextLine();
        Player firstPlayer = new Player(inputName);
        System.out.println("Введите имя второго игрока: ");
        inputName = scanner.nextLine();
        Player secondPlayer = new Player(inputName);
        String inputExit = "";

        while (!inputExit.equals("no")) {
            GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
            System.out.println(guessNumber.start());

            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
                inputExit = scanner.nextLine();
            } while (!inputExit.equals("yes") && !inputExit.equals("no"));     
        }
        scanner.close();
    }
}