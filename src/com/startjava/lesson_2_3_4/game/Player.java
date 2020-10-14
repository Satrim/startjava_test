package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int numberAttempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberAttempt);
    }

    public void setNumber(int number) {
        attempts[numberAttempt] = number;
        numberAttempt++;
    }

    public void clear() {
        Arrays.fill(attempts, 0, numberAttempt, 0);
        numberAttempt = 0;
    }
}