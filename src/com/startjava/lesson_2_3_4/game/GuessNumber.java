package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private Random random = new Random();
    private int hiddenNumber = random.nextInt(101);
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            int number;

            for(int j = 0; j < players.length; j++) {
                System.out.println("Игрок " + players[j].getName() + " введите номер. У вас " + (10 - i) + " попыток");
                number = scanner.nextInt();
                if (checkNumber(number)) {
                    System.out.println("Игрок " + players[j].getName() + " угадал число " + number + " с " + (i + 1) + " попытки");
                    clearArrayOfAttempt(players, i);
                    return;
                } else {
                    players[j].putNumber(number, i);
                    if (i == 9) {
                        System.out.println("У игрока " + players[j].getName() + " закончились попытки");
                    }
                }
            }
        }
        printArrayOfAttempts();
        clearArrayOfAttempt(players, 10);
    }

    private boolean checkNumber(int number) {
        boolean isNumber = false;
        if (hiddenNumber > number) {
            System.out.println("Введенное вами число " + number + " меньше того, что загадал компьютер");
        } else if (hiddenNumber < number) {
            System.out.println("Введенное вами число " + number + " больше того, что загадал компьютер");
        } else {
            isNumber = true;
        }
        return isNumber;
    }

    private void printArrayOfAttempts() {
        for (Player player : players) {
            System.out.print("Номера введенные игроком " + player.getName() + ": ");
            for (Integer numbers : player.getAttempts()) {
                System.out.print(numbers + " ");
            }
            System.out.println();
        }
    }

    public void clearArrayOfAttempt(Player[] players, int index) {
        for (Player player : players) {
            player.clearAttempts(index);
        }
    }
}