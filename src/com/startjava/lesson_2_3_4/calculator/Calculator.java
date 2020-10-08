package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] task;

    public void mathExpression(String task) {
        this.task = task.split(" ");
    }

    public void calculate() {
        switch (task[1]) {
            case "+" :
                System.out.println(Integer.parseInt(task[0]) + Integer.parseInt(task[2]));
                break;
            case "-" :
                System.out.println(Integer.parseInt(task[0]) - Integer.parseInt(task[2]));
                break;
            case "*" :
                System.out.println(Integer.parseInt(task[0]) * Integer.parseInt(task[2]));
                break;
            case "/" :
                System.out.println(Double.parseDouble(task[0]) / Double.parseDouble(task[2]));
                break;
            case "%" :
                System.out.println(Integer.parseInt(task[0]) % Integer.parseInt(task[2]));
                break;
            case "^" : //возвращает число a, возведенное в степень b
                System.out.println(Math.pow(Integer.parseInt(task[0]), Integer.parseInt(task[2])));
                break;
            case "fd" : //возвращает целочисленный результат деления a на b
                System.out.println(Math.floorDiv(Integer.parseInt(task[0]), Integer.parseInt(task[2])));
                break;
            case "cbrt" : //возвращает кубический корень числа
                System.out.println(Math.cbrt(Double.parseDouble(task[0])));
                break;
            case "deg" : //переводит радианы в градусы
                System.out.println(Math.toDegrees(Double.parseDouble(task[0])));
                break;
            case "radians" : //переводит градусы в радианы
                System.out.println(Math.toRadians(Double.parseDouble(task[0])));
                break;
            case "cos" : //cos возвращает косинус угла
                System.out.println(Math.cos(Double.parseDouble(task[0])));
                break;
            case "radius" : //вычислим площадь круга:
                System.out.println(Math.round(Math.PI * Math.pow(Integer.parseInt(task[0]), Integer.parseInt(task[2]))));
        }


    }
}
