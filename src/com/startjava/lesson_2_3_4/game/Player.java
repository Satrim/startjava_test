package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    void clear(int index) {
        Arrays.fill(attempts, 0, index, 0);
    }

    void putNumber(int number, int index) {
        attempts[index] = number;
    }

    public int[] getAttempts() {
        return attempts;
    }

    public String getName() {
        return name;
    }

}