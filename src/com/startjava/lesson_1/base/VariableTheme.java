package com.startjava.lesson_1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        boolean isOn = true;
        System.out.println("Компьютер включен? - " + isOn);

        byte ramSize = 16;
        System.out.println("Оперативная память = " + ramSize + "ГБ");

        short ssdCapacity = 2;
        System.out.println("Емкость твердотельного накопителя = " + ssdCapacity + "TB");

        int gpuCapacity = 16;
        System.out.println("Количество видео памяти = " + gpuCapacity + "ГБ");

        long portsCount = 8;
        System.out.println("Количество портов в материнской плате = " + portsCount);

        char keyboardSymbol = '@';
        System.out.println("Символ на клавиатуре @  = " + keyboardSymbol);

        float monitorSize = 68.58f;
        System.out.println("Размер экрана 27 дюймов в см = " + monitorSize + "см");

        double powerModule = 12;
        System.out.println("Напряжение блока питания после преобразования = " + powerModule + "B\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        // цена ручки и книги в рублях
        BigDecimal penPrice = new BigDecimal("105.5");
        BigDecimal bookPrice = new BigDecimal("235.83");
        BigDecimal discountPercent = new BigDecimal("0.11");
        BigDecimal totalPenDiscount = penPrice.multiply(discountPercent).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalBookDiscount = bookPrice.multiply(discountPercent).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Действует скидка 11%"); 
        System.out.println("Стоимость товаров без скидки составляет:\n" + "книга - " + bookPrice +
                " RUB\n" + "ручка - " + penPrice + " RUB");
        System.out.println("Скидка для книги составила - " + totalBookDiscount + " RUB\n" + 
                "Скидка для ручки составила - " + totalPenDiscount + " RUB");
        System.out.println("Стоимость книги со скидкой составила: " + 
                bookPrice.subtract(totalBookDiscount) + " RUB\n" + 
                "Стоимость ручки со скидкой составила: " + penPrice.subtract(totalPenDiscount) + " RUB\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Максимальное значение в переменной типа byte = " + byteMaxValue);
        System.out.println("После инкремента = " + (++byteMaxValue) + "\n" + 
                "После декремента = " + (--byteMaxValue));

        int charMaxValue = Character.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа char = " + charMaxValue);
        System.out.println("После инкремента = " + (++charMaxValue) + "\n" + 
                "После декремента = " + (--charMaxValue));

        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа short = " + shortMaxValue);
        System.out.println("После инкремента = " + (++shortMaxValue) + "\n" + 
                "После декремента = " + (--shortMaxValue));

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа int = " + intMaxValue);
        System.out.println("После инкремента = " + (++intMaxValue) + "\n" + 
                "После декремента = " + (--intMaxValue));

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа long = " + longMaxValue);
        System.out.println("После инкремента = " + (++longMaxValue) + "\n" + 
                "После декремента = " + (--longMaxValue) + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        // перестановка с помощью третьей переменной 
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения переменных \n" + "a = " + a + "\n" + "b = " + b);
        int swap = b;
        b = a;
        a = swap;
        System.out.println("Новые значения переменных \n" + "a = " + a + "\n" + "b = " + b);
        // перестановка с помощью арифметических операций
        System.out.println("Перестановка с помощью арифметических операций");
        a -= b;
        b += a;
        a = b - a;
        System.out.println("Новые значения переменных \n" + "a = " + a);
        System.out.println("b = " + b);
        // перестановка с помощью побитовой операции
        System.out.println("Перестановка с помощью побитовой операции");
        a ^= b;
        b ^= a;
        a -= b;
        System.out.println("Новые значения переменных \n" + "a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char star = '*';
        char et = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа: " + ((int) dollar) + " Вид символа: " + dollar);
        System.out.println("             " + ((int) star) + "              " + star);
        System.out.println("             " + ((int) et) + "              " + et);
        System.out.println("            " + ((int) verticalBar) + "              " + verticalBar);
        System.out.println("             " + ((int) tilde) + "             " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char underscore = '_';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParentesis = ')';
        System.out.println("    " + slash + backslash + " " + "\n" + "   " + slash + 
                "  " + backslash + " " + "\n" + "  " + slash + underscore + leftParenthesis + " " + 
                rightParentesis + backslash + " " + "\n" + " " + slash + "      " + backslash + " " + 
                "\n" + slash + underscore + underscore + underscore + underscore + underscore + 
                backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        System.out.println("Число " + number + " содержит:");
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);

        int digitsSum = hundreds + tens + ones;
        System.out.println("Сумма разрядов = " + digitsSum);
        int digitsProduct = hundreds * tens * ones;
        System.out.println("Произведение разрядов = " + digitsProduct + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = (totalSeconds % 3600) / 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss); 
    }
}       