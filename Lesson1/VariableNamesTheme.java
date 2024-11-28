
public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("1) Разные переменные");
        // цифра
        int digit = 3;
        System.out.println(digit);

        // сумма чисел
        int sumDigits = digit + 5;
        System.out.println(sumDigits);
    
        // произведение чисел
        int productDigits = sumDigits * digit;
        System.out.println(productDigits);
    
        // максимальное число
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
    
        // количество десятков
        int numberOfTen = 2;
        System.out.println(numberOfTen);
    
        // Вес собаки
        int weightDog = 16;
        System.out.println(weightDog);
    
        // исходное число
        int originalNumber = 1;
        System.out.println(originalNumber);
    
        // процент по вкладу
        int percentContribution = 29;
        System.out.println(percentContribution);
    
        // переменная хранит символ &
        char andChar = '&';
        System.out.println(andChar);
    
        // код ошибки
        String mistakeNumber = "123ase34Es42:404";
        System.out.println(mistakeNumber);
    
        // тип сообщения
        String typeOfMessage = "int";
        System.out.println(typeOfMessage);

        // число нулей
        int numberOfZerro = 12;
        System.out.println(numberOfZerro);
    
        // уникальное число
        int unickDigit = 0;
        System.out.println(unickDigit);
    
        // случайное число
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println(randomNumber);
    
        // математическое выражение
        String mathExpression = "x + y = 0";
        System.out.println(mathExpression);
    
        // счет в игре
        String score = "1 : 0";
        System.out.println(score);
    
        // максимальная длина
        int maxLength = 42;
        System.out.println(maxLength);
    
        // пункт меню
        String menuPoint = "Settings";
        System.out.println(menuPoint);
    
        // стоимость кофе
        int coffePrice = 250;
        System.out.println(coffePrice);
    
        // дата начала
        double startDate = 12.24;
        System.out.println(startDate);
    
        // окончание диапазона
        String endOfRange = "78]";
        System.out.println(endOfRange);
    
        // полное имя работника месяца
        String fullNameEmploye = "Мистер Пупкин";
        System.out.println(fullNameEmploye);
    
        // название электронной книги
        String bookName = "Война и мир";
        System.out.println(bookName);
    
        // размер
        int size = 45;
        System.out.println(size);
    
        // вместимость
        double capacity = 100.0;
        System.out.println(capacity);
    
        // счетчик
        int counter = 1;
        System.out.println(counter);
    
        // путь до файла
        String filePath = "D://LessonTopJava//Lesson_1";
        System.out.println(filePath);
    
        // количество чисел в каждой строке
        int numberOfDigits = 99;
        System.out.println(numberOfDigits + "\n");

        // новый блок
        System.out.println("2) Boolean - переменные");

        // сотни равны?
        boolean isEqualHundreds = false;

        // компьютер включен?
        boolean isOn = true;

        // есть равные цифры?
        boolean hasEqualDigits = true;

        // создано?
        boolean isCreated = true;

        // пустое?
        boolean isEmpty = false;
    
        // активное?
        boolean active = true;
    
        // новое?
        boolean isNew = true;

        // электронная почта действительная?
        boolean hasMail = true;

        // имеются уникальные строки?
        boolean hasUniqueLines = true;

        System.out.println(isEqualHundreds);
        System.out.println(isOn);
        System.out.println(hasEqualDigits);
        System.out.println(isCreated);
        System.out.println(isEmpty);
        System.out.println(active);
        System.out.println(isNew);
        System.out.println(hasMail);
        System.out.println(hasUniqueLines + "\n");

        // 3 блок
        System.out.println("3) Аббревиатуры");

        // старый universally unique identifier
        String uuid = "UUID";

        // производитель оперативной памяти
        String ramMaker = "Nvidia";

        // емкость жесткого диска
        int nddCapacity = 1024;

        // протокол передачи гипертекста
        String http = "HyperTextTransferProtocol";

        // сокращенный uniform resource locator
        String url = "web address";

        // новый идентификатор клиента
        String newId = "id нового клиента";

        // american standart code for information interchange 
        String ascii = "Стандарт кодирования";

        System.out.printf("%s\n%s\n%d\n%s\n%s\n%s\n%s", uuid, ramMaker, nddCapacity, http, url, newId, ascii);
    }
}
