package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);

        System.out.println("Китай. Провинция Юнь Нань. Рисовые поля.");
        System.out.println("Докладывает комантдир боевой еденици Cheung Wei. Боевая еденица " + crimsonTyphoon.getModelName() + " в полной боевой готовности");
        System.out.println("Запись в журнал БМ " + crimsonTyphoon.getModelName());
        System.out.println("Главный двигатель: " + crimsonTyphoon.getMark());
        System.out.println("Страна производитель: " + crimsonTyphoon.getOrigin());
        System.out.println("Вес БМ: " + crimsonTyphoon.getWeight());
        System.out.println("Высота БМ: " + crimsonTyphoon.getHeight());
        System.out.println("Максимальная скорость БМ: " + crimsonTyphoon.getSpeed());
        System.out.println("Сила удара маваши: " + crimsonTyphoon.getStrength());
        System.out.println("Сила импульсного разряда: " + crimsonTyphoon.getArmor());

        crimsonTyphoon.move();
        System.out.println(crimsonTyphoon.scanKaiju());
        crimsonTyphoon.useVortexCannon();

        Jaeger gipsyDanger = new Jaeger("Gipsy Dander", "Mark-3", "United States of America", 79.25f, 1.980f, 7, 8, 6);

        System.out.println("====================");
        System.out.println();
        System.out.println("Тем временем. США. Штат Оклахома");
        System.out.println("Комантдир Yancy Becket у аппарата. Боевая еденица " + crimsonTyphoon.getModelName() + " готова к ходовым испытаниям на спецполигоне");
        System.out.println("Запись в журнал БМ " + crimsonTyphoon.getModelName());
        System.out.println("Главный двигатель: " + crimsonTyphoon.getMark() + " в рабочем состоянии");
        System.out.println("Страна производитель: " + crimsonTyphoon.getOrigin());
        System.out.println("Вес БМ: " + crimsonTyphoon.getWeight());
        System.out.println("Высота БМ: " + crimsonTyphoon.getHeight());
        System.out.println("Максимальная скорость БМ: " + crimsonTyphoon.getSpeed());
        System.out.println("Сила удара: " + crimsonTyphoon.getStrength());
        System.out.println("Сила плазменного разряда: " + crimsonTyphoon.getArmor());

        gipsyDanger.move();
        System.out.println(gipsyDanger.scanKaiju());
        gipsyDanger.useVortexCannon();
    }
}