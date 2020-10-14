package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private Random random = new Random();
    private int hiddenNumber = random.nextInt(101);
    Scanner scanner = new Scanner(System.in);
    private static final int COUNT_ATTEMPT = 10;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            int number;

            for(int j = 0; j < players.length; j++) {
                System.out.println("Игрок " + players[j].getName() + " введите число. У вас осталось попыток: " + (COUNT_ATTEMPT - i));
                number = scanner.nextInt();
                players[j].setNumber(number);
                if (checkNumber(number)) {
                    System.out.println("Игрок " + players[j].getName() + " угадал число " + number + " с " + (i + 1) + " попытки");
                    showEnteredNumber();
                    clearEnteredNumber();
                    return;
                }
                if (i == 9) {
                    System.out.println("У игрока " + players[j].getName() + " закончились попытки");
                }
            }
        }
        showEnteredNumber();
        clearEnteredNumber();
    }

    private boolean checkNumber(int number) {
        if (hiddenNumber == number) {
            return true;
        }
        System.out.println("Введенное вами число " + number + (hiddenNumber > number ? " меньше" : " больше") + " того, что загадал компьютер");
        return false;
    }

    private void showEnteredNumber() {
        for (Player player : players) {
               System.out.print("Числa, введенные игроком " + player.getName() + ": ");
            for (int number : player.getAttempts()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void clearEnteredNumber() {
        for (Player player : players) {
            player.clear();
        }
    }
}