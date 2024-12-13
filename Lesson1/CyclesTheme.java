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
        int maxValue = 0;
        System.out.print("(");
        if (number1 >= number2 && number2 >= number3) {
            maxValue = number1;
        } else if (number2 > number1 && number1 >= number3) {
            maxValue = number2;
        } else {
            maxValue = number3;
        }
        for (int i = maxValue - 1; i > number1 || i > number2 || i > number3; i--) {
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
        int answerNumber = originalNumber;
        int numberTwos = 0;
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            if (digit == 2) {
                numberTwos += 1;
            }
            originalNumber /= 10;
        }
        if (numberTwos % 2 == 0) {
            System.out.println("В " + answerNumber + " четное (" + numberTwos + ") количество двоек");
        } else {
            System.out.println("В " + answerNumber + " нечетное (" + numberTwos + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        int repeats = 1;
        int starsInLine = 10;
        for (int i = 1; i < 51; i++) {
            System.out.print("*");
            repeats++;
            if (repeats > starsInLine) {
                System.out.println();
                repeats = 1;
            }
        }

        System.out.println();
        int hashInLine = 5;
        while (repeats <= hashInLine) {
            System.out.print("#");
            repeats++;
            if (repeats > hashInLine) {
                System.out.println();
                repeats = 1;
                hashInLine--;
            }        
        }

        System.out.println();
        int maxWidth = 3;
        int amountLines = 2 * maxWidth - 1;
        int counterLines = 1;
        int add = 1;
        int width = 1;
        do {
            int i = 0;
            do {
                System.out.print("$");
            } while (++i < width);
            System.out.println();
            if (counterLines == maxWidth) {
                add = -1; 
            }
            width += add;
        } while (counterLines++ < amountLines);

        System.out.println("\n7. Вывод ASCII-символов");
    }
}