public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("\nВыполнение методов из класса NonBooleanMethods:");
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.executeAllMetods();

        System.out.println();

        System.out.println("\nВыполнение методов из класса BooleanMethods:");
        BooleanMethods bm = new BooleanMethods();
        bm.executeAllMetods();
    }
}