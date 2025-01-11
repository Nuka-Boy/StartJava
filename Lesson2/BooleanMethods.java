public class BooleanMethods {
    public void executeAllMetods() {
        System.out.println(isProgramRunning()); 
        System.out.println(isFileDeleted()); 
        System.out.println(hasUniqueDigit()); 
        System.out.println(isInputLetter()); 
        System.out.println(hasEqualDigits()); 
        System.out.println(hasAttemptsLeft()); 
        System.out.println(isEmptyString()); 
        System.out.println(isDiceEven()); 
        System.out.println(isPathValid()); 
        System.out.println(isFileExists()); 
    }

    public boolean isProgramRunning() {
        System.out.print("\n" + MethodNameUtil.getMethodName() + " Программа выполняется ? -> ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodNameUtil.getMethodName() + " Файл удален ? -> ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodNameUtil.getMethodName() + " Содержит уникальную цифру ? -> ");
        return false;
    }

    public boolean isInputLetter() {
        System.out.print(MethodNameUtil.getMethodName() + " Пользователь ввел букву ? -> ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodNameUtil.getMethodName() + " Есть ли в числах равные цифры ? -> ");
        return true;
    }

    public boolean hasAttemptsLeft() {
        System.out.print(MethodNameUtil.getMethodName() + " Попытки остались ? -> ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(MethodNameUtil.getMethodName() + " Пустая строка ? -> ");
        return true;
    }

    public boolean isDiceEven() {
        System.out.print(MethodNameUtil.getMethodName() + " Число четное ? -> ");
        return true;
    }

    public boolean isPathValid() {
        System.out.print(MethodNameUtil.getMethodName() + " Путь до файла действителен ? -> ");
        return true;
    }

    public boolean isFileExists() {
        System.out.print(MethodNameUtil.getMethodName() + 
                " Существует файл по указанному адресу ? -> ");
        return true;
    }
}