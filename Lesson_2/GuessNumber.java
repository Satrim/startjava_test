import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int number;
    private Player player1;
    private Player player2;
    private Random random = new Random();
    private int hiddenNumber = random.nextInt(101);
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        while(true) {
            System.out.println("Игрок " + player1.getName() + " введите число");
            number = scanner.nextInt();
            if (number == hiddenNumber) {
                System.out.println("И победитель в нашей игре - " + player1.getName() + "!!! Поздравляем победителя!");
                break;
            } else if (number > hiddenNumber) System.out.println("Введенное вами число " + number + " больше того, что загадал компьютер");
            else if (number < hiddenNumber) System.out.println("Введенное вами число " + number + " меньше того, что загадал компьютер");

            System.out.println("Игрок " + player2.getName() + " введите число");
            number = scanner.nextInt();
            if (number == hiddenNumber) {
                System.out.println("И победитель в нашей игре - " + player2.getName() + "!!! Поздравляем победителя!");
                break;
            } else if (number > hiddenNumber) System.out.println("Введенное вами число " + number + " больше того, что загадал компьютер");
            else if (number < hiddenNumber) System.out.println("Введенное вами число " + number + " меньше того, что загадал компьютер");
        }
    }

}