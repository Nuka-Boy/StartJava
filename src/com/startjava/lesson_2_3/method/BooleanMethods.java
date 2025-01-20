package com.startjava.lesson_2_3.method;

public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.print("\n" + MethodNameUtil.getCurrent() + "() -> Программа выполняется? ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Файл удален? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Содержит уникальную цифру? ");
        return false;
    }

    public boolean isInputLetter() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Пользователь ввел букву? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Есть ли в числах равные цифры? ");
        return true;
    }

    public boolean hasAttemptsLeft() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Попытки остались? ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Пустая строка? ");
        return true;
    }

    public boolean isDiceEven() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Число четное? ");
        return true;
    }

    public boolean isPathValid() {
        System.out.print(MethodNameUtil.getCurrent() + "() -> Путь до файла действителен? ");
        return true;
    }

    public boolean isFileExists() {
        System.out.print(MethodNameUtil.getCurrent() + 
                "() -> Существует файл по указанному адресу? ");
        return true;
    }
}