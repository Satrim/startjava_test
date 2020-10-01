import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int number;
    private Player player1;
    private Player player2;
    private Random random = new Random();
    private int trueNumber = random.nextInt(100);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scanner = new Scanner(System.in);

    void checkNumber() {
        while(true) {
            System.out.println("Игрок " + player1.getName() + " введите число");
            number = scanner.nextInt();
            if (equalNumber().equals("true")) {
                System.out.println("И победитель в нашей игре - " + player1.getName() + "!!! Поздравляем победителя!");
                break;
            } else System.out.println(equalNumber());

            System.out.println("Игрок " + player2.getName() + " введите число");
            number = scanner.nextInt();
            if (equalNumber().equals("true")) {
                System.out.println("И победитель в нашей игре - " + player2.getName() + "!!! Поздравляем победителя!");
                break;
            } else System.out.println(equalNumber());
        }
    }

    private String equalNumber() {
        if (trueNumber > number) {
            return "Введенное вами число " + number + " меньше того, что загадал компьютер";
        } else if (trueNumber < number) {
            return "Введенное вами число " + number + " больше того, что загадал компьютер";
        } else return "true";
    }

}