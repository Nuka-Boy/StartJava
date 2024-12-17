import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int randomNumber = random.nextInt(100) + 1;
        int guessNumber = scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            if (guessNumber == randomNumber) {
                System.out.println("Вы победили!");
                break;
            } else {
                if (guessNumber > randomNumber) {
                    System.out.println(guessNumber + " больше того, что загадал компьютер");
                    System.out.println("Попробуйте ещё: ");
                    guessNumber = scanner.nextInt();
                } else {
                    System.out.println(guessNumber + " меньше того, что загадал компьютер");
                    System.out.println("Попробуйте ещё: ");
                    guessNumber = scanner.nextInt();
                }
            }   
        }
    }
}