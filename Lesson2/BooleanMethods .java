public class BooleanMethods {

    public void executeAllMetods() {
        BooleanMethods.isProgramRunning();
        
        BooleanMethods.isFileDeleted();
        
        BooleanMethods.hasUniqueDigit();
        
        BooleanMethods.isInputLetter();
        
        BooleanMethods.hasEqualDigits();
        
        BooleanMethods.hasAttemptsLeft();
        
        BooleanMethods.isEmptyString();
        
        BooleanMethods.isDiceEven();
        
        BooleanMethods.isPathValid();
        
       BooleanMethods.isFileExists();
    }

    public boolean isProgrammRunning() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Программа выполняется ?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Файл удален ?");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Содержит уникальную цифру ?");
        return false;
    }

    public boolean isInputLetter() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Пользователь ввел букву ?");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Есть ли в числах равные цифры ?");
        return true;
    }

    public boolean AttemptsLeft() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Попытки остались ?");
        return false;
    }

    public boolean isEmptyString() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Пустая строка ?");
        return true;
    }

    public boolean isDiceEven() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Число четное ?");
        return true;
    }

    public boolean isPathValid() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Путь до файла действителен ?");
        return true;
    }

    public boolean isFileExists() {
        System.out.println("\n" + MethodNameUtil.getCallingMethodName() + " Существует файл по указанному адресу ?");
        return true;
    }
}