import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
       
        String input = "yes";
        while (!input.equals("no")) {
            System.out.println("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Введите одну операцию из  +, -, *, /, ^, %");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            System.out.println("Ответ = " + calculator.calculate());
            do {
                input = scanner.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            } while (!input.equals("yes") && !input.equals("no")); 
        }
        scanner.close(); 
    }
}