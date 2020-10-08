package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}