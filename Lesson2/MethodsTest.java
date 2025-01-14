public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("\nВыполнение методов из класса NonBooleanMethods:");
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageGrade();
        nonBm.countUniqueWords();
        nonBm.displayErrorMessage();
        nonBm.sync();
        nonBm.restoreBackup();
        nonBm.pauseDownload();
        nonBm.resetDefaultSettings();
        nonBm.writeToFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.findWinner();
        nonBm.findBookByAuthor();

        System.out.println();

        System.out.println("\nВыполнение методов из класса BooleanMethods:");
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgramRunning());
        System.out.println(bm.isFileDeleted()); 
        System.out.println(bm.hasUniqueDigit()); 
        System.out.println(bm.isInputLetter()); 
        System.out.println(bm.hasEqualDigits()); 
        System.out.println(bm.hasAttemptsLeft()); 
        System.out.println(bm.isEmptyString()); 
        System.out.println(bm.isDiceEven()); 
        System.out.println(bm.isPathValid()); 
        System.out.println(bm.isFileExists()); 
    }
}