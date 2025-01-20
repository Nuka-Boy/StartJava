package com.startjava.lesson_2_3.method;

public class MethodNameUtil {
    public static String getCurrent() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}