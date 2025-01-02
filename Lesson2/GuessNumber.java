import java.util.Random;

public class GuessNumber {
    private int randomNumber;
    private int number;
    private Random random;

    public GuessNumber() {
        random = new Random();
        randomNumber = random.nextInt(1, 100); 
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int generateRandomNumber() {
        return randomNumber;
    }

    public String checkGuess(int guess) {
        if (guess == randomNumber) {
            return "Вы угадали!";
        } else if (guess > randomNumber) {
            return guess + " больше загаданного числа.";
        } else {
            return guess + " меньше загаданного числа.";
        }
    }   
}

