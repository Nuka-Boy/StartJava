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
            System.out.println("Число a = " + a + ", а число b = " + b + ". Число а > b");
        } else if (a < b) {
            System.out.println("Число a = " + a + ", а число b = " + b + ". Число а < b");
        } else {
            System.out.println("Число a = " + a + ", а число b = " + b + ". Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int x = -90;
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " является положительным и четным");
            } else {
                System.out.println(x + " является положительным и нечетным");
            }
        } else if (x < 0) {
            if (x % 2 == 0) {
                System.out.println(x + " является отрицательным и четным");
            } else {
                System.out.println(x + " является отрицательным и нечетным");
            }
        } else {
            System.out.println(x + " = 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int y = 123;
        int z = 223;
        int repeatsNumber = 0;
        int categories = 0;
        if ((y / 100) == (z / 100) || (y / 10 % 10) == (z / 10 % 10) || (y % 10) == (z % 10)) {
            System.out.println("Исходные числа: y = " + y + ", z = " + z);
            if ((y / 100) == (z / 100)) {
                repeatsNumber += 2;
                categories += 1;
                if ((y / 10 % 10) == (z / 10 % 10)) {
                    repeatsNumber += 2;
                    categories += 1;
                    if ((y % 10) == (z % 10)) {
                        repeatsNumber += 2;
                        categories += 1;
                    }
                } else if ((y / 10 % 10) != (z / 10 % 10)) {
                    if ((y % 10) == (z % 10)) {
                        repeatsNumber += 2;
                        categories += 1; 
                    }
                }
            } else if ((y / 100) != (z / 100)) {
                if ((y / 10 % 10) == (z / 10 % 10)) {
                    repeatsNumber += 2;
                    categories += 1;
                    if ((y % 10) == (z % 10)) {
                        repeatsNumber += 2;
                        categories += 1;
                    }
                } else if ((y / 10 % 10) != (z / 10 % 10)) {
                    if ((y % 10) == (z % 10)) {
                        repeatsNumber += 2;
                        categories += 1;
                    } else if ((y % 10) != (z % 10)) {
                        repeatsNumber += 2;
                        categories += 1;
                    }
                }
            }
            System.out.println("Одинаковых цифр = " + repeatsNumber);
            System.out.println("Количество повторяющихся разрядов = " + categories);
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char myChar = '\u0031';
        if (Character.isLetter(myChar)) {
            if (Character.isUpperCase(myChar)) {
                System.out.println(myChar + " - большая буква");
            } else {
                System.out.println(myChar + " - маленькая буква");
            }
        } else if (Character.isDigit(myChar)) {
            System.out.println(myChar + " - цифра");
        } else {
            System.out.println(myChar + " - ни буква ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
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