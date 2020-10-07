package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "да";

        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scan.nextInt());
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}