import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Первый игрок, введите свое имя:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Второй игрок, введите свое имя:");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("Поприветствуем игроков, начнем игру!");
        
        GuessNumber guessNumberGame;
        String answer = "";
        while(!answer.equals("нет")) {
        	guessNumberGame = new GuessNumber(player1, player2);
            guessNumberGame.checkNumber();
            answer = "";
    	    while(!answer.equals("да") && !answer.equals("нет")) {
    	        System.out.println("Ещё раз? [да][нет]");
    	        answer = scanner.next();
    	    }
    	}
    }
}