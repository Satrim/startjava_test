public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    void getOrigin() {
        return origin;
    }

    public setHeight(float height) {
        this.height = height;
    }

    void getHeight() {
        return height;
    }

    public setWeight(float weight) {
        this.weight = weight;
    }

    void getWeight() {
        return weight;
    }

    public setSpeed(int speed) {
        this.speed = speed;
    }

    void getSpeed() {
        return speed;
    }

    public setStrength(int strength) {
        this.strength = strength;
    }

    void getStrength() {
        return strength;
    }

    public setArmor(int armor) {
        this.armor = armor;
    }

    void getArmor() {
        return armor;
    }

    public boolean drift() {
        if (driftSpeed < 5) {
            return false;
        } else {
            return true;
        }
    }

    public void move() {
        System.out.println("Меняю позицию. Зачем я залез в эту адскую машину, я даже на своих старых жигулях не умею ездить назад");
    }

    public String scanKaiju() {
        return "Сканирую локацию на выявления врагов. Надеюсь я правильно применяю этото метод. Вернусь на базу, почитаю инструкцию";
    }

    public void useVortexCannon() {
        System.out.println("Произвожу предупредительный выстрел в воздух");
    }


}