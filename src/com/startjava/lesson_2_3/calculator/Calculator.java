package com.startjava.lesson_2_3.calculator;
public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char mathOperation;
    private int result;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate() {
        switch (mathOperation) {
            case '+' : 
                return firstNumber + secondNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return firstNumber * secondNumber;
            case '/' :
                return firstNumber / secondNumber;
            case '%' :
                return firstNumber % secondNumber;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
        }
        return result;
    }
}