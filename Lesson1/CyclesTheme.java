public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startDigit = -10;
        int finalDigit = 21;
        int evenDigitsSum = 0;
        int oddDigitsSum = 0;
        System.out.print("В отрезке [" + startDigit + ", " + finalDigit);
        do {
            if (startDigit % 2 == 0) {
                evenDigitsSum += Math.abs(startDigit);
            } else {
                oddDigitsSum += Math.abs(startDigit);
            }
            startDigit++;
        } while (startDigit != finalDigit);
        System.out.print("] сумма четных чисел = " + evenDigitsSum + " а нечетных = " + oddDigitsSum);
    
        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int firstDigit = 10;
        int secondDigit = 5;
        int thirdDigit = -1;
        int minValue = 100;
        int maxValue = -100;
        if (firstDigit >= secondDigit && firstDigit >= thirdDigit) {
            maxValue = firstDigit;
            if (secondDigit >= thirdDigit) {
                minValue = thirdDigit;
            } else {
                minValue = secondDigit;
            }
        } else if (secondDigit > firstDigit && secondDigit >= thirdDigit) {
            maxValue = secondDigit;
            if (firstDigit >= thirdDigit) {
                minValue = firstDigit;
            } else {
                minValue = thirdDigit;
            }
        } else {
            minValue = thirdDigit;
            maxValue = firstDigit;
        }
        System.out.print("[");
        for (int i = minValue; i <= maxValue; i++) {
            if (i == firstDigit || i == secondDigit || i == thirdDigit) {
                System.out.print(i + " ");    
            }
        }
        System.out.println("]");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int i = 1;
        int sumDigits = 0; 
        while (i <= 4) {
            sumDigits += i;
            i++; 
        }
        for (int z = 4; z >= 1; z--) {
            System.out.print(z + " ");
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
    }
}