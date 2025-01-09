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
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Самое длинное слово, это ...");
    }

    public void selectMenuItem() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Выбирает пункт меню в текстовом редакторе");
    }

    public void calculateAverageGrade() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Вычисляет среднее значение оценок");
    }

    public void countUniqueWords() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Подсчитывает количество уникальных слов");
    }

    public void displayErrorMessage() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Выводит сообщение об ошибке");
    }

    public void synchronizeData() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Синхронизирует данные с облаком");
    }

    public void restoreData() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Восстанавливает данные из резервной копии");
    }

    public void pauseDownload() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Приостанавливает загрузку mp3-файла");
    }

    public void resetSettings() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Сбрасывает настройки до заводских");
    }

    public void writeToFile() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Записывает содержимое в файл");
    }

    public void convertTemperature() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Преобразует температуру из Цельсия в Фаренгейт");
    } 

    public void inputMathExpression() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Вводит математическое выражение");
    }

    public void findWinner() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Находит победителя среди гонщиков");
    }

    public void findBookByAuthor() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Ищет книгу по имени писателя");
    }
}