public class NonBooleanMethods {

    public void executeAllMetods() {
        NonBooleanMethods.findLongestWord();
      System.out.println();
      NonBooleanMethods.selectMenuItem();
      System.out.println();
      NonBooleanMethods.calculateAverageGrade();
       System.out.println();
      NonBooleanMethods.countUniqueWords();
       System.out.println();
      NonBooleanMethods.displayErrorMessage();
       System.out.println();
      NonBooleanMethods.synchronizeData();
       System.out.println();
      NonBooleanMethods.restoreData();
       System.out.println();
      NonBooleanMethods.pauseDownload();
       System.out.println();
      NonBooleanMethods.resetSettings();
       System.out.println();
      NonBooleanMethods.writeToFile();
       System.out.println();
      NonBooleanMethods.convertTemperature();
       System.out.println();
       NonBooleanMethods.inputMathExpression();
       System.out.println();
      NonBooleanMethods.findWinner();
       System.out.println();
      NonBooleanMethods.findBookByAuthor();

    }

    public void findLongestdWord() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Самое длинное слово, это ...");
    }

    public void selectMenuItem() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Выбирает пункт меню в текстовом редакторе");
    }

    public void calculateAverageGrade() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Вычисляет среднее значение оценок");
    }

    public void countUniqueWords() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Подсчитывает количество уникальных слов");
    }

    public void displayErrorMessage() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Выводит сообщение об ошибке");
    }

    public void synchronizeData() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Синхронизирует данные с облаком");
    }

    public void restoreData() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Восстанавливает данные из резервной копии");
    }

    public void pauseDownload() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Приостанавливает загрузку mp3-файла");
    }

    public void reserSettings() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Сбрасывает настройки до заводских");
    }

    public void writeToFile() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Записывает содержимое в файл");
    }

    public void convertTemperature() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Преобразует температуру из Цельсия в Фаренгейт");
    } 

    public void inputMathExpression() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Вводит математическое выражение");
    }

    public void findWinner() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Находит победителя среди гонщиков");
    }

    public void findBookByAuthor() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Ищет книгу по имени писателя");
    }
}