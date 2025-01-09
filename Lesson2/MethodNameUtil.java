public class MethodNameUtil {
    public static String getCallingMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 3) {
            return "Невозможно определить вызывающий метод";
        }
        return stackTrace[2].getMethodName();
    }
}