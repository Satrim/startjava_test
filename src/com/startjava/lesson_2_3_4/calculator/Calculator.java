package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] splitExpression;

    public void mathExpression(String expression) {
        splitExpression = expression.split(" ");
    }

    public String calculate() {
        switch (splitExpression[1]) {
            case "+" :
                return String.valueOf(Integer.parseInt(splitExpression[0]) + Integer.parseInt(splitExpression[2]));
            case "-" :
                return String.valueOf(Integer.parseInt(splitExpression[0]) - Integer.parseInt(splitExpression[2]));
            case "*" :
                return String.valueOf(Integer.parseInt(splitExpression[0]) * Integer.parseInt(splitExpression[2]));
            case "/" :
                return String.valueOf(Double.parseDouble(splitExpression[0]) / Double.parseDouble(splitExpression[2]));
            case "%" :
                return String.valueOf(Integer.parseInt(splitExpression[0]) % Integer.parseInt(splitExpression[2]));
            case "^" : //число a возводит в степень b
                return String.valueOf(Math.pow(Integer.parseInt(splitExpression[0]), Integer.parseInt(splitExpression[2])));
            case "fd" : //целочисленный результат деления a на b
                return String.valueOf(Math.floorDiv(Integer.parseInt(splitExpression[0]), Integer.parseInt(splitExpression[2])));
            case "cbrt" : //кубический корень числа
                return String.valueOf(Math.cbrt(Double.parseDouble(splitExpression[0])));
            case "deg" : //радианы в градусы
                return String.valueOf(Math.toDegrees(Double.parseDouble(splitExpression[0])));
            case "radians" : //градусы в радианы
                return String.valueOf(Math.toRadians(Double.parseDouble(splitExpression[0])));
            case "cos" : //косинус угла
                return String.valueOf(Math.cos(Double.parseDouble(splitExpression[0])));
            case "radius" : //площадь круга:
                return String.valueOf(Math.round(Math.PI * Math.pow(Integer.parseInt(splitExpression[0]), Integer.parseInt(splitExpression[2]))));
        }
        return null;
    }
}
