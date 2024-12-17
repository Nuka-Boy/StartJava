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
        int result = 1;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
        } else if (operation == '^') {
            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
        }
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}