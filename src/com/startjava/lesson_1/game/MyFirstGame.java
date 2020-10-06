package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int trueNumber = 25;
        int attempt = 5;

        System.out.println(attempt);
        while(attempt != trueNumber) {
            if (attempt < trueNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                attempt += 5;
            } else if (attempt > trueNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                attempt -= 5;
            }
            System.out.println(attempt);
        }
        System.out.println("Вы угадали!");
    }
}