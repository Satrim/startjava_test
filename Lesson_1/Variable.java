public class Variable {
    public static void main(String[] args) {
        byte core = 2;
        short hdd = 1000;
        int videoRam = 8000;
        long ram = 32536;
        float speedGpu = 1036;
        double speedCpu = 2.5;
        char name = 'A';
        boolean isWork = true;

        System.out.println("Количество ядер - " + core);
        System.out.println("Частота процессора - " + speedCpu);
        System.out.println("Оперативная память - " + ram);
        System.out.println("Частота графического процессора - " + speedGpu);
        System.out.println("Видео память - " + videoRam);
        System.out.println("Объем жесткого диска - " + hdd);
        System.out.println("Name " + name);
        System.out.println("Рабочее состояние - " + isWork);
    }
}