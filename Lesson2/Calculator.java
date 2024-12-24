public class Calculator { 
    private double firstNumber;
    private double secondNumber;
    private char operation;
    
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    public double getCalculatedResult() {
        double result = 0;
        switch (getOperation()) {
            case '+':
                result = getFirstNumber() + getSecondNumber();
                break;
            case '-':
                result = getFirstNumber() - getSecondNumber();
                break;
            case '*':
                result = getFirstNumber() * getSecondNumber();
                break;
            case '/':
                if (getSecondNumber() == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = getFirstNumber() / getSecondNumber();  
                }
                break;
            case '%':
                result = getFirstNumber() % getSecondNumber();
                break;
            case '^':
                result = Math.pow(getFirstNumber(), getSecondNumber());
                break;
            default:
                System.out.println("Ошибка: операция " + getOperation() + " не поддерживается");
                result = 0;   
        }
        return result; 
    }    
}