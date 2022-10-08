package com.main.second;

public class Title {

    public static final String ANSI_RED = "\u001B[31m";
    private final String name;

    public Title(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(ANSI_RED + this.name);
    }
}
