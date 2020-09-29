public class Wolf {
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
        else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Я умею ходить");
    }

    public void sit() {
        System.out.println("Я умею сидеть");
    }

    public void run() {
        System.out.println("Я умею бегать");
    }

    public void howl() {
        System.out.println("Я могу выть");
    }

    public void hunt() {
        System.out.println("Я умею охотиться");
    }
}