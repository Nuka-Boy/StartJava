import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int randomNumber = random.nextInt(1, 100);
        int guessNumber = scanner.nextInt();
        boolean isGuessed = true;
        while (isGuessed) {
            if (guessNumber == randomNumber) {  
                isGuessed = false;
            } else {
                if (guessNumber > randomNumber) {
                    System.out.println(guessNumber + " больше того, что загадал компьютер");
                    System.out.println("Попробуйте ещё: ");
                } else {
                    System.out.println(guessNumber + " меньше того, что загадал компьютер");
                    System.out.println("Попробуйте ещё: "); 
                }
                guessNumber = scanner.nextInt();
            }   
        } 
        System.out.println("Вы победили!");
    }
}