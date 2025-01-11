public class NonBooleanMethods {
    public void executeAllMetods() {
        findLongestWord();
        selectMenuItem();
        calculateAverageGrade();
        countUniqueWords();
        displayErrorMessage();
        synchronizeData();
        restoreData();
        pauseDownload();
        resetSettings();
        writeToFile();
        convertTemperature();
        inputMathExpression();
        findWinner();
        findBookByAuthor();
    }

    public void findLongestWord() {
        System.out.println("\n" + MethodNameUtil.getMethodName() + " Самое длинное слово, это ...");
    }

    public void selectMenuItem() {
        System.out.println(MethodNameUtil.getMethodName() + 
                " Выбирает пункт меню в текстовом редакторе");
    }

    public void calculateAverageGrade() {
        System.out.println(MethodNameUtil.getMethodName() + " Вычисляет среднее значение оценок");
    }

    public void countUniqueWords() {
        System.out.println(MethodNameUtil.getMethodName() + 
                " Подсчитывает количество уникальных слов");
    }

    public void displayErrorMessage() {
        System.out.println(MethodNameUtil.getMethodName() + " Выводит сообщение об ошибке");
    }

    public void synchronizeData() {
        System.out.println(MethodNameUtil.getMethodName() + " Синхронизирует данные с облаком");
    }

    public void restoreData() {
        System.out.println(MethodNameUtil.getMethodName() + 
                " Восстанавливает данные из резервной копии");
    }

    public void pauseDownload() {
        System.out.println(MethodNameUtil.getMethodName() + 
                " Приостанавливает загрузку mp3-файла");
    }

    public void resetSettings() {
        System.out.println(MethodNameUtil.getMethodName() + " Сбрасывает настройки до заводских");
    }

    public void writeToFile() {
        System.out.println(MethodNameUtil.getMethodName() + " Записывает содержимое в файл");
    }

    public void convertTemperature() {
        System.out.println(MethodNameUtil.getMethodName() + 
                " Преобразует температуру из Цельсия в Фаренгейт");
    } 

    public void inputMathExpression() {
        System.out.println(MethodNameUtil.getMethodName() + " Вводит математическое выражение");
    }

    public void findWinner() {
        System.out.println(MethodNameUtil.getMethodName() + " Находит победителя среди гонщиков");
    }

    public void findBookByAuthor() {
        System.out.println(MethodNameUtil.getMethodName() + " Ищет книгу по имени писателя");
    }
}