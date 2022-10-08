package com.main.second;

public class Author {
    public static final String ANSI_BLACK = "\u001B[30m";
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(ANSI_BLACK + this.name);
    }
}
