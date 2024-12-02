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
        BigDecimal percentSale = new BigDecimal("0.11");
        BigDecimal totalPenSale = penPrice.multiply(percentSale).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalBookSale = bookPrice.multiply(percentSale).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Действует скидка 11%"); 
        System.out.println("Стоимость товаров без скидки составляет:\n" + "книга - " + bookPrice +
                " RUB\n" + "ручка - " + penPrice + " RUB");
        System.out.println("Скидка для книги составила - " + totalBookSale + " RUB\n" + 
                "Скидка для ручки составила - " + totalPenSale + " RUB");
        System.out.println("Стоимость книги со скидкой составила: " + 
                bookPrice.subtract(totalBookSale) + " RUB\n" + 
                "Стоимость ручки со скидкой составила: " + penPrice.subtract(totalPenSale) + " RUB\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Максимальное значение в переменной типа byte = " + byteMaxValue);
        System.out.println("После инкремента = " + (byteMaxValue++) + "\n" + "После декремента = " +
                 (byteMaxValue--));

        char charMaxValue = Character.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа char = " + charMaxValue);
        System.out.println("После инкремента = " + (charMaxValue++) + "\n" + "После декремента = " +
                 (charMaxValue--));

        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа short = " + shortMaxValue);
        System.out.println("После инкремента = " + (shortMaxValue++) + "\n" + "После декремента = " +
                 (shortMaxValue--));

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа int = " + intMaxValue);
        System.out.println("После инкремента = " + (intMaxValue++) + "\n" + "После декремента = " +
                 (intMaxValue--));

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа long = " + longMaxValue);
        System.out.println("После инкремента = " + (longMaxValue++) + "\n" + "После декремента = " +
                 (longMaxValue--) + "\n");

        System.out.println("5. Перестановка значений переменных");
        int two = 2;
        int five = 5;
        // перестановка с помощью третьей переменной 
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения переменных \n" + "two = " + two + "\n" + "five = " + five);
        int newDigit = five;
        five = two;
        two = newDigit;
        System.out.println("Новые значения переменных \n" + "two = " + two + "\n" + "five = " + five);
        // перестановка с помощью арифметических операций
        System.out.println("Перестановка с помощью арифметических операций");
        two = two - five;
        five = five + two;
        two = five - two;
        System.out.println("Новые значения переменных \n" + "two = " + two);
        System.out.println("five = " + five);
        // перестановка с помощью побитовой операции
        System.out.println("Перестановка с помощью побитовой операции");
        two = two ^ five;
        five = two ^ five;
        two = two - five;
        System.out.println("Новые значения переменных \n" + "two = " + two);
        System.out.println("five = " + five);
        System.out.println("6. Вывод символов и их кодов");
        char dollarSymbol = '$';
        char starSymbol = '*';
        char etSymbol = '@';
        char backslashSymbol = '\\';
        char tildeSymbol = '~';
        System.out.println("Код символа: " + ((int) dollarSymbol) + " Вид символа: " + dollarSymbol);
        System.out.println("             " + ((int) starSymbol) + "              " + starSymbol);
        System.out.println("             " + ((int) etSymbol) + "              " + etSymbol);
        System.out.println("             " + ((int) backslashSymbol) + "              " + backslashSymbol);
        System.out.println("             " + ((int) tildeSymbol) + "             " + tildeSymbol + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slashSymbol = '/';
        char tilde = '_';
        char backSlash = '\\';
        char branch = '(';
        char backBranch = ')';
        System.out.println("    " + slashSymbol + backSlash + " " + "\n" + "   " + slashSymbol + 
                "  " + backSlash + " " + "\n" + "  " + slashSymbol + tilde + branch + " " + backBranch +
                backSlash + " " + "\n" + " " + slashSymbol + "      " + backSlash + " " + "\n" + 
                slashSymbol + tilde + tilde + tilde + tilde + slashSymbol + backSlash + tilde + tilde + 
                backSlash + "\n");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        System.out.println("Число " + number + " содержит:");
        int hundreds = number / 100;
        number %= 100;
        int tens = number / 10;
        number %= 10;
        int units = number;

        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);

        int sumOfDigits = hundreds + tens + units;
        System.out.println("Сумма разрядов = " + sumOfDigits);
        int productOfDigits = hundreds * tens * units;
        System.out.println("Произведение разрядов = " + productOfDigits + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int numberOfSeconds = 86399;
        int hours = numberOfSeconds / 3600;
        numberOfSeconds %= 3600;
        int minutes = numberOfSeconds / 60;
        numberOfSeconds %= 60;
        int seconds = numberOfSeconds;
        System.out.println(hours + ":" + minutes + ":" + seconds); 
    }
}       