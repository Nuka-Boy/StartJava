import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        final int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите одну операцию из  +, -, *, /, ^, %");
        char operation = scanner.next().charAt(0);
        scanner.close();
        int answerDigit = 1;
        if (operation == '+') {
            answerDigit = firstNumber + secondNumber;
        } else if (operation == '-') {
            answerDigit = firstNumber - secondNumber;
        } else if (operation == '*') {
            answerDigit = firstNumber * secondNumber;
        } else if (operation == '/') {
            answerDigit = firstNumber / secondNumber;
        } else if (operation == '%') {
            answerDigit = firstNumber % secondNumber;
        } else if (operation == '^') {
            for (int i = 0; i < secondNumber; i++) {
                answerDigit *= firstNumber;
            }
        }
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answerDigit);
    }
}