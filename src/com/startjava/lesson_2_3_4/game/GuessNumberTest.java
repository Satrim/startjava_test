package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добро пожаловать в игру \"Угадай число\". Введите количество игроков: ");
        Player[] players = new Player[scanner.nextInt()];

        for (int i = 0; i < players.length; i++) {
            players[i] = createPlayer(i);
        }

        String answer = "да";

        do {
            GuessNumber game = new GuessNumber(players);
            game.run();

            do {
                System.out.println("Ещё раз? [да/нет]: ");
                answer = scanner.next();
            } while(!answer.equals("да") && !answer.equals("нет"));
        } while(answer.equals("да"));
    }

    private static Player createPlayer(int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Игрок " + (i + 1) + " введите свое имя: ");
        return new Player(scanner.nextLine());
    }
}