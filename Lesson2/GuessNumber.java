import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private Scanner scanner;
    private Player player1;
    private Player player2;
    int number;
    
    public GuessNumber(Player player1, Player player2) {
        this.scanner = new Scanner(System.in);
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    public void start() {
        String result;
        Player currentPlayer = player1;
      
        while (true) {
            number = getInput(currentPlayer.getName());
            result = checkGuess(number);
            if (result.equals("Вы угадали!")) {
                System.out.println("Игрок " + currentPlayer.getName() + " победил!");
                return;
            } 
            System.out.println(result + " Ход следующего игрока"); 
            currentPlayer = (currentPlayer == player1) ? player2 : player1;  
        }
    }

    private int getInput(String playerName) {        
        while (true) {
            System.out.println("\nИгрок " + playerName + ", введите число от 1 до 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    return number;
                } else {
                    System.out.println("Некорректное число. Должно быть от 1 до 100");
                }
            } else {
                System.out.println("Некорректный ввод. Введите целое число");
                scanner.next();
            }
        }
    }

    private String checkGuess(int number) {
        if (number > randomNumber) {
            return "Введенное число больше загаданного";
        } else if (number < randomNumber) {
            return "Введенное число меньше загаданного";
        } else {
            return "Вы угадали!";
        }
    }  
}