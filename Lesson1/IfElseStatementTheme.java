public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "Женщина";
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
            }
            else {
                System.out.println(x + " является положительным и нечетным");
            }
        }
        else if (x < 0) {
            if (x % 2 == 0) {
                System.out.println(x + " является отрицательным и четным");
            }
            else {
                System.out.println(x + " является отрицательным и нечетным");
            }
        }
        else {
            System.out.println(x + " = 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int y = 123;
        int z = 223;
        int repeatsNumber = 0;
        int categories = 0;
        if((y / 100) == (z / 100) || (y / 10 % 10) == (z / 10 % 10) || (y % 10) == (z % 10)) {
        System.out.println("Исходные числа: y = " + y + ", z = " + z);
        if((y / 100) == (z / 100)){
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
                    categories += 1;}
            }
        }
        else if ((y / 100) != (z / 100)) {
            if ((y / 10 % 10) == (z / 10 % 10)) {
                repeatsNumber += 2;
                categories += 1;
                if ((y % 10) == (z % 10)) {
                    repeatsNumber += 2;
                    categories += 1;
                }
            }
            else if ((y / 10 % 10) != (z / 10 % 10)) {
                if ((y % 10) == (z % 10)) {
                    repeatsNumber += 2;
                    categories += 1;
                } else if ((y % 10) != (z % 10)){

                }
            }
        }
        System.out.println("Одинаковых цифр = " + repeatsNumber);
        System.out.println("Количество повторяющихся разрядов = " + categories);
        }
        else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
    }
}