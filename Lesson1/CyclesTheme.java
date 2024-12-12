public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int firstSegmentNumber = -10;
        int finalSegmentNumber = 21;
        int evenDigitsSum = 0;
        int oddDigitsSum = 0;
        System.out.print("В отрезке [" + firstSegmentNumber + ", " + finalSegmentNumber);
        do {
            if (firstSegmentNumber % 2 == 0) {
                evenDigitsSum += firstSegmentNumber;
            } else {
                oddDigitsSum += firstSegmentNumber;
            }
            firstSegmentNumber++;
        } while (firstSegmentNumber != finalSegmentNumber);
        System.out.print("] сумма четных чисел = " + evenDigitsSum + " а нечетных = " + oddDigitsSum);
    
        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int firstDigit = 10;
        int secondDigit = 5;
        int thirdDigit = -1;
        int minValue = 0;
        System.out.print("[");
        if (firstDigit <= secondDigit && secondDigit <= thirdDigit) {
            minValue = firstDigit;
            for (int i = firstDigit; i < secondDigit || i < thirdDigit; i++) {
                System.out.print(i + " ");
            }
        } else if (secondDigit < firstDigit && firstDigit <= thirdDigit) {
            minValue = secondDigit;
            for (int i = secondDigit; i < firstDigit || i < thirdDigit; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = thirdDigit; i < firstDigit || i < secondDigit; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число " + number + " в обратном порядке: "); 
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigits += digit;
            number = number / 10;
        }
        System.out.println("\nСумма выделенных цифр: " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int count = 1;
        for (int j = 1; j < 24; j++) {
            if (j % 2 != 0) {
                System.out.printf("%3d", j);
                count++;
                if (count > 5) {
                    System.out.println();
                    count = 1;
                }
            }
        }
        if (count <= 5 && count > 1) {
            for (int k = count; k <= 5; k++)
                System.out.printf("%3d", 0);
        }
    }
}