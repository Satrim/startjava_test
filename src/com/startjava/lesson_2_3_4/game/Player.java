package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts(int index) {
        return Arrays.copyOf(attempts, index);
    }

    public void clear(int index) {
        Arrays.fill(attempts, 0, index, 0);
    }

    public void setNumber(int number, int index) {
        attempts[index] = number;
    }
}