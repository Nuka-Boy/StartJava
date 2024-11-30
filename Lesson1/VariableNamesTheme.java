public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("1) Разные переменные");
        // цифра
        int digit = 3;
        System.out.println("Цифра = " + digit);

        // сумма чисел
        int digitSum = digit + 5;
        System.out.println("Сумма чисел = " + digitSum);
    
        // произведение чисел
        int digitProduct = digitSum * digit;
        System.out.println("Произведение чисел = " + digitProduct);
    
        // максимальное число
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное число = " + maxValue);
    
        // количество десятков
        int tensCount = 2;
        System.out.println("Количество десятков = " + tensCount);
    
        // Вес собаки
        int dogWeight = 16;
        System.out.println("Вес собаки = " + dogWeight);
    
        // исходное число
        int originalNumber = 1;
        System.out.println("Исходное число = " + originalNumber);
    
        // процент по вкладу
        int contributionPercent = 29;
        System.out.println("Процент по вкладу = " + contributionPercent);
    
        // переменная хранит символ &
        char charAnd = '&';
        System.out.println("Переменная с символом '&' = " + charAnd);
    
        // код ошибки
        String mistakeNumber = "123ase34Es42:404";
        System.out.println("Код ошибки = " + mistakeNumber);
    
        // тип сообщения
        String messageType = "int";
        System.out.println("Тип сообщения = " + messageType);

        // число нулей
        int zerroCount = 12;
        System.out.println("Количество нулей = " + zerroCount);
    
        // уникальное число
        int unickDigit = 0;
        System.out.println("Уникальное число = " + unickDigit);
    
        // случайное число
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Случайное число = " + randomNumber);
    
        // математическое выражение
        String mathExpression = "x + y = 0";
        System.out.println("Математическое выражение = " + mathExpression);
    
        // счет в игре
        String gameScore = "1 : 0";
        System.out.println("Игровой счёт = " + gameScore);
    
        // максимальная длина
        int maxLength = 42;
        System.out.println("Максимальная длина = " + maxLength);
    
        // пункт меню
        String menuPoint = "Settings";
        System.out.println("Пункт меню = " + menuPoint);
    
        // стоимость кофе
        int coffePrice = 250;
        System.out.println("Стоимость кофе = " + coffePrice);
    
        // дата начала
        double dateStart = 12.24;
        System.out.println("Дата начала = " + dateStart);
    
        // окончание диапазона
        String rangeEnd = "78]";
        System.out.println("Окончание диапазона = " + rangeEnd);
    
        // полное имя работника месяца
        String employeeFullName = "Мистер Пупкин";
        System.out.println("Имя работника месяца : " + employeeFullName);
    
        // название электронной книги
        String bookName = "Война и мир";
        System.out.println("Название электронной книги: " + bookName);
    
        // размер
        int size = 45;
        System.out.println("Размер = " + size);
    
        // вместимость
        double capacity = 100.0;
        System.out.println("Вместимость = " + capacity);
    
        // счетчик
        int iterationCounte = 1;
        System.out.println("Счётчик = " + iterationCounte);
    
        // путь до файла
        String filePath = "D://LessonTopJava//Lesson_1";
        System.out.println("Путь до файла : " + filePath);
    
        // количество чисел в каждой строке
        int digitCount = 99;
        System.out.println("Количество чисел в строке = " + digitCount + "\n");

        // новый блок
        System.out.println("2) Boolean - переменные");

        // сотни равны?
        boolean areHundredsEqual = false;

        // компьютер включен?
        boolean computerIsOn = true;

        // есть равные цифры?
        boolean doDigitsMatch = true;

        // создано?
        boolean creationStatus = true;

        // пустое?
        boolean isEmpty = false;
    
        // активное?
        boolean isActive = true;
    
        // новое?
        boolean isRecentlyCreated = true;

        // электронная почта действительная?
        boolean isValidEmai = true;

        // имеются уникальные строки?
        boolean linesAreUnique = true;

        System.out.println("Сотни равны? " + areHundredsEqual);
        System.out.println("Компьютер включен? " + computerIsOn);
        System.out.println("Есть равные цифры? " + doDigitsMatch);
        System.out.println("Создано? " + creationStatus);
        System.out.println("Пустое? " + isEmpty);
        System.out.println("Активное? " + isActive);
        System.out.println("Новое? " + isRecentlyCreated);
        System.out.println("Действительная электронная почта? " + isValidEmai);
        System.out.println("Есть уникальные строки? " + linesAreUnique + "\n");

        // 3 блок
        System.out.println("3) Аббревиатуры");

        // старый universally unique identifier
        String oldUuid = "UUID";

        // производитель оперативной памяти
        String ramMaker = "Nvidia";

        // емкость жесткого диска
        int hardDiskCapacity = 1024;

        // протокол передачи гипертекста
        String http = "HyperTextTransferProtocol";

        // сокращенный uniform resource locator
        String url = "web address";

        // новый идентификатор клиента
        String clientNewId = "id нового клиента";

        // american standart code for information interchange 
        String ascii = "Стандарт кодирования";

        System.out.printf("universally unique identifier - " + "%s\n" + "Производитель оперативной памяти - " + 
                "%s\n" + "Емкость жесткого диска = " + "%d\n" + "Протокол передачи гипертекста - " + "%s\n" + 
                "Сокращенный uniform resource locator - " + "%s\n" + "Новый идентификатор клиента - " + "%s\n" + 
                "american standart code for information interchange - " + "%s",
                 oldUuid, ramMaker, hardDiskCapacity, http, url, clientNewId, ascii);
    }
}
