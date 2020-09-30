public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2f);
        crimsonTyphoon.setWeight(1.722f);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

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

        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

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