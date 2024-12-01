import java.math.BigDecimal;
import java.math.RoundingMode;
public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        // Компьютер включен?
        boolean isOn = true;
        System.out.println("Компьютер включен? - " + isOn);

        // Оперативная память
        byte  ram = 16;
        System.out.println("Оперативная память = " + ram + "ГБ");

        // Емкость твердотельного накопителя
        short ssdCapacity = 2;
        System.out.println("Емкость твердотельного накопителя = " + ssdCapacity + "TB");

        // Количество видео памяти
        int gpuCapacity = 16;
        System.out.println("Количество видео памяти = " + gpuCapacity + "ГБ");

        // Количество портов в материнской плате
        long portsCount = 8;
        System.out.println("Количество портов в материнской плате = " + portsCount);

        // Символ на клавиатуре @ 
        char keyboardSymbol = '\u0040';
        System.out.println("Символ на клавиатуре @  = " + keyboardSymbol);

        // Размер экрана в см
        float monitorSize = 68.58f;
        System.out.println("Размер экрана 27 дюймов в см = " + monitorSize + "см");

        // Напряжение блока питания
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
        System.out.println("    " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a" + "");
        System.out.println("    " + "J" + "   " + "a" +" "+ "a" + "  " + "v" + "   " + "v" + "  " + "a" + " " + "a");
        System.out.println(" " + "J" + "  " + "J" + "  " + "aaaaa" + "  " + "V V" + "  " + "aaaaa");
        System.out.println("  " + "JJ" + "  " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Максимальное значение в переменной типа byte = " + byteMaxValue);
        byteMaxValue++;
        System.out.println("После инкремента = " + byteMaxValue);
        byteMaxValue--;
        System.out.println("После декремента = " + byteMaxValue);

        char charMaxValue =  '\u0039';
        System.out.println("Максимальное число в переменной типа char = " + charMaxValue);
        charMaxValue++;
        System.out.println("После инкремента = " + charMaxValue);
        charMaxValue--;
        System.out.println("После декремента = " + charMaxValue);

        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа short = " + shortMaxValue);
        shortMaxValue++;
        System.out.println("После инкремента = " + shortMaxValue);
        shortMaxValue--;
        System.out.println("После декремента = " + shortMaxValue);

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа int = " + intMaxValue);
        intMaxValue++;
        System.out.println("После инкремента = " + intMaxValue);
        intMaxValue--;
        System.out.println("После декремента = " + intMaxValue);

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Максимальное число в переменной типа long = " + longMaxValue);
        longMaxValue++;
        System.out.println("После инкремента = " + longMaxValue);
        longMaxValue--;
        System.out.println("После декремента = " + longMaxValue + "\n");

        System.out.println("5. Перестановка значений переменных");
    }
}