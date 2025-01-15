public class NonBooleanMethods {   
    public void findLongestWord() {
        System.out.println("\n" + MethodNameUtil.getCurrent() + "() -> Самое длинное слово, это ...");
    }

    public void selectMenuItem() {
        System.out.println(MethodNameUtil.getCurrent() + 
                "() -> Выбирает пункт меню в текстовом редакторе");
    }

    public void calculateAverageGrade() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Вычисляет среднее значение оценок");
    }

    public void countUniqueWords() {
        System.out.println(MethodNameUtil.getCurrent() + 
                "() -> Подсчитывает количество уникальных слов");
    }

    public void displayErrorMessage() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Выводит сообщение об ошибке");
    }

    public void sync() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Синхронизирует данные с облаком");
    }

    public void restoreBackup() {
        System.out.println(MethodNameUtil.getCurrent() + 
                "() -> Восстанавливает данные из резервной копии");
    }

    public void pauseDownload() {
        System.out.println(MethodNameUtil.getCurrent() + 
                "() -> Приостанавливает загрузку mp3-файла");
    }

    public void resetDefaultSettings() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Сбрасывает настройки до заводских");
    }

    public void writeToFile() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Записывает содержимое в файл");
    }

    public void convertCelsiusToFahrenheit() {
        System.out.println(MethodNameUtil.getCurrent() + 
                "() -> Преобразует температуру из Цельсия в Фаренгейт");
    } 

    public void inputMathExpression() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Вводит математическое выражение");
    }

    public void findWinner() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Находит победителя среди гонщиков");
    }

    public void findBookByAuthor() {
        System.out.println(MethodNameUtil.getCurrent() + "() -> Ищет книгу по имени писателя");
    }
}