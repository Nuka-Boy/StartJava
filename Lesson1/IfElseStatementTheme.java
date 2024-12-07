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
        int digit = -90;
        if (digit > 0) {
            System.out.printf("%d является положительным%s", digit, 
                    digit % 2 == 0 ? " и четным" : " и нечетным");
        } else if (digit < 0) {
            System.out.printf("%d является отрицательным%s", digit, 
                    digit % 2 == 0 ? " и четным" : " и нечетным");
        } else {
            System.out.println(digit + " = 0");
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int firstDigit = 123;
        int secondDigit = 223;
        System.out.println("Исходные числа: y = " + firstDigit + ", z = " + secondDigit);

        int oneY = firstDigit % 10;
        int oneZ = secondDigit % 10;
        int tenY = firstDigit % 100 / 10;
        int tenZ = secondDigit % 100 / 10;
        int thousandY = firstDigit / 100;
        int thousandZ = secondDigit / 100;

        if (!(oneY == oneZ) && !(tenY == tenZ) && !(thousandY == thousandZ)) {
            System.out.println("Равных чисел нет");
            return;
        } else {
            if (oneY == oneZ) {
                System.out.println("В 1 разряде равны числа " + oneY);
            }
            if (tenY == tenZ) {
                System.out.println("Во 2 разряде равны числа " + tenY);
            }
            if (thousandY == thousandZ) {
                System.out.println("В 3 разряде равны числа " + thousandY);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char myChar = '\u0031';
        if (myChar >= 'A' && myChar <= 'Z') {
            System.out.printf("%c - большая буква", myChar);
        } else if (myChar >= 'a' && myChar <= 'z') {
            System.out.printf("%c - маленькая буква", myChar);
        } else if (myChar >= '0' && myChar <= '9') {
            System.out.printf("%c - цифра", myChar);
        } else {
            System.out.print(myChar + " - ни буква, ни цифра");
        }

        System.out.println("\n\n6. Подсчет начисленных банком %");
        BigDecimal deposit = new BigDecimal("321123.59");
        BigDecimal firstCompareNumber = new BigDecimal("100000");
        BigDecimal secondCompareNumber = new BigDecimal("300000");
        int compareWithFirst = deposit.compareTo(firstCompareNumber);
        int compareWithSecond = deposit.compareTo(secondCompareNumber);
        BigDecimal percent;
        if (compareWithFirst < 0) {
            percent = new BigDecimal(0.05).multiply(deposit); 
        } else if (compareWithFirst > 0 && compareWithSecond < 0) {
            percent = new BigDecimal(0.07).multiply(deposit);
        } else {
            percent = new BigDecimal(0.1).multiply(deposit);
        }
        BigDecimal result = deposit.add(percent);
        System.out.println("Сумма вклада = " + deposit + " RUB" + "\n" + 
                "Сумма начисленного процента = " + percent.setScale(2, RoundingMode.HALF_UP) + " RUB" + 
                "\n" + "Итоговая сумма = " + result.setScale(2, RoundingMode.HALF_UP) + " RUB");
    }
}