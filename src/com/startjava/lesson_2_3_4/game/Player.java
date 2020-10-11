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

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, 10);
    }

    public void clear(int index) {
        Arrays.fill(attempts, 0, index, 0);
    }

    public void setNumber(int number, int index) {
        attempts[index] = number;
    }

//    public int finalNumber() {
//        return attempts[attempts.length - 1];
//    }

}