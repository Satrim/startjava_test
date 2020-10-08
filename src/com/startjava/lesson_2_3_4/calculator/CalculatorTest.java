package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "да";
        System.out.println("Математические операции: ");
        System.out.println(
                "    " + "\"+\" - сложение (a + b)\r\n" +
                        "    " + "\"-\" - вычетание (a - b)\r\n" +
                        "    " + "\"*\" - умножение (a * b)\r\n" +
                        "    " + "\"/\" - деление (a / b)\r\n" +
                        "    " + "\"^\" -  возвести число a в степень b (a ^ b)\r\n" +
                        "    " + "\"fd\" - целочисленный результат деления a на b (a fd b)\r\n" +
                        "    " + "\"cbrt\" - кубический корень числа (a cbrt)\r\n"  +
                        "    " + "\"deg\" - радианы в градусы (a deg)\r\n" +
                        "    " + "\"radians\" - градусы в радианы (a radians)\r\n" +
                        "    " + "\"cos\" - косинус угла (a cos)\r\n" +
                        "    " + "\"radius\" - площадь круга (a radius b)");
        while (answer.equals("да")) {

            System.out.print("Введите математическое выражение: ");
            calculator.mathExpression(scanner.nextLine());
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
                scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
