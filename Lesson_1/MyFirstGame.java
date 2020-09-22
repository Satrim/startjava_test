public class MyFirstGame {
    public static void main (String[] args) {
        int trueNumber = 5;
        int attempt = 8;
        if (attempt < trueNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (attempt > trueNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (attempt == trueNumber) {
            System.out.println("Вы угадали!");
        }
    }
}