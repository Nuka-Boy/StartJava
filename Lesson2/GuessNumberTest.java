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
            int randomNumber = random.nextInt(1, 100);
            while (true) {
                System.out.println("\nигрок " + firstPlayer.getName() + ", введите число от 1 до 100: ");
                int inputNumber = scanner.nextInt();
                firstPlayerGuess.setNumber(inputNumber);
                if (firstPlayerGuess.getNumber() != randomNumber) {  
                    if (firstPlayerGuess.getNumber() > randomNumber) {
                        System.out.print(firstPlayerGuess.getNumber() + 
                                    " больше того, что загадал компьютер" + "\nХод следующего игрока ");    
                    } else {
                        System.out.print(firstPlayerGuess.getNumber() + 
                                    " меньше того, что загадал компьютер" + "\nХод следующего игрока ");
                    }    
                } else {
                    System.out.println("Игрок " + firstPlayer.getName() + " победил!");
                    break;
                }
                System.out.println("\nигрок " + secondPlayer.getName() + ", введите число от 1 до 100: ");
                inputNumber = scanner.nextInt();
                secondPlayerGuess.setNumber(inputNumber);
                if (secondPlayerGuess.getNumber() != randomNumber) {  
                    if (secondPlayerGuess.getNumber() > randomNumber) {
                        System.out.print(secondPlayerGuess.getNumber() + 
                                    " больше того, что загадал компьютер" + "\nХод следующего игрока ");    
                    } else {
                        System.out.print(secondPlayerGuess.getNumber() + 
                                    " меньше того, что загадал компьютер" + "\nХод следующего игрока ");
                    }      
                } else {
                    System.out.println("Игрок " + secondPlayer.getName() + " победил!");
                    break;
                }
            }
            do {
                exitInput = scanner.nextLine();
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
            } while (!exitInput.equals("yes") && !exitInput.equals("no"));
        }
    }
}