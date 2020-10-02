import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Первый игрок, введите свое имя:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Второй игрок, введите свое имя:");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("Поприветствуем игроков, начнем игру!");

        String answer = "";
        while(!answer.equals("нет")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.run();
            while(!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Ещё раз? [да][нет]");
                answer = scanner.next();
            }
        }
    }
}