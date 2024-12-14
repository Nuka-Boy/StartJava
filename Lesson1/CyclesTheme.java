public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        System.out.print("В отрезке [" + startSegment + ", " + endSegment);
        do {
            if (startSegment % 2 == 0) {
                evenNumbersSum += startSegment;
            } else {
                oddNumbersSum += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.print("] сумма четных чисел = " + evenNumbersSum + " а нечетных = " + oddNumbersSum);
    
        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int maxValue = number1;
        int minValue = number1;
        if (number2 < minValue) {
            minValue = number2;
        }
        if (number3 < minValue) {
            minValue = number3;
        }
        if (number2 > maxValue) {
            maxValue = number2;
        }
        if (number1 > maxValue) {
            maxValue = number1;
        }
        System.out.print("(");
        for (int i = maxValue - 1; i >= minValue + 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(")");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int originNumber = 1234;
        int digitsSum = 0;
        System.out.print("Исходное число " + originNumber + " в обратном порядке: "); 
        while (originNumber > 0) {
            int digit = originNumber % 10;
            System.out.print(digit);
            digitsSum += digit;
            originNumber /= 10;
        }
        System.out.println("\nСумма выделенных цифр: " + digitsSum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int digitsInLine = 5;
        int count = 1;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count > digitsInLine) {
                    System.out.println();
                    count = 1;
                }
            }
        }
        if (count <= digitsInLine && count > 1) {
            for (int i = count; i <= digitsInLine; i++)
                System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int originalNumber = 3242592;
        int currNumber = originalNumber;
        int twosNumber = 0;
        while (originalNumber > 0) {
            if (originalNumber % 10 == 2) {
                twosNumber++;
            }
            originalNumber /= 10;
        }
        if (twosNumber % 2 == 0) {
            System.out.println("В " + currNumber + " четное (" + twosNumber + ") количество двоек");
        } else {
            System.out.println("В " + currNumber + " нечетное (" + twosNumber + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        int charactersInLine = 1;
        int starsInLine = 10;
        for (int i = 1; i < 51; i++) {
            System.out.print("*");
            charactersInLine++;
            if (charactersInLine > starsInLine) {
                System.out.println();
                charactersInLine = 1;
            }
        }

        System.out.println();
        int numbersInLine = 5;
        while (charactersInLine <= numbersInLine) {
            System.out.print("#");
            charactersInLine++;
            if (charactersInLine > numbersInLine) {
                System.out.println();
                charactersInLine = 1;
                numbersInLine--;
            }        
        }

        System.out.println();
        int maxWidth = 3;
        int counterLines = 2 * maxWidth - 1;
        int amountLines = 1;
        int addition = 1;
        int width = 1;
        do {
            int i = 0;
            do {
                System.out.print("$");
            } while (++i < width);
            System.out.println();
            if (amountLines == maxWidth) {
                addition = -1; 
            }
            width += addition;
        } while (amountLines++ < counterLines);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("   DECIMAL   CHARACTER   DESCRIPTION");
        for (int i = 33; i < 47; i++) { // Идем от 33 до 127
            if (i % 2 != 0) { // Если код нечётный
                System.out.printf("%8d %9c            %-20s%n", i, (char) i, Character.getName((char) i));
            }
        }
        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%8d %9c            %-20s%n", j, (char) j, Character.getName((char) j));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        String palindromNumber = "1234321";
        boolean isPalindrom = true;
        for (int i = 0; i < palindromNumber.length() / 2; i++) {
            if (palindromNumber.charAt(i) != palindromNumber.charAt(palindromNumber.length() - i - 1)) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) {
            System.out.println("Число " + palindromNumber + "- палиндром");
        } else {
            System.out.println("Число " + palindromNumber + "- не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNumber = 123321;
        int firsDigit = (luckyNumber / 100000) % 10;
        int secondDigit = (luckyNumber / 10000) % 10;
        int thirdDigit = (luckyNumber / 1000) % 10;
        int fourDigit = (luckyNumber / 100) % 10;
        int fiveDigit = (luckyNumber / 10) % 10;
        int sixDigit = luckyNumber % 10;
        int firstSum = firsDigit + secondDigit + thirdDigit;
        int secondSum = fourDigit + fiveDigit + sixDigit;
        System.out.println(firsDigit + " " + secondDigit + " " + thirdDigit);
        if (firstSum == secondSum) {
            System.out.printf("Число %d - счастливое%nСумма цифр %d%d%d = %d%nСумма %d%d%d = %d", 
                    luckyNumber, firsDigit, secondDigit, thirdDigit, firstSum, fourDigit, fiveDigit,
                    sixDigit, secondSum);
        } else {
            System.out.printf("Число %d - не счастливое%nСумма цифр %d%d%d = %d%nСумма %d%d%d = %d", 
                    luckyNumber, firsDigit, secondDigit, thirdDigit, firstSum, fourDigit, fiveDigit,
                    sixDigit, secondSum);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 2) {
                for (int k = 1; k < 30; k++) {
                    System.out.print("_");
                }
                System.out.println();
            }
            for (int j = 1; j < 10; j++) {
                if (j == 2) {
                    System.out.print("|");   
                }
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }
}