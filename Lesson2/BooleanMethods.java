public class BooleanMethods {
    public void executeAllMetods() {
        isProgramRunning();
        
        isFileDeleted();
        
        hasUniqueDigit();
        
        isInputLetter();
        
        hasEqualDigits();
        
        hasAttemptsLeft();
        
        isEmptyString();
        
        isDiceEven();
        
        isPathValid();
        
        isFileExists();
    }

    public boolean isProgramRunning() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Программа выполняется ?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Файл удален ?");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Содержит уникальную цифру ?");
        return false;
    }

    public boolean isInputLetter() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Пользователь ввел букву ?");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Есть ли в числах равные цифры ?");
        return true;
    }

    public boolean hasAttemptsLeft() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Попытки остались ?");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Пустая строка ?");
        return true;
    }

    public boolean isDiceEven() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Число четное ?");
        return true;
    }

    public boolean isPathValid() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + " Путь до файла действителен ?");
        return true;
    }

    public boolean isFileExists() {
        System.out.print("\n" + MethodNameUtil.getCallingMethodName() + 
                " Существует файл по указанному адресу ?");
        return true;
    }
}