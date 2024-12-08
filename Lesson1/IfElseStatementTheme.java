import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "Мужчина";
        if (gender != "Мужчина") {
            System.out.println("Ваш пол - женский");
        } else {
            System.out.println("Ваш пол - мужской");
        }
        int age = 12;
        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }
        double height = 1.7;
        if (height < 1.8) {
            System.out.println("Ваш рост ниже 1.8 метра");
        } else {
            System.out.println("Ваш рост выше 1.8 метра");
        }
        String name = "Viktor";
        char firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается на М");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается на " + firstNameLetter);
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 321;
        int b = 123;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int originNumber = 32;
        if (originNumber == 0) {
            System.out.println(originNumber + " = 0");
        } else {
            if (originNumber < 0) { 
                System.out.print(originNumber + " является отрицательным и ");
            } else if (originNumber > 0) {
                System.out.print(originNumber + " является положительным и ");
            }
            if (originNumber % 2 == 0) {
                System.out.printf("четным");
            } else {
                System.out.printf("нечетным");
            } 
        }
  
        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int x = 123;
        int y = 223;
        System.out.println("Исходные числа: y = " + x + ", z = " + y);
        int onesX = x % 10;
        int onesY = y % 10;
        int tensX = x % 100 / 10;
        int tensY = y % 100 / 10;
        int hundredsX = x / 100;
        int hundredsY = y / 100;
        if (!(onesX == onesY) && !(tensX == tensY) && !(hundredsX == hundredsY)) {
            System.out.println("Равных чисел нет");
        } else {
            if (onesX == onesY) {
                System.out.println("В 1 разряде равны числа " + onesX);
            }
            if (tensX == tensY) {
                System.out.println("Во 2 разряде равны числа " + tensX);
            }
            if (hundredsX == hundredsY) {
                System.out.println("В 3 разряде равны числа " + hundredsX);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char unknownChar = '\u0031';
        if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.printf("%c - большая буква", unknownChar);
        } else if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.printf("%c - маленькая буква", unknownChar);
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.printf("%c - цифра", unknownChar);
        } else {
            System.out.print(unknownChar + " - ни буква, ни цифра");
        }

        System.out.println("\n\n6. Подсчет начисленных банком %");
        BigDecimal deposit = new BigDecimal("321123.59");
        int compareWithFirst = deposit.compareTo(BigDecimal.valueOf(100_000));
        int compareWithSecond = deposit.compareTo(BigDecimal.valueOf(300_000));
        BigDecimal percent = BigDecimal.valueOf(0.1).multiply(deposit);
        if (compareWithFirst < 0) {
            percent = BigDecimal.valueOf(0.05).multiply(deposit); 
        } else if (compareWithFirst > 0 && compareWithSecond < 0) {
            percent = BigDecimal.valueOf(0.07).multiply(deposit);
        } 
        BigDecimal result = deposit.add(percent);
        System.out.println("Сумма вклада = " + deposit + " RUB" + "\n" + 
                "Сумма начисленного процента = " + percent.setScale(2, RoundingMode.HALF_UP) + " RUB" + 
                "\n" + "Итоговая сумма = " + result.setScale(2, RoundingMode.HALF_UP) + " RUB");

        System.out.println("\n7. Определение оценки по предметам");
        double historyMark = 5;
        int historyPercent = 59;
        if (historyPercent <= 60) {
            historyMark = 2; 
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        }
        System.out.println("История: " + historyMark);
        int programmingPercent = 92;
        double programmingMark = 5;
        if (programmingPercent <= 60) {
            programmingMark = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        }
        System.out.println("Программирование: " + programmingMark);
        double averageMark = (historyMark + programmingMark) / 2;
        double averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("Средний балл по предметам: " + averageMark);
        System.out.println("Средние проценты по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        BigDecimal saleInMonth = new BigDecimal("13025.233");
        BigDecimal rentCost = new BigDecimal("5123.018");
        BigDecimal priceCost = new BigDecimal("9001.729");
        BigDecimal monthNumbers = BigDecimal.valueOf(12);
        BigDecimal annualProfit = (((saleInMonth.multiply(monthNumbers))
                .subtract(priceCost.multiply(monthNumbers)))
                .subtract(rentCost.multiply(monthNumbers))).setScale(2, RoundingMode.HALF_UP);
        if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else if (annualProfit.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}