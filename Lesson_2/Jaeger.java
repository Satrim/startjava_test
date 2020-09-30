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

    public String getOrigin() {
        return origin;
    }

    void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        if (speed < 5) {
            return false;
        } else {
            return true;
        }
    }

    public void move() {
        System.out.println("Меняю позицию.");
    }

    public String scanKaiju() {
        return "Сканирую локацию на выявления врагов.";
    }

    public void useVortexCannon() {
        System.out.println("Произвожу предупредительный выстрел в воздух.");
    }


}