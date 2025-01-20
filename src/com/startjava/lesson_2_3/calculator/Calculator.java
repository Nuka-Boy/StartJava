package com.startjava.lesson_2_3.calculator;

public class Calculator { 
    private double firstNumber;
    private double secondNumber;
    private char operation;
    
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calculate() {
        double result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = firstNumber / secondNumber;  
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
                result = 0;   
        }
        return result; 
    }    
}