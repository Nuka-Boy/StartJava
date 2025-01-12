public class NonBooleanMethods {
    public void executeAllMetods() {
        findLongestWord();
        selectMenuItem();
        calculateAverageGrade();
        countUniqueWords();
        displayErrorMessage();
        sync();
        restoreBackup();
        pauseDownload();
        resetDefaultSettings();
        writeToFile();
        convertCelsiusToFahrenheit();
        inputMathExpression();
        findWinner();
        findBookByAuthor();
    }

    public void findLongestWord() {
        System.out.println("\n" + MethodNameUtil.getName() + " -> Самое длинное слово, это ...");
    }

    public void selectMenuItem() {
        System.out.println(MethodNameUtil.getName() + 
                " -> Выбирает пункт меню в текстовом редакторе");
    }

    public void calculateAverageGrade() {
        System.out.println(MethodNameUtil.getName() + " -> Вычисляет среднее значение оценок");
    }

    public void countUniqueWords() {
        System.out.println(MethodNameUtil.getName() + 
                " -> Подсчитывает количество уникальных слов");
    }

    public void displayErrorMessage() {
        System.out.println(MethodNameUtil.getName() + " -> Выводит сообщение об ошибке");
    }

    public void sync() {
        System.out.println(MethodNameUtil.getName() + " -> Синхронизирует данные с облаком");
    }

    public void restoreBackup() {
        System.out.println(MethodNameUtil.getName() + 
                " -> Восстанавливает данные из резервной копии");
    }

    public void pauseDownload() {
        System.out.println(MethodNameUtil.getName() + 
                " -> Приостанавливает загрузку mp3-файла");
    }

    public void resetDefaultSettings() {
        System.out.println(MethodNameUtil.getName() + " -> Сбрасывает настройки до заводских");
    }

    public void writeToFile() {
        System.out.println(MethodNameUtil.getName() + " -> Записывает содержимое в файл");
    }

    public void convertCelsiusToFahrenheit() {
        System.out.println(MethodNameUtil.getName() + 
                " -> Преобразует температуру из Цельсия в Фаренгейт");
    } 

    public void inputMathExpression() {
        System.out.println(MethodNameUtil.getName() + " -> Вводит математическое выражение");
    }

    public void findWinner() {
        System.out.println(MethodNameUtil.getName() + " -> Находит победителя среди гонщиков");
    }

    public void findBookByAuthor() {
        System.out.println(MethodNameUtil.getName() + " -> Ищет книгу по имени писателя");
    }
}