public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("\nВыполнение методов из класса NonBooleanMethods:");
        NonBooleanMethods nonBooleanMetods = new NonBooleanMethods();
        nonBooleanMetods.executeAllMetods();

        System.out.println();

        System.out.println("\nВыполнение методов из класса BooleanMethods:");
        BooleanMethods booleanMetods = new BooleanMethods();
        booleanMetods.executeAllMetods();
    }
}