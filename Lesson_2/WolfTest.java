public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("самец");
        wolf.setName("Акела");
        wolf.setWeight(55);
        wolf.setAge(8);
        wolf.setColor("серый");

        System.out.println("Моё имя " + wolf.getName());
        System.out.println("Я " + wolf.getGender());
        System.out.println("Я вешу " + wolf.getWeight() + " кг");
        System.out.println("Мне " + wolf.getAge() + " лет");
        System.out.println("Цвет моей шерсти - " + wolf.getColor());

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}