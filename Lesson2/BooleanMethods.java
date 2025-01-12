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
        System.out.print("\n" + MethodNameUtil.getName() + " -> Программа выполняется ? ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodNameUtil.getName() + " -> Файл удален ? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodNameUtil.getName() + " -> Содержит уникальную цифру ? ");
        return false;
    }

    public boolean isInputLetter() {
        System.out.print(MethodNameUtil.getName() + " -> Пользователь ввел букву ? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodNameUtil.getName() + " -> Есть ли в числах равные цифры ? ");
        return true;
    }

    public boolean hasAttemptsLeft() {
        System.out.print(MethodNameUtil.getName() + " -> Попытки остались ? ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(MethodNameUtil.getName() + " -> Пустая строка ? ");
        return true;
    }

    public boolean isDiceEven() {
        System.out.print(MethodNameUtil.getName() + " -> Число четное ? ");
        return true;
    }

    public boolean isPathValid() {
        System.out.print(MethodNameUtil.getName() + " -> Путь до файла действителен ? ");
        return true;
    }

    public boolean isFileExists() {
        System.out.print(MethodNameUtil.getName() + 
                " -> Существует файл по указанному адресу ? ");
        return true;
    }
}