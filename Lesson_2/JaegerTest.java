public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Cromson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2);
        crimsonTyphoon.setWeight(1.722);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

        System.out.println("Докладывает комантдир боевой еденици Cheung Wei. Боевая еденица " + crimsonTyphoon.getModelName() + " в полной боевой готовности");
        System.out.println("Запись в журнал БМ " + crimsonTyphoon.getModelName());
        System.out.println("Главный двигатель: " + crimsonTyphoon.пetMark());
        System.out.println("Страна производитель: " + crimsonTyphoon.getOrigin());
        Sysyem.out.println("Вес БМ: " + crimsonTyphoon.getWeight());
        
    }
}