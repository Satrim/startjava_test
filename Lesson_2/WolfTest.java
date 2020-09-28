public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "самец";
        wolf.name = "Акела";
        wolf.weight = 55;
        wolf.age = 8;
        wolf.color = "серый";

        System.out.println("Моё имя " + wolf.name);
        System.out.println("Я " + wolf.gender);
        System.out.println("Я вешу " + wolf.weight + " кг");
        System.out.println("Мне " + wolf.age + " лет");
        System.out.println("Цвет моей шерсти - " + wolf.color);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}