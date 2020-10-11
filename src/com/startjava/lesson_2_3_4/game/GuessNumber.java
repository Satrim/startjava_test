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
                System.out.println("Игрок " + players[j].getName() + " введите число. У вас осталось попыток: " + (10 - i));
                number = scanner.nextInt();
                if (checkNumber(number)) {
                    System.out.println("Игрок " + players[j].getName() + " угадал число " + number + " с " + (i + 1) + " попытки");
                    clearEnteredNums(i);
                    return;
                } else {
                    players[j].setNumber(number, i);
                    if (i == 9) {
                        System.out.println("У игрока " + players[j].getName() + " закончились попытки");
                    }
                }
            }
        }
        showEnteredNums();
        clearEnteredNums(10);
    }

    private boolean checkNumber(int number) {
        boolean isGuess = false;
        if (hiddenNumber == number) {
            return true;
        }
        System.out.println(hiddenNumber > number ? "Введенное вами число " + number + " меньше того, что загадал компьютер" :
                "Введенное вами число " + number + " больше того, что загадал компьютер");
        return isGuess;
    }

    private void showEnteredNums() {
        for (Player player : players) {
            System.out.print("Числa введенные игроком " + player.getName() + ": ");
            for (int number : player.getAttempts()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void clearEnteredNums(int index) {
        for (Player player : players) {
            player.clear(index);
        }
    }
}