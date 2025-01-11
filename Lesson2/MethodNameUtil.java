public class MethodNameUtil {
    public static String getMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace[2].getMethodName();
    }
}